package com.compiladores.antlr4compiler;

import com.compiladores.gramatica.gramaticaBaseVisitor;
import com.compiladores.gramatica.gramaticaParser;
import org.antlr.v4.runtime.tree.ParseTree;


public class Calculator extends gramaticaBaseVisitor<Double>{
    
    @Override
    public Double visitExpression(gramaticaParser.ExpressionContext ctx) {
        double valor = visitTermo(ctx.termo1);
        for (int i = 0; i < ctx.outroTermo.size(); i++) {
            gramaticaParser.OperatorContext operador = ctx.operator(i);
            gramaticaParser.TermoContext outroTermo = ctx.outroTermo.get(i);
            String strOperator = operador.getText();
            switch (strOperator) {
                case "+":
                    valor += visitTermo(outroTermo);
                    break;
                case "-":
                    valor -= visitTermo(outroTermo);
                    break;
                default:
                    System.err.println("Operador invalido");;
            }
        }
        return valor;
    }

    @Override
    public Double visitTermo(gramaticaParser.TermoContext ctx) {
        double valor = visitFator(ctx.fator1);
        for (int i = 0; i < ctx.outroFator.size(); i++) {
            gramaticaParser.OperatorContext operador = ctx.operator(i);
            gramaticaParser.FatorContext outroFator = ctx.outroFator.get(i);
            String strOperator = operador.getText();
            switch (strOperator) {
                case "*":
                    valor *= visitFator(outroFator);
                    break;
                case "/":
                    valor /= visitFator(outroFator);
                    break;
                case "%":
                    valor %= visitFator(outroFator);
                    break;
                default:
                    System.err.println("Operador invalido");;
            }
        }
        return valor;
    }

    @Override
    public Double visitFator(gramaticaParser.FatorContext ctx) {
        if(ctx.algo() != null){
            return Double.parseDouble(ctx.algo().getText());
        }
        return  visitExpression(ctx.expression());
    }
    
}
