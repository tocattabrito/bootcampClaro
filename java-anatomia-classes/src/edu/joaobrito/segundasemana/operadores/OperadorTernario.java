package edu.joaobrito.segundasemana.operadores;

public class OperadorTernario {

    public static void main(String[] args) {
        // <Expressão Condicional> ? <Caso codição seja true> : 
        // <Caso condição seja false>

        int a, b;
        a = 5;
        b = 6;

        //String resultado = "";

        // EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE

        // if (a == b) {
        //     resultado = "verdadeiro";
        // } else {
        //     resultado = "falso";
        // }

        String resultado = a == b ? "verdadeiro" : "falso";
       
        System.out.println(resultado);

    }
}
