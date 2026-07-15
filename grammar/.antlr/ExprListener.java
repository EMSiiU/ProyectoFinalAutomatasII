// Generated from c:/Escuela/ProyectoFinalAutomatasII/grammar/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(ExprParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(ExprParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#tipoDecl}.
	 * @param ctx the parse tree
	 */
	void enterTipoDecl(ExprParser.TipoDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#tipoDecl}.
	 * @param ctx the parse tree
	 */
	void exitTipoDecl(ExprParser.TipoDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#claseDecl}.
	 * @param ctx the parse tree
	 */
	void enterClaseDecl(ExprParser.ClaseDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#claseDecl}.
	 * @param ctx the parse tree
	 */
	void exitClaseDecl(ExprParser.ClaseDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#interfaceDecl}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDecl(ExprParser.InterfaceDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#interfaceDecl}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDecl(ExprParser.InterfaceDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#miembroInterfaz}.
	 * @param ctx the parse tree
	 */
	void enterMiembroInterfaz(ExprParser.MiembroInterfazContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#miembroInterfaz}.
	 * @param ctx the parse tree
	 */
	void exitMiembroInterfaz(ExprParser.MiembroInterfazContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#miembroClase}.
	 * @param ctx the parse tree
	 */
	void enterMiembroClase(ExprParser.MiembroClaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#miembroClase}.
	 * @param ctx the parse tree
	 */
	void exitMiembroClase(ExprParser.MiembroClaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#modificador}.
	 * @param ctx the parse tree
	 */
	void enterModificador(ExprParser.ModificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#modificador}.
	 * @param ctx the parse tree
	 */
	void exitModificador(ExprParser.ModificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(ExprParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(ExprParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#atributoDecl}.
	 * @param ctx the parse tree
	 */
	void enterAtributoDecl(ExprParser.AtributoDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#atributoDecl}.
	 * @param ctx the parse tree
	 */
	void exitAtributoDecl(ExprParser.AtributoDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#declaradorVariable}.
	 * @param ctx the parse tree
	 */
	void enterDeclaradorVariable(ExprParser.DeclaradorVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#declaradorVariable}.
	 * @param ctx the parse tree
	 */
	void exitDeclaradorVariable(ExprParser.DeclaradorVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#constructorDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDecl(ExprParser.ConstructorDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#constructorDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDecl(ExprParser.ConstructorDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#metodoDecl}.
	 * @param ctx the parse tree
	 */
	void enterMetodoDecl(ExprParser.MetodoDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#metodoDecl}.
	 * @param ctx the parse tree
	 */
	void exitMetodoDecl(ExprParser.MetodoDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void enterListaParametros(ExprParser.ListaParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void exitListaParametros(ExprParser.ListaParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(ExprParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(ExprParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(ExprParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(ExprParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(ExprParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(ExprParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#declaracionVariable}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionVariable(ExprParser.DeclaracionVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#declaracionVariable}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionVariable(ExprParser.DeclaracionVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#sentenciaIf}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaIf(ExprParser.SentenciaIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#sentenciaIf}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaIf(ExprParser.SentenciaIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#sentenciaFor}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaFor(ExprParser.SentenciaForContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#sentenciaFor}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaFor(ExprParser.SentenciaForContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(ExprParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(ExprParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#sentenciaWhile}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaWhile(ExprParser.SentenciaWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#sentenciaWhile}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaWhile(ExprParser.SentenciaWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#sentenciaDoWhile}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaDoWhile(ExprParser.SentenciaDoWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#sentenciaDoWhile}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaDoWhile(ExprParser.SentenciaDoWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#sentenciaTry}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaTry(ExprParser.SentenciaTryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#sentenciaTry}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaTry(ExprParser.SentenciaTryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(ExprParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(ExprParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#sentenciaReturn}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaReturn(ExprParser.SentenciaReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#sentenciaReturn}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaReturn(ExprParser.SentenciaReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#sentenciaExpr}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaExpr(ExprParser.SentenciaExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#sentenciaExpr}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaExpr(ExprParser.SentenciaExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LlamadaMetodoSinObjeto}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaMetodoSinObjeto(ExprParser.LlamadaMetodoSinObjetoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LlamadaMetodoSinObjeto}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaMetodoSinObjeto(ExprParser.LlamadaMetodoSinObjetoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOr(ExprParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOr(ExprParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IncrementoDecremento}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIncrementoDecremento(ExprParser.IncrementoDecrementoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IncrementoDecremento}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIncrementoDecremento(ExprParser.IncrementoDecrementoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParentesis(ExprParser.ParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParentesis(ExprParser.ParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AccesoAtributo}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAccesoAtributo(ExprParser.AccesoAtributoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AccesoAtributo}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAccesoAtributo(ExprParser.AccesoAtributoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstanciacionObjeto}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInstanciacionObjeto(ExprParser.InstanciacionObjetoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstanciacionObjeto}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInstanciacionObjeto(ExprParser.InstanciacionObjetoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Igualdad}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIgualdad(ExprParser.IgualdadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Igualdad}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIgualdad(ExprParser.IgualdadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumaResta}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSumaResta(ExprParser.SumaRestaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumaResta}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSumaResta(ExprParser.SumaRestaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AccesoArreglo}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAccesoArreglo(ExprParser.AccesoArregloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AccesoArreglo}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAccesoArreglo(ExprParser.AccesoArregloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperadoresUnarios}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOperadoresUnarios(ExprParser.OperadoresUnariosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperadoresUnarios}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOperadoresUnarios(ExprParser.OperadoresUnariosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivMod}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivMod(ExprParser.MulDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivMod}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivMod(ExprParser.MulDivModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Super}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSuper(ExprParser.SuperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Super}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSuper(ExprParser.SuperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Asignacion}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(ExprParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Asignacion}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(ExprParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreIncrementoPreDecremento}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementoPreDecremento(ExprParser.PreIncrementoPreDecrementoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreIncrementoPreDecremento}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementoPreDecremento(ExprParser.PreIncrementoPreDecrementoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Relacionales}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelacionales(ExprParser.RelacionalesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Relacionales}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelacionales(ExprParser.RelacionalesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd(ExprParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd(ExprParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ternario}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTernario(ExprParser.TernarioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ternario}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTernario(ExprParser.TernarioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Println}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(ExprParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Println}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(ExprParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code This}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterThis(ExprParser.ThisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code This}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitThis(ExprParser.ThisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprLiteral}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprLiteral(ExprParser.ExprLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprLiteral}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprLiteral(ExprParser.ExprLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AccesoAtributoSinObjeto}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAccesoAtributoSinObjeto(ExprParser.AccesoAtributoSinObjetoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AccesoAtributoSinObjeto}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAccesoAtributoSinObjeto(ExprParser.AccesoAtributoSinObjetoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LlamadaMetodo}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaMetodo(ExprParser.LlamadaMetodoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LlamadaMetodo}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaMetodo(ExprParser.LlamadaMetodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#listaArgs}.
	 * @param ctx the parse tree
	 */
	void enterListaArgs(ExprParser.ListaArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#listaArgs}.
	 * @param ctx the parse tree
	 */
	void exitListaArgs(ExprParser.ListaArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ExprParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ExprParser.LiteralContext ctx);
}