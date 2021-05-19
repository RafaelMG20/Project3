package alg;

import Symbols.FunctionSymbol;
import Symbols.Scope;
import Symbols.Symbol;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.PrintStream;

public class TypeChecker extends algBaseListener {

    public Scope globalScope;
    public Scope currentScope;
    private FunctionSymbol currentFunction;
    public int semanticErrors;


    public ParseTreeProperty<Symbol.PType> exprType = new ParseTreeProperty<>();

    public ParseTreeProperty<Scope> scopes = new ParseTreeProperty<>();


    //métodos auxiliar (é usado em 2 regras gramaticais)
    private boolean defineSymbol(ParserRuleContext ctx, Symbol s)
    {
        if(this.globalScope != this.currentScope)
        {
            Symbol temp = this.globalScope.resolve(s.name);
            if(!this.globalScope.define(s))
            {

                System.err.println("Redefining previously defined variable " + s.name + " in line " + ctx.start.getLine());
                ++this.semanticErrors;
                return false;
            }
            if(this.globalScope.containsName(s.name))
            {
                if(temp !=null)
                {
                    if(temp instanceof FunctionSymbol)
                    {
                        System.err.println("A variavel " + s.name + " na linha " + ctx.start.getLine() + " é uma função");
                        ++this.semanticErrors;
                        return false;
                    }
                    if(!temp.type.equals(s.type))
                    {
                        System.err.println("A variavel " + s.name + " na linha " + ctx.start.getLine() + " é do tipo " + temp.type);
                        ++this.semanticErrors;
                        return false;
                    }
                }

            }

        }
        if(this.currentScope.containsName(s.name))
        {
            Symbol temp = this.globalScope.resolve(s.name);
            if(temp !=null)
            {
                if(!temp.type.equals(s.type))
                {
                    System.err.println("A variavel " + s.name + " na linha " + ctx.start.getLine() + " é do tipo " + temp.type);
                    ++this.semanticErrors;
                    return false;
                }
            }
        }
        if (!this.currentScope.define(s)) {
            Symbol temp = this.currentScope.resolve(s.name);
            if(temp instanceof FunctionSymbol)
            {
                System.err.println("A variavel " + s.name + " na linha " + ctx.start.getLine() + " é uma função");
                ++this.semanticErrors;
                return false;
            }

            else{
                String var10001 = s.name;
            System.err.println("Redefining previously defined variable " + var10001 + " in line " + ctx.start.getLine());
            ++this.semanticErrors;
            return false;
            }
        } else {
            //this.exprType.put(ctx, s.type);
            return true;
        }
    }

    public void enterPrograma(alg.ProgramaContext ctx)
    {
        globalScope = new Scope(null);
        this.currentScope = globalScope;
        this.semanticErrors = 0;
    }
    public void exitPrograma(alg.ProgramaContext ctx) {//System.out.println(this.currentScope.toString());
        }
    public void enterFcall(alg.FcallContext ctx) { }
    public void exitFcall(alg.FcallContext ctx) { }
    public void enterFloat(alg.FloatContext ctx) { }
    public void exitFloat(alg.FloatContext ctx)
    {exprType.put(ctx, Symbol.PType.FLOAT); }
    public void enterParenteses(alg.ParentesesContext ctx) { }
    public void exitParenteses(alg.ParentesesContext ctx) { }
    public void enterMulDiv(alg.MulDivContext ctx) { }

    public void exitMulDiv(alg.MulDivContext ctx) {
        Symbol.PType e1 = (Symbol.PType)this.exprType.get(ctx.expr(0));
        Symbol.PType e2 = (Symbol.PType)this.exprType.get(ctx.expr(1));
        String operator = ((ParseTree)ctx.children.get(1)).getText();
        this.verifyPrimitiveArithmeticOperator(ctx, operator, e1, e2);
    }
    public void enterAddSub(alg.AddSubContext ctx) { }

    public void exitAddSub(alg.AddSubContext ctx) {
        Symbol.PType e1 = (Symbol.PType)this.exprType.get(ctx.expr(0));
        Symbol.PType e2 = (Symbol.PType)this.exprType.get(ctx.expr(1));
        String operator = ((ParseTree)ctx.children.get(1)).getText();
        this.verifyPrimitiveArithmeticOperator(ctx, operator, e1, e2);
    }

    public void enterVar(alg.VarContext ctx) { }

