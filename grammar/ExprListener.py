# Generated from ./grammar/Expr.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .ExprParser import ExprParser
else:
    from ExprParser import ExprParser

# This class defines a complete listener for a parse tree produced by ExprParser.
class ExprListener(ParseTreeListener):

    # Enter a parse tree produced by ExprParser#programa.
    def enterPrograma(self, ctx:ExprParser.ProgramaContext):
        pass

    # Exit a parse tree produced by ExprParser#programa.
    def exitPrograma(self, ctx:ExprParser.ProgramaContext):
        pass


    # Enter a parse tree produced by ExprParser#tipoDecl.
    def enterTipoDecl(self, ctx:ExprParser.TipoDeclContext):
        pass

    # Exit a parse tree produced by ExprParser#tipoDecl.
    def exitTipoDecl(self, ctx:ExprParser.TipoDeclContext):
        pass


    # Enter a parse tree produced by ExprParser#claseDecl.
    def enterClaseDecl(self, ctx:ExprParser.ClaseDeclContext):
        pass

    # Exit a parse tree produced by ExprParser#claseDecl.
    def exitClaseDecl(self, ctx:ExprParser.ClaseDeclContext):
        pass


    # Enter a parse tree produced by ExprParser#interfaceDecl.
    def enterInterfaceDecl(self, ctx:ExprParser.InterfaceDeclContext):
        pass

    # Exit a parse tree produced by ExprParser#interfaceDecl.
    def exitInterfaceDecl(self, ctx:ExprParser.InterfaceDeclContext):
        pass


    # Enter a parse tree produced by ExprParser#miembroInterfaz.
    def enterMiembroInterfaz(self, ctx:ExprParser.MiembroInterfazContext):
        pass

    # Exit a parse tree produced by ExprParser#miembroInterfaz.
    def exitMiembroInterfaz(self, ctx:ExprParser.MiembroInterfazContext):
        pass


    # Enter a parse tree produced by ExprParser#miembroClase.
    def enterMiembroClase(self, ctx:ExprParser.MiembroClaseContext):
        pass

    # Exit a parse tree produced by ExprParser#miembroClase.
    def exitMiembroClase(self, ctx:ExprParser.MiembroClaseContext):
        pass


    # Enter a parse tree produced by ExprParser#modificador.
    def enterModificador(self, ctx:ExprParser.ModificadorContext):
        pass

    # Exit a parse tree produced by ExprParser#modificador.
    def exitModificador(self, ctx:ExprParser.ModificadorContext):
        pass


    # Enter a parse tree produced by ExprParser#tipo.
    def enterTipo(self, ctx:ExprParser.TipoContext):
        pass

    # Exit a parse tree produced by ExprParser#tipo.
    def exitTipo(self, ctx:ExprParser.TipoContext):
        pass


    # Enter a parse tree produced by ExprParser#atributoDecl.
    def enterAtributoDecl(self, ctx:ExprParser.AtributoDeclContext):
        pass

    # Exit a parse tree produced by ExprParser#atributoDecl.
    def exitAtributoDecl(self, ctx:ExprParser.AtributoDeclContext):
        pass


    # Enter a parse tree produced by ExprParser#declaradorVariable.
    def enterDeclaradorVariable(self, ctx:ExprParser.DeclaradorVariableContext):
        pass

    # Exit a parse tree produced by ExprParser#declaradorVariable.
    def exitDeclaradorVariable(self, ctx:ExprParser.DeclaradorVariableContext):
        pass


    # Enter a parse tree produced by ExprParser#constructorDecl.
    def enterConstructorDecl(self, ctx:ExprParser.ConstructorDeclContext):
        pass

    # Exit a parse tree produced by ExprParser#constructorDecl.
    def exitConstructorDecl(self, ctx:ExprParser.ConstructorDeclContext):
        pass


    # Enter a parse tree produced by ExprParser#metodoDecl.
    def enterMetodoDecl(self, ctx:ExprParser.MetodoDeclContext):
        pass

    # Exit a parse tree produced by ExprParser#metodoDecl.
    def exitMetodoDecl(self, ctx:ExprParser.MetodoDeclContext):
        pass


    # Enter a parse tree produced by ExprParser#listaParametros.
    def enterListaParametros(self, ctx:ExprParser.ListaParametrosContext):
        pass

    # Exit a parse tree produced by ExprParser#listaParametros.
    def exitListaParametros(self, ctx:ExprParser.ListaParametrosContext):
        pass


    # Enter a parse tree produced by ExprParser#parametro.
    def enterParametro(self, ctx:ExprParser.ParametroContext):
        pass

    # Exit a parse tree produced by ExprParser#parametro.
    def exitParametro(self, ctx:ExprParser.ParametroContext):
        pass


    # Enter a parse tree produced by ExprParser#bloque.
    def enterBloque(self, ctx:ExprParser.BloqueContext):
        pass

    # Exit a parse tree produced by ExprParser#bloque.
    def exitBloque(self, ctx:ExprParser.BloqueContext):
        pass


    # Enter a parse tree produced by ExprParser#sentencia.
    def enterSentencia(self, ctx:ExprParser.SentenciaContext):
        pass

    # Exit a parse tree produced by ExprParser#sentencia.
    def exitSentencia(self, ctx:ExprParser.SentenciaContext):
        pass


    # Enter a parse tree produced by ExprParser#declaracionVariable.
    def enterDeclaracionVariable(self, ctx:ExprParser.DeclaracionVariableContext):
        pass

    # Exit a parse tree produced by ExprParser#declaracionVariable.
    def exitDeclaracionVariable(self, ctx:ExprParser.DeclaracionVariableContext):
        pass


    # Enter a parse tree produced by ExprParser#sentenciaIf.
    def enterSentenciaIf(self, ctx:ExprParser.SentenciaIfContext):
        pass

    # Exit a parse tree produced by ExprParser#sentenciaIf.
    def exitSentenciaIf(self, ctx:ExprParser.SentenciaIfContext):
        pass


    # Enter a parse tree produced by ExprParser#sentenciaFor.
    def enterSentenciaFor(self, ctx:ExprParser.SentenciaForContext):
        pass

    # Exit a parse tree produced by ExprParser#sentenciaFor.
    def exitSentenciaFor(self, ctx:ExprParser.SentenciaForContext):
        pass


    # Enter a parse tree produced by ExprParser#forInit.
    def enterForInit(self, ctx:ExprParser.ForInitContext):
        pass

    # Exit a parse tree produced by ExprParser#forInit.
    def exitForInit(self, ctx:ExprParser.ForInitContext):
        pass


    # Enter a parse tree produced by ExprParser#sentenciaWhile.
    def enterSentenciaWhile(self, ctx:ExprParser.SentenciaWhileContext):
        pass

    # Exit a parse tree produced by ExprParser#sentenciaWhile.
    def exitSentenciaWhile(self, ctx:ExprParser.SentenciaWhileContext):
        pass


    # Enter a parse tree produced by ExprParser#sentenciaDoWhile.
    def enterSentenciaDoWhile(self, ctx:ExprParser.SentenciaDoWhileContext):
        pass

    # Exit a parse tree produced by ExprParser#sentenciaDoWhile.
    def exitSentenciaDoWhile(self, ctx:ExprParser.SentenciaDoWhileContext):
        pass


    # Enter a parse tree produced by ExprParser#sentenciaTry.
    def enterSentenciaTry(self, ctx:ExprParser.SentenciaTryContext):
        pass

    # Exit a parse tree produced by ExprParser#sentenciaTry.
    def exitSentenciaTry(self, ctx:ExprParser.SentenciaTryContext):
        pass


    # Enter a parse tree produced by ExprParser#catchClause.
    def enterCatchClause(self, ctx:ExprParser.CatchClauseContext):
        pass

    # Exit a parse tree produced by ExprParser#catchClause.
    def exitCatchClause(self, ctx:ExprParser.CatchClauseContext):
        pass


    # Enter a parse tree produced by ExprParser#sentenciaReturn.
    def enterSentenciaReturn(self, ctx:ExprParser.SentenciaReturnContext):
        pass

    # Exit a parse tree produced by ExprParser#sentenciaReturn.
    def exitSentenciaReturn(self, ctx:ExprParser.SentenciaReturnContext):
        pass


    # Enter a parse tree produced by ExprParser#sentenciaExpr.
    def enterSentenciaExpr(self, ctx:ExprParser.SentenciaExprContext):
        pass

    # Exit a parse tree produced by ExprParser#sentenciaExpr.
    def exitSentenciaExpr(self, ctx:ExprParser.SentenciaExprContext):
        pass


    # Enter a parse tree produced by ExprParser#LlamadaMetodoSinObjeto.
    def enterLlamadaMetodoSinObjeto(self, ctx:ExprParser.LlamadaMetodoSinObjetoContext):
        pass

    # Exit a parse tree produced by ExprParser#LlamadaMetodoSinObjeto.
    def exitLlamadaMetodoSinObjeto(self, ctx:ExprParser.LlamadaMetodoSinObjetoContext):
        pass


    # Enter a parse tree produced by ExprParser#Or.
    def enterOr(self, ctx:ExprParser.OrContext):
        pass

    # Exit a parse tree produced by ExprParser#Or.
    def exitOr(self, ctx:ExprParser.OrContext):
        pass


    # Enter a parse tree produced by ExprParser#IncrementoDecremento.
    def enterIncrementoDecremento(self, ctx:ExprParser.IncrementoDecrementoContext):
        pass

    # Exit a parse tree produced by ExprParser#IncrementoDecremento.
    def exitIncrementoDecremento(self, ctx:ExprParser.IncrementoDecrementoContext):
        pass


    # Enter a parse tree produced by ExprParser#Parentesis.
    def enterParentesis(self, ctx:ExprParser.ParentesisContext):
        pass

    # Exit a parse tree produced by ExprParser#Parentesis.
    def exitParentesis(self, ctx:ExprParser.ParentesisContext):
        pass


    # Enter a parse tree produced by ExprParser#AccesoAtributo.
    def enterAccesoAtributo(self, ctx:ExprParser.AccesoAtributoContext):
        pass

    # Exit a parse tree produced by ExprParser#AccesoAtributo.
    def exitAccesoAtributo(self, ctx:ExprParser.AccesoAtributoContext):
        pass


    # Enter a parse tree produced by ExprParser#InstanciacionObjeto.
    def enterInstanciacionObjeto(self, ctx:ExprParser.InstanciacionObjetoContext):
        pass

    # Exit a parse tree produced by ExprParser#InstanciacionObjeto.
    def exitInstanciacionObjeto(self, ctx:ExprParser.InstanciacionObjetoContext):
        pass


    # Enter a parse tree produced by ExprParser#Igualdad.
    def enterIgualdad(self, ctx:ExprParser.IgualdadContext):
        pass

    # Exit a parse tree produced by ExprParser#Igualdad.
    def exitIgualdad(self, ctx:ExprParser.IgualdadContext):
        pass


    # Enter a parse tree produced by ExprParser#SumaResta.
    def enterSumaResta(self, ctx:ExprParser.SumaRestaContext):
        pass

    # Exit a parse tree produced by ExprParser#SumaResta.
    def exitSumaResta(self, ctx:ExprParser.SumaRestaContext):
        pass


    # Enter a parse tree produced by ExprParser#AccesoArreglo.
    def enterAccesoArreglo(self, ctx:ExprParser.AccesoArregloContext):
        pass

    # Exit a parse tree produced by ExprParser#AccesoArreglo.
    def exitAccesoArreglo(self, ctx:ExprParser.AccesoArregloContext):
        pass


    # Enter a parse tree produced by ExprParser#OperadoresUnarios.
    def enterOperadoresUnarios(self, ctx:ExprParser.OperadoresUnariosContext):
        pass

    # Exit a parse tree produced by ExprParser#OperadoresUnarios.
    def exitOperadoresUnarios(self, ctx:ExprParser.OperadoresUnariosContext):
        pass


    # Enter a parse tree produced by ExprParser#MulDivMod.
    def enterMulDivMod(self, ctx:ExprParser.MulDivModContext):
        pass

    # Exit a parse tree produced by ExprParser#MulDivMod.
    def exitMulDivMod(self, ctx:ExprParser.MulDivModContext):
        pass


    # Enter a parse tree produced by ExprParser#Super.
    def enterSuper(self, ctx:ExprParser.SuperContext):
        pass

    # Exit a parse tree produced by ExprParser#Super.
    def exitSuper(self, ctx:ExprParser.SuperContext):
        pass


    # Enter a parse tree produced by ExprParser#Asignacion.
    def enterAsignacion(self, ctx:ExprParser.AsignacionContext):
        pass

    # Exit a parse tree produced by ExprParser#Asignacion.
    def exitAsignacion(self, ctx:ExprParser.AsignacionContext):
        pass


    # Enter a parse tree produced by ExprParser#PreIncrementoPreDecremento.
    def enterPreIncrementoPreDecremento(self, ctx:ExprParser.PreIncrementoPreDecrementoContext):
        pass

    # Exit a parse tree produced by ExprParser#PreIncrementoPreDecremento.
    def exitPreIncrementoPreDecremento(self, ctx:ExprParser.PreIncrementoPreDecrementoContext):
        pass


    # Enter a parse tree produced by ExprParser#Relacionales.
    def enterRelacionales(self, ctx:ExprParser.RelacionalesContext):
        pass

    # Exit a parse tree produced by ExprParser#Relacionales.
    def exitRelacionales(self, ctx:ExprParser.RelacionalesContext):
        pass


    # Enter a parse tree produced by ExprParser#And.
    def enterAnd(self, ctx:ExprParser.AndContext):
        pass

    # Exit a parse tree produced by ExprParser#And.
    def exitAnd(self, ctx:ExprParser.AndContext):
        pass


    # Enter a parse tree produced by ExprParser#Ternario.
    def enterTernario(self, ctx:ExprParser.TernarioContext):
        pass

    # Exit a parse tree produced by ExprParser#Ternario.
    def exitTernario(self, ctx:ExprParser.TernarioContext):
        pass


    # Enter a parse tree produced by ExprParser#Println.
    def enterPrintln(self, ctx:ExprParser.PrintlnContext):
        pass

    # Exit a parse tree produced by ExprParser#Println.
    def exitPrintln(self, ctx:ExprParser.PrintlnContext):
        pass


    # Enter a parse tree produced by ExprParser#This.
    def enterThis(self, ctx:ExprParser.ThisContext):
        pass

    # Exit a parse tree produced by ExprParser#This.
    def exitThis(self, ctx:ExprParser.ThisContext):
        pass


    # Enter a parse tree produced by ExprParser#ExprLiteral.
    def enterExprLiteral(self, ctx:ExprParser.ExprLiteralContext):
        pass

    # Exit a parse tree produced by ExprParser#ExprLiteral.
    def exitExprLiteral(self, ctx:ExprParser.ExprLiteralContext):
        pass


    # Enter a parse tree produced by ExprParser#AccesoAtributoSinObjeto.
    def enterAccesoAtributoSinObjeto(self, ctx:ExprParser.AccesoAtributoSinObjetoContext):
        pass

    # Exit a parse tree produced by ExprParser#AccesoAtributoSinObjeto.
    def exitAccesoAtributoSinObjeto(self, ctx:ExprParser.AccesoAtributoSinObjetoContext):
        pass


    # Enter a parse tree produced by ExprParser#LlamadaMetodo.
    def enterLlamadaMetodo(self, ctx:ExprParser.LlamadaMetodoContext):
        pass

    # Exit a parse tree produced by ExprParser#LlamadaMetodo.
    def exitLlamadaMetodo(self, ctx:ExprParser.LlamadaMetodoContext):
        pass


    # Enter a parse tree produced by ExprParser#listaArgs.
    def enterListaArgs(self, ctx:ExprParser.ListaArgsContext):
        pass

    # Exit a parse tree produced by ExprParser#listaArgs.
    def exitListaArgs(self, ctx:ExprParser.ListaArgsContext):
        pass


    # Enter a parse tree produced by ExprParser#literal.
    def enterLiteral(self, ctx:ExprParser.LiteralContext):
        pass

    # Exit a parse tree produced by ExprParser#literal.
    def exitLiteral(self, ctx:ExprParser.LiteralContext):
        pass



del ExprParser