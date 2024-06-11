// Generated from java-escape by ANTLR 4.11.1
package com.compiladores.gramatica;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(gramaticaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(gramaticaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(gramaticaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(gramaticaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(gramaticaParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(gramaticaParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(gramaticaParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(gramaticaParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(gramaticaParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(gramaticaParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#algo}.
	 * @param ctx the parse tree
	 */
	void enterAlgo(gramaticaParser.AlgoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#algo}.
	 * @param ctx the parse tree
	 */
	void exitAlgo(gramaticaParser.AlgoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(gramaticaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(gramaticaParser.TypeContext ctx);
}