    public void exitVar(alg.VarContext ctx)
    {
        Symbol s = this.currentScope.resolve(ctx.IDENT().getText());
        if(s!=null)
            this.exprType.put(ctx,s.type);
        else
        {
            this.exprType.put(ctx, Symbol.PType.ERROR);
            System.err.println("A variável " + ctx.IDENT().getText() + " na linha " + ctx.start.getLine() + " não está definida");
            ++this.semanticErrors;
        }
    }
    public void enterFuncInv(alg.FuncInvContext ctx) { }

    public void exitFuncInv(alg.FuncInvContext ctx)
    {

    }

    public void enterPointer(alg.PointerContext ctx) { }

    public void exitPointer(alg.PointerContext ctx)
    {

    }

    public void enterInt(alg.IntContext ctx) { }

    public void exitInt(alg.IntContext ctx) {
        exprType.put(ctx, Symbol.PType.INT);
    }
    public void enterParen(alg.ParenContext ctx) { }


    public void exitParen(alg.ParenContext ctx) {
        Symbol.PType e1 = (Symbol.PType)this.exprType.get(ctx.expr().getChild(0));
        Symbol.PType e2 = (Symbol.PType)this.exprType.get(ctx.expr().getChild(2));
        String operator = ((ParseTree)ctx.expr().children.get(1)).getText();
        this.verifyPrimitiveArithmeticOperator(ctx, operator, e1, e2);
    }

    public void enterIdentifier(alg.IdentifierContext ctx) { }

    public void exitIdentifier(alg.IdentifierContext ctx)
    {

        Symbol.PType e1 = (Symbol.PType)this.exprType.get(ctx.ide().getChild(1));
        exprType.put(ctx, e1);
    }

    public void enterPointIndex(alg.PointIndexContext ctx) { }

    public void exitPointIndex(alg.PointIndexContext ctx)
    {
        Symbol.PType e1 = (Symbol.PType)this.exprType.get(ctx.expr(0));
        Symbol.PType e2 = (Symbol.PType)this.exprType.get(ctx.expr(1));
        String operator1 = ((ParseTree)ctx.INDEX_POINT_L()).getText();
        String operator2 = ((ParseTree)ctx.INDEX_POINT_R()).getText();
        this.verifyIndexPointer(ctx, operator1, operator2, e1, e2);

    }

    public void enterIdBoolPoint(alg.IdBoolPointContext ctx) { }

    public void exitIdBoolPoint(alg.IdBoolPointContext ctx)
    {
        String name = ctx.idy().IDENT().getText();
            Symbol s = this.currentScope.resolve(name);
            if (s == null) {
                System.err.println("A variavel " + name + " na linha " + ctx.start.getLine() + " não está definida");
                ++this.semanticErrors;
                exprType.put(ctx, Symbol.PType.ERROR);
                return;
            } else {
                if(ctx.idy().IDEY().getText().equals("~")) {
                if (!s.type.equals(Symbol.PType.BOOL)) {
                    System.err.println("A variavel " + name + " na linha " + ctx.start.getLine() + " deve ser do tipo Bool");
                    ++this.semanticErrors;
                    exprType.put(ctx, Symbol.PType.ERROR);
                }
                else
                    exprType.put(ctx, s.type);
                }

                if(ctx.idy().getChild(0).getText().equals("?") && ctx.idy().IDENT() != null)
                {
                    if(s.type.equals(Symbol.PType.PINT) || s.type.equals(Symbol.PType.PSTRING) || s.type.equals(Symbol.PType.PFLOAT))
                    {
                        System.err.println("A variavel " + name + " na linha " + ctx.start.getLine() + " é do tipo " + s.type);
                        exprType.put(ctx, Symbol.PType.ERROR);
                        ++this.semanticErrors;
                    }

                    else
                        exprType.put(ctx, s.type);
                }
            }

    }

    public void enterEquals(alg.EqualsContext ctx) { }
    public void exitEquals(alg.EqualsContext ctx) { }

    public void enterInteiro(alg.InteiroContext ctx)
    {

    }

