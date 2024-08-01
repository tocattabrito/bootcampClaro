package edu.joaobrito.segundasemana.operadores;

public class OperadoresRelacionais {

    public static void main(String[] args) {
        
        String nomeUm = "Klara";
        String nomeDois = "Klara";

        System.out.println(nomeUm == nomeDois);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;
        
        System.out.println("numeroUm é diferente de numeroDois? " + simNao);
    }
}
