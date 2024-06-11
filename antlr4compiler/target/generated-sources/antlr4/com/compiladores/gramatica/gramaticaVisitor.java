// Generated from java-escape by ANTLR 4.11.1
package com.compiladores.gramatica;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(gramaticaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(gramaticaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(gramaticaParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(gramaticaParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(gramaticaParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#algo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgo(gramaticaParser.AlgoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(gramaticaParser.TypeContext ctx);
}