    public void exitInteiro(alg.InteiroContext ctx)
    {
        exprType.put(ctx, Symbol.PType.INT);
    }
    public void enterInteiros(alg.InteirosContext ctx) { }
    public void exitInteiros(alg.InteirosContext ctx)
    {
       int i = 0;
        while(ctx.IDENT().get(i).getSymbol() != null) {
            exprType.put(ctx.IDENT().get(i), Symbol.PType.INT);
            i++;
        }
    }
    public void enterBooleano(alg.BooleanoContext ctx) { }
    public void exitBooleano(alg.BooleanoContext ctx) { }
    public void enterBooleanos(alg.BooleanosContext ctx) { }
    public void exitBooleanos(alg.BooleanosContext ctx) { }
    public void enterReal(alg.RealContext ctx) { }
    public void exitReal(alg.RealContext ctx)
    {
        exprType.put(ctx, Symbol.PType.FLOAT);
    }
    public void enterReais(alg.ReaisContext ctx) { }
    public void exitReais(alg.ReaisContext ctx) {
        int i = 0;
        while(ctx.IDENT().get(i).getSymbol() != null) {
            exprType.put(ctx.IDENT().get(i), Symbol.PType.FLOAT);
            i++;
        }
    }
    public void enterEquals_string(alg.Equals_stringContext ctx) { }
    public void exitEquals_string(alg.Equals_stringContext ctx) { }
    public void enterCadeia_caracteres(alg.Cadeia_caracteresContext ctx) { }

    public void exitCadeia_caracteres(alg.Cadeia_caracteresContext ctx)
    {
        if(ctx.equals_string().CADEIA_CARACTERES() == null)
        {
            Symbol s = this.currentScope.resolve(ctx.IDENT(0).getText());
            if(s != null) // entra se houver um simbolo s com esse nome
            {
                if(s.type.equals(Symbol.PType.STRING)) // entra se o type for string
                {
                    System.err.println("A variável " + ctx.IDENT(0).getText() + " na linha " + ctx.IDENT(0).getSymbol().getLine() + " é do tipo " + s.type);
                    ++this.semanticErrors;
                    return;
                }
            }

           else{ System.err.println("A variável " + ctx.IDENT(0).getText() + " na linha " + ctx.IDENT(0).getSymbol().getLine() + " é do tipo STRING");
            ++this.semanticErrors;}
        }
    }

    public void enterCadeias_caracteres(alg.Cadeias_caracteresContext ctx) { }
    public void exitCadeias_caracteres(alg.Cadeias_caracteresContext ctx) { }
    public void enterPonteiro_inteiro(alg.Ponteiro_inteiroContext ctx) { }

    public void exitPonteiro_inteiro(alg.Ponteiro_inteiroContext ctx) {
     }

    public void enterPonteiro_real(alg.Ponteiro_realContext ctx) { }
    public void exitPonteiro_real(alg.Ponteiro_realContext ctx) { }
    public void enterPonteiro_cadeia(alg.Ponteiro_cadeiaContext ctx) { }
    public void exitPonteiro_cadeia(alg.Ponteiro_cadeiaContext ctx) { }
    public void enterOp_paranteses(alg.Op_parantesesContext ctx) { }
    public void exitOp_paranteses(alg.Op_parantesesContext ctx) { }
    public void enterOp_pointer(alg.Op_pointerContext ctx) { }
    public void exitOp_pointer(alg.Op_pointerContext ctx) { }
    public void enterIde(alg.IdeContext ctx) { }
    public void exitIde(alg.IdeContext ctx) { }
    public void enterComparations(alg.ComparationsContext ctx) { }

    public void exitComparations(alg.ComparationsContext ctx)
    {
        String s = ctx.getChild(1).getText();
        if(s.equals("<") || s.equals(">") || s.equals(">=") || s.equals("<="))
        {

            Symbol.PType e1 = (Symbol.PType)this.exprType.get(ctx.expr(0));
            Symbol.PType e2 = (Symbol.PType)this.exprType.get(ctx.expr(1));
            String operator = ((ParseTree)ctx.children.get(1)).getText();

            this.verifyComparator(ctx, operator, e1, e2);
        }

        else if(s.equals("==") || s.equals("!="))
        {
            Symbol.PType e1 = (Symbol.PType)this.exprType.get(ctx.expr(0));
            Symbol.PType e2 = (Symbol.PType)this.exprType.get(ctx.expr(1));
            String operator = ((ParseTree)ctx.children.get(1)).getText();

            this.verifyEqualDif(ctx, operator, e1, e2);
        }
    }

    public void enterLogics(alg.LogicsContext ctx) { }
    public void exitLogics(alg.LogicsContext ctx) { }
    public void enterExpressions_list(alg.Expressions_listContext ctx) { }
    public void exitExpressions_list(alg.Expressions_listContext ctx) { }
    public void enterExpressions_list2(alg.Expressions_list2Context ctx) { }
    public void exitExpressions_list2(alg.Expressions_list2Context ctx) { }
    public void enterArgs(alg.ArgsContext ctx) { }

    public void exitArgs(alg.ArgsContext ctx)
    {

    }

    public void enterArg(alg.ArgContext ctx) { }

