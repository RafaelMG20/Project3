package com.company;


import alg.TypeChecker;
import alg.alg;
import alg.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Main {

        public static void main(String[] args) {
                try {
                        algLexer simpleLexer = new algLexer(CharStreams.fromFileName("example.sim"));
                        alg simpleParser = new alg(new CommonTokenStream(simpleLexer));
                        ParseTree tree = simpleParser.programa();
                        System.out.println("Análise de Parser Finalizada :)");

                        // create a standard ANTLR parse tree walker
                        ParseTreeWalker walker = new ParseTreeWalker();
                        // create listener then feed to walker
                        System.out.println("Analisando ... ");
                        TypeChecker listener = new TypeChecker();
                        walker.walk(listener, tree);

                        if(listener.semanticErrors > 0)
                        {
                                System.out.println(listener.semanticErrors + " Erros semânticos encontrados. Processo de compilação interrompido :(");
                                System.exit(1);
                        }

                        System.out.println("SEM ERROS SEMÂNTICOS :D");

                }
                catch(IOException e)
                {
                        e.printStackTrace();
                }
        }
}
