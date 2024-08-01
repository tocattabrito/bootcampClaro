package edu.joaobrito.segundasemana.operadores;

public class OperadoresLogicos {

    public static void main(String[] args) {
        
        boolean condicao1 = true;
        boolean condicao2 = false;

        // E
        if (condicao1 && (7 > 4)) {
            System.out.println("As duas condições são verdadeiras");
        }
        // OU
        if (condicao1 || condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }
         System.out.println("fim");
    }
}