    public void exitArg(alg.ArgContext ctx) {
        if(ctx.type().MENORQ() != null)
        {
            String a = "";
            if(ctx.type().INT() != null)
            {
                    a = "pint";
            }

            else if(ctx.type().FLOAT() != null) {
                    a = "pfloat";
            }
            else if(ctx.type().STRING()!=null) {
                    a = "pstring";
            }

            String name = ctx.IDENT().getText();

            Symbol parameter = new Symbol(a, name);
            if (defineSymbol(ctx, parameter) && this.currentFunction != null) {
                this.currentFunction.arguments.add(parameter);
            }
        }
        else {
            String type = ctx.type().getChild(0).getText();
            String name = ctx.IDENT().getText();

            Symbol parameter = new Symbol(type, name);
            if (defineSymbol(ctx, parameter) && this.currentFunction != null) {
                this.currentFunction.arguments.add(parameter);
            }
        }
    }

    public void enterFunction_declare(alg.Function_declareContext ctx)
    {
        FunctionSymbol f;
        String functionName = ctx.IDENT().getText();
        String type = ctx.type().start.getText();
        f = new FunctionSymbol(type,functionName);
        this.defineSymbol(ctx,f);
        this.currentFunction = f;
        this.currentScope = new Scope(this.currentScope);

    }

    public void exitFunction_declare(alg.Function_declareContext ctx)
    {
        String var10001 = this.currentFunction.name;
        //System.out.println("Local scope for function " + var10001 + ": " + this.currentScope.toString());
        this.currentFunction = null;
        this.currentScope = this.currentScope.getParentScope();
    }
    public void enterBody(alg.BodyContext ctx) { }
    public void exitBody(alg.BodyContext ctx) { }
    public void enterPrologo(alg.PrologoContext ctx) { }
    public void exitPrologo(alg.PrologoContext ctx) { }
    public void enterEpilogo(alg.EpilogoContext ctx) { }
    public void exitEpilogo(alg.EpilogoContext ctx) { }
    public void enterFunction(alg.FunctionContext ctx) { }
    public void exitFunction(alg.FunctionContext ctx) { }

    public void enterFunction_invocate(alg.Function_invocateContext ctx) { }

    public void exitFunction_invocate(alg.Function_invocateContext ctx)
    {
        //FALTA ADICIONAR QUANDO SE PODE METER REAL COMO INTEIRO, OU NULL COMO PONTEIRO)
        String name = ctx.IDENT().getText();
        Symbol s = this.currentScope.resolve(name);
        int countArgs = 0;
        for(int i = 0; i<ctx.getChildCount(); i++)
        {
            if(ctx.getChild(i).getText().equals(","))
                countArgs++;
        }

        if(countArgs > 0)
            countArgs+=1;

        if(s instanceof FunctionSymbol)
        {
            int args = ((FunctionSymbol) s).arguments.size();
            if(args < countArgs)
            {
                System.err.println("A chamada à função " + name + " na linha" + ctx.start.getLine() + " tem poucos argumentos. Faltam " + (countArgs-args));
                ++this.semanticErrors;
                return;
            }
            else if(args > countArgs)
            {
                System.err.println("A chamada à função " + name + " na linha" + ctx.start.getLine() + " tem demasiados argumentos. Retire " + (-(countArgs-args)));
                ++this.semanticErrors;
                return;
            }


            else
            {
                int temporary = this.semanticErrors;
                int z = 0;
                for (int i = 2; i<ctx.getChildCount()-1; i+=2)
                {
                    String temp = ctx.getChild(i).getChild(0).getText();
                    Symbol name2 = this.currentScope.resolve(temp);
                    if(name2 != null)
                    {
                        if(name2.type.equals(Symbol.PType.INT)||name2.type.equals(Symbol.PType.FLOAT))
                        {
                            if(!((FunctionSymbol) s).arguments.get(z).type.equals(Symbol.PType.INT) && !((FunctionSymbol) s).arguments.get(z).type.equals(Symbol.PType.FLOAT) )
                            {

                                System.err.println("A variavel " + name2.name + " na linha " + ctx.start.getLine() + " deve ser do tipo " + ((FunctionSymbol) s).arguments.get(z).type );
                                ++this.semanticErrors;
                            }
                        }

                        else if(name2.type.equals(Symbol.PType.PNULL))
                        {
                            System.out.println("pnull " + ((FunctionSymbol) s).arguments.get(z).type);
                            if(!((FunctionSymbol) s).arguments.get(z).type.equals(Symbol.PType.PSTRING) && !((FunctionSymbol) s).arguments.get(z).type.equals(Symbol.PType.PFLOAT) && !((FunctionSymbol) s).arguments.get(z).type.equals(Symbol.PType.PINT) )
                            {

                                System.err.println("A variavel " + name2.name + " na linha " + ctx.start.getLine() + " deve ser do tipo " + ((FunctionSymbol) s).arguments.get(z).type );
                                ++this.semanticErrors;
                            }
                        }
                        else if(!name2.type.equals(((FunctionSymbol) s).arguments.get(z).type))
                        {

                            System.err.println("A variavel " + name2.name + " na linha " + ctx.start.getLine() + " deve ser do tipo " + ((FunctionSymbol) s).arguments.get(z).type );
                            ++this.semanticErrors;
                        }
                    }
                    z++;
                }
               if(temporary == this.semanticErrors)
                   this.exprType.put(ctx,s.type);
            }

        }
        else if(s==null)
        {
            System.err.println("Undefined function " + name + " in line " + ctx.IDENT().getSymbol().getLine() + " position " + ctx.IDENT().getSymbol().getCharPositionInLine());
            ++this.semanticErrors;
            //exprType.put(ctx,Symbol.PType.ERROR);
            this.exprType.put(ctx, Symbol.PType.ERROR);
        }

        else if(!(s instanceof FunctionSymbol))
        {
            System.err.println("Using variable " + name + " as function in line " + ctx.IDENT().getSymbol().getLine());
            ++this.semanticErrors;
            this.exprType.put(ctx, Symbol.PType.ERROR);
        }


    }

