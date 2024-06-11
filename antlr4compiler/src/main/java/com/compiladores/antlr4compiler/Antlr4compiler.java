
package com.compiladores.antlr4compiler;

import com.compiladores.gramatica.gramaticaLexer;
import com.compiladores.gramatica.gramaticaParser;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Antlr4compiler {

    public static void main(String[] args) throws IOException {
        // Ler a entrada do usuário ou de um arquivo
        CharStream input = CharStreams.fromFileName("antlr4compiler\\src\\main\\java\\com\\compiladores\\antlr4compiler\\input.txt");

        // Criar o lexer
        gramaticaLexer lexer = new gramaticaLexer(input);

        // Criar o buffer de tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Criar o parser
        gramaticaParser parser = new gramaticaParser(tokens);
        
        // Iniciar o parsing pela regra inicial
        gramaticaParser.ProgramContext tree = parser.program();
        
        System.out.println("Arvore sintatica:\n" + tree.toStringTree(parser));
        
        Calculator c = new Calculator();
        Double result = c.visitProgram(tree);
        System.out.println("Valor resultado: "+ result);
        
    }
}
