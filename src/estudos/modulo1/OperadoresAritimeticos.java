package estudos.modulo1;

public class OperadoresAritimeticos {
	
	public static void main(String[] args) {
		
		// OPERADORES ARITIMETICOS: são: + (adição), - (subtração), * (multiplicação) e / (divisão).
        double soma = 10.5 + 15.7; // operadores de adição usados em variavel do tipo String, é usado para concatenação
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3; // resto da divisão
        double resultado = (10 * 7) + (20/4); // maior complexidade do uso de operadores
        
        System.out.println("O resultado da soma é:" + soma);
        System.out.println("O resultado da divisão é: " + subtracao);
        System.out.println("O resultado da multiplicação é: " + multiplicacao);
        System.out.println("O resultado da divisão é: " + divisao);
        System.out.println("O resultado do modulo é: " + modulo);
        System.out.println("O resultado da equação: " + resultado);

	}

}