    public void enterCtrl_instruct(alg.Ctrl_instructContext ctx) { }
    public void exitCtrl_instruct(alg.Ctrl_instructContext ctx) { }
    public void enterAttributes(alg.AttributesContext ctx) { }
    public void exitAttributes(alg.AttributesContext ctx) { }
    public void enterInstructions(alg.InstructionsContext ctx) { }

    public void exitInstructions(alg.InstructionsContext ctx) {
        if(ctx.attributes() != null)
        {
            String variableName = ctx.attributes().IDENT().getText();

            Symbol s = this.currentScope.resolve(variableName);

            if(s==null)
            {
                System.err.println("Undefined variable " + variableName + " in line " + ctx.attributes().IDENT().getSymbol().getLine() + " position " + ctx.attributes().IDENT().getSymbol().getCharPositionInLine());
                ++this.semanticErrors;
                this.exprType.put(ctx, Symbol.PType.ERROR);
            }

            else if(s instanceof FunctionSymbol)
            {
                System.err.println("Using function symbol " + variableName + " as variable in line " + ctx.attributes().IDENT().getSymbol().getLine());
                ++this.semanticErrors;
                this.exprType.put(ctx, Symbol.PType.ERROR);
            }

            else
                exprType.put(ctx,s.type);
        }
    }
    public void enterIf_cond(alg.If_condContext ctx) { }

    public void exitIf_cond(alg.If_condContext ctx)
    {
        int count = ctx.getChildCount();
        if(ctx.ELSE() != null)
            count -=6;
        else
            count-=4;
        if(ctx.E_LOGICO()!=null||ctx.OU_LOGICO()!=null) {
            for (int i = 3; i < count; i += 2) {
                Symbol.PType e1 = (Symbol.PType) this.exprType.get(ctx.getChild(i - 1));
                Symbol.PType e2 = (Symbol.PType) this.exprType.get(ctx.getChild(i + 1));
                String operator = ((ParseTree) ctx.children.get(i)).getText();
                //System.out.println(operator);

                this.verifyLogicals(ctx, operator, e1, e2);
            }
        }
    }

    public void enterLoop(alg.LoopContext ctx) { }
    public void exitLoop(alg.LoopContext ctx) { }
    public void enterSub_block(alg.Sub_blockContext ctx) { }
    public void exitSub_block(alg.Sub_blockContext ctx) { }
    public void enterVariable(alg.VariableContext ctx) { }

