package estudos.modulo1.operadores;

import java.util.Date;

public class Operadores {

    public static void main(String[] args) {
	// Operadores de atribuição: = (igual).
        String nome = "Robson";
        int idade = 34;
        double peso = 85.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date(); // operador do tipo objeto, logo é necessario uma classe para referenciar o objeto criado.

        // Os operadores aritméticos são: + (adição), - (subtração), * (multiplicação) e / (divisão).
        double soma = 10.5 + 15.7; // operadores de adição usados em variavel do tipo String, é usado para concatenação
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3; // resto da divisão
        double resultado = (10 * 7) + (20/4); // maior complexidade do uso de operadores
	
    }

}