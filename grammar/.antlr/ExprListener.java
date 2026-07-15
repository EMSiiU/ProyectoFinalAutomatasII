// Generated from c:/Users/azare/OneDrive/Documents/GitHub/ProyectoFinalAutomatasII/grammar/Expr.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExprParser.ExprContext ctx);
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