    public void exitVariable(alg.VariableContext ctx)
    {
        if(ctx.inteiro() != null)
        {
            if(ctx.inteiro().INDEX_POINT_L() != null)
            {
                Symbol s1 = this.currentScope.resolve(ctx.inteiro().getChild(0).getText());
                Symbol s2 = this.currentScope.resolve(ctx.inteiro().getChild(2).getText());
                Symbol.PType e1 = s1.type;
                Symbol.PType e2;
                if(s2 != null)
                {
                    e2 = s2.type;
                }
                else
                    e2 = (Symbol.PType)this.exprType.get(ctx.inteiro().getChild(2));
                String operator1 = ((ParseTree)ctx.inteiro().INDEX_POINT_L()).getText();
                String operator2 = ((ParseTree)ctx.inteiro().INDEX_POINT_R()).getText();
                this.verifyIndexPointer(ctx, operator1, operator2, e1, e2);
                return;
            }
            String id = ctx.inteiro().IDENT().get(0).getText();
            if(ctx.inteiro().INT()!=null)
            {
                defineSymbol(ctx,new Symbol(ctx.getChild(0).getChild(0).getText(),ctx.getChild(0).getChild(1).getText()));
                exprType.put(ctx, Symbol.PType.INT);
            }

            else
            {
                Symbol s = this.currentScope.resolve(id);
                if(s!=null)
                    if(!s.type.equals(Symbol.PType.INT))
                    {
                        System.err.println("A variável " + id + " na linha " + ctx.start.getLine() + " é do tipo " + s.type);
                        ++this.semanticErrors;
                        return;
                    }
                if(s==null)
                {
                    System.err.println("Undefined variable " + id + " in line " + ctx.inteiro().IDENT(0).getSymbol().getLine() + " position " + ctx.inteiro().IDENT(0).getSymbol().getCharPositionInLine());
                    ++this.semanticErrors;
                    this.exprType.put(ctx, Symbol.PType.ERROR);
                }

                else if(s instanceof FunctionSymbol)
                {
                    System.err.println("Using function symbol " + id + " as variable in line " + ctx.inteiro().IDENT(0).getSymbol().getLine());
                    ++this.semanticErrors;
                    this.exprType.put(ctx, Symbol.PType.ERROR);
                }

                else
                    this.exprType.put(ctx, s.type);

            }

        }

        else if(ctx.real() != null)
        {
            defineSymbol(ctx,new Symbol(ctx.getChild(0).getChild(0).getText(),ctx.getChild(0).getChild(1).getText()));
            exprType.put(ctx, Symbol.PType.FLOAT);
        }

        else if(ctx.inteiros() != null
                || ctx.booleanos() !=null
                || ctx.reais() != null
                || ctx.cadeias_caracteres() != null)
        {
            int totalIds = ctx.getChild(0).getChildCount();
            for (int i = 1; i<totalIds; i+=2)
            {
                defineSymbol(ctx,new Symbol(ctx.getChild(0).getChild(0).getText(),ctx.getChild(0).getChild(i).getText()));
            }
        }
        //--------------------
        else if(ctx.ponteiro_cadeia() !=null
            || ctx.ponteiro_real() != null
            || ctx.ponteiro_inteiro() != null)
        {
            String a = "";
            if(ctx.ponteiro_inteiro() != null)
            {
                if(ctx.ponteiro_inteiro().NULL() != null || ctx.ponteiro_inteiro().getChildCount() == 4)
                    a ="pnull";

                else
                    a = "pint";
            }

            else if(ctx.ponteiro_real() != null) {
                if(ctx.ponteiro_real().NULL() != null || ctx.ponteiro_real().getChildCount() == 4)
                    a ="pnull";
                else
                    a = "pfloat";
            }
            else if(ctx.ponteiro_cadeia()!=null) {
                if(ctx.ponteiro_cadeia().NULL() != null || ctx.ponteiro_cadeia().getChildCount() == 4)
                    a ="pnull";
                else
                    a = "pstring";
            }

            defineSymbol(ctx,new Symbol(a,ctx.getChild(0).getChild(3).getText()));
        }

        //---------------------------
        else if(ctx.cadeia_caracteres()!=null)
        {
            if(this.currentScope.containsName(ctx.cadeia_caracteres().IDENT().get(0).getText()))
            {
                Symbol s = this.currentScope.resolve(ctx.cadeia_caracteres().IDENT().get(0).getText());
                if(!s.type.equals("string"))
                {
                    System.err.println("A variavel " + ctx.cadeia_caracteres().IDENT().get(0).getText() + " na linha " + ctx.start.getLine() + " é do tipo " + s.type );
                    ++this.semanticErrors;
                    return;
                }
            }

            //------------------
            if(ctx.cadeia_caracteres().getChild(0).getText().equals("string"))
            {
                defineSymbol(ctx,new Symbol(ctx.cadeia_caracteres().getChild(0).getText(),ctx.cadeia_caracteres().getChild(1).getText()));
                exprType.put(ctx, Symbol.PType.STRING);
            }

            else
            {
                String variableName = ctx.cadeia_caracteres().getChild(0).getText();

                Symbol s = this.currentScope.resolve(variableName);

                if(s==null)
                {
                    System.err.println("Undefined variable " + variableName + " in line " + ctx.cadeia_caracteres().IDENT().get(0).getSymbol().getLine() + " position " + ctx.cadeia_caracteres().IDENT().get(0).getSymbol().getCharPositionInLine());
                    ++this.semanticErrors;
                    this.exprType.put(ctx, Symbol.PType.ERROR);
                }

                else if(s instanceof FunctionSymbol)
                {
                    System.err.println("Using variable " + variableName + " as function in line " + ctx.cadeia_caracteres().IDENT().get(0).getSymbol().getLine());
                    ++this.semanticErrors;
                    this.exprType.put(ctx, Symbol.PType.ERROR);
                }
                else {
                    this.exprType.put(ctx, s.type);
                }

            }


        }

        else if(ctx.booleano()!=null)
        {
           if(this.currentScope.containsName(ctx.booleano().IDENT().getText()))
            {

                Symbol s = this.currentScope.resolve(ctx.booleano().IDENT().getText());
                if(s!=null) {
                    if (!s.type.equals("bool")) {
                        System.err.println("A variavel " + ctx.booleano().IDENT().getText() + " na linha " + ctx.start.getLine() + " é do tipo " + s.type);
                        ++this.semanticErrors;
                        return;
                    }


                }
            }

            if(ctx.booleano().getChild(0).getText().equals("bool"))
            {
                defineSymbol(ctx,new Symbol(ctx.booleano().getChild(0).getText(),ctx.booleano().getChild(1).getText()));
                exprType.put(ctx, Symbol.PType.BOOL);
            }

            else
            {
                String variableName = ctx.booleano().getChild(0).getText();

                Symbol s = this.currentScope.resolve(variableName);

                if(s==null)
                {
                    System.err.println("Undefined bool " + variableName + " in line " + ctx.booleano().IDENT().getSymbol().getLine() + " position " + ctx.booleano().IDENT().getSymbol().getCharPositionInLine());
                    ++this.semanticErrors;
                    this.exprType.put(ctx, Symbol.PType.ERROR);
                }

                else if(s instanceof FunctionSymbol)
                {
                    System.err.println("Using bool " + variableName + " as function in line " + ctx.booleano().IDENT().getSymbol().getLine());
                    ++this.semanticErrors;
                    this.exprType.put(ctx, Symbol.PType.ERROR);
                }
                else {
                    this.exprType.put(ctx, s.type);
                }

            }


        }



    }


    private boolean isConvertibleTo(Symbol.PType from, Symbol.PType to) {
        if (from == to) {
            return true;
        } else {
            return from == Symbol.PType.INT && to == Symbol.PType.FLOAT;
        }
    }

    private boolean verifyPrimitiveArithmeticOperator(ParserRuleContext ctx, String operator, Symbol.PType e1, Symbol.PType e2) {
        if (e1 != Symbol.PType.ERROR && e2 != Symbol.PType.ERROR) {
            if (e1 == Symbol.PType.INT && e2 == Symbol.PType.INT) {
                this.exprType.put(ctx, Symbol.PType.INT);
                return true;
            } else if (e1 == Symbol.PType.FLOAT && this.isConvertibleTo(e2, e1)) {
                this.exprType.put(ctx, Symbol.PType.FLOAT);
                return true;
            } else if (e2 == Symbol.PType.FLOAT && this.isConvertibleTo(e1, e2)) {
                this.exprType.put(ctx, Symbol.PType.FLOAT);
                return true;
            } else {
                PrintStream var10000 = System.err;
                String var10001 = e1.toString();
                var10000.println("Invalid types for binary operator " + var10001 + " " + operator + " " + e2.toString() + " in line " + ctx.start.getLine());
                ++this.semanticErrors;
                this.exprType.put(ctx, Symbol.PType.ERROR);
                return false;
            }
        } else {
            this.exprType.put(ctx, Symbol.PType.ERROR);
            return false;
        }
    }

    private boolean verifyEqualDif(ParserRuleContext ctx, String operator, Symbol.PType e1, Symbol.PType e2) {
        if (e1 != Symbol.PType.ERROR && e2 != Symbol.PType.ERROR) {
            if (e1 == e2  ) {
                this.exprType.put(ctx, Symbol.PType.BOOL);
                return true;
            }  else if((e1 == Symbol.PType.PNULL && e2== Symbol.PType.PFLOAT) || (e1 == Symbol.PType.PNULL && e2== Symbol.PType.PINT) || (e1 == Symbol.PType.PNULL && e2== Symbol.PType.PSTRING) || (e1 == Symbol.PType.PFLOAT && e2==  Symbol.PType.PNULL) || (e1 == Symbol.PType.PINT && e2==  Symbol.PType.PNULL) || (e1 == Symbol.PType.PSTRING && e2==  Symbol.PType.PNULL) )
            {
                this.exprType.put(ctx, Symbol.PType.BOOL);
                return true;
            }
            else {
                PrintStream var10000 = System.err;
                String var10001 = e1.toString();
                var10000.println("Invalid types for equal/dif comparator " + var10001 + " " + operator + " " + e2.toString() + " in line " + ctx.start.getLine());
                ++this.semanticErrors;
                this.exprType.put(ctx, Symbol.PType.ERROR);
                return false;
            }
        } else {
            this.exprType.put(ctx, Symbol.PType.ERROR);
            return false;
        }
    }

    private boolean verifyComparator(ParserRuleContext ctx, String operator, Symbol.PType e1, Symbol.PType e2) {
        if (e1 != Symbol.PType.ERROR && e2 != Symbol.PType.ERROR) {
            if (e1 == Symbol.PType.INT && e2 == Symbol.PType.INT) {
                this.exprType.put(ctx, Symbol.PType.BOOL);
                return true;
            } else if (e1 == Symbol.PType.FLOAT && this.isConvertibleTo(e2, e1)) {
                this.exprType.put(ctx, Symbol.PType.BOOL);
                return true;
            } else if (e2 == Symbol.PType.FLOAT && this.isConvertibleTo(e1, e2)) {
                this.exprType.put(ctx, Symbol.PType.BOOL);
                return true;
            } else {
                PrintStream var10000 = System.err;
                String var10001 = e1.toString();
                var10000.println("Invalid types for comparator " + var10001 + " " + operator + " " + e2.toString() + " in line " + ctx.start.getLine());
                ++this.semanticErrors;
                this.exprType.put(ctx, Symbol.PType.ERROR);
                return false;
            }
        } else {
            this.exprType.put(ctx, Symbol.PType.ERROR);
            return false;
        }
    }

    private boolean verifyLogicals(ParserRuleContext ctx, String operator, Symbol.PType e1, Symbol.PType e2) {
        if (e1 != Symbol.PType.ERROR && e2 != Symbol.PType.ERROR) {
            if (e1 == Symbol.PType.BOOL && e2 == Symbol.PType.BOOL) {
                this.exprType.put(ctx, Symbol.PType.BOOL);
                return true;
            }
            else {
                PrintStream var10000 = System.err;
                String var10001 = e1.toString();
                var10000.println("Invalid types for logics operator " + var10001 + " " + operator + " " + e2.toString() + " in line " + ctx.start.getLine());
                ++this.semanticErrors;
                this.exprType.put(ctx, Symbol.PType.ERROR);
                return false;
            }
        } else {
            this.exprType.put(ctx, Symbol.PType.ERROR);
            return false;
        }
    }

    private boolean verifyIndexPointer(ParserRuleContext ctx, String operator1, String operator2, Symbol.PType e1, Symbol.PType e2) {
        if (e1 != Symbol.PType.ERROR && e2 != Symbol.PType.ERROR) {
            if (e1 == Symbol.PType.PINT && e2 == Symbol.PType.INT) {
                this.exprType.put(ctx, Symbol.PType.INT);
                return true;
            } else if (e1 == Symbol.PType.PFLOAT && e2 == Symbol.PType.INT) {
                this.exprType.put(ctx, Symbol.PType.FLOAT);
                return true;
            } else if (e1 == Symbol.PType.PSTRING && e2 == Symbol.PType.INT) {
                this.exprType.put(ctx, Symbol.PType.STRING);
                return true;
            }
            else {
                PrintStream var10000 = System.err;
                String var10001 = e1.toString();
                var10000.println("Invalid types for POINTER " + var10001 + " " + operator1 + " " + e2.toString() + " " + operator2 + " in line " + ctx.start.getLine());
                ++this.semanticErrors;
                this.exprType.put(ctx, Symbol.PType.ERROR);
                return false;
            }
        } else {
            this.exprType.put(ctx, Symbol.PType.ERROR);
            return false;
        }
    }



    public void enterEveryRule(ParserRuleContext ctx) { }
    public void exitEveryRule(ParserRuleContext ctx) { }
    public void visitTerminal(TerminalNode node) { }
    public void visitErrorNode(ErrorNode node) { }


}
