package estudos.modulo1;

public class OperadoresTernarios {
	
	public static void main(String[] args) {
		
		
/* OPERADORES TERNÁRIOS: é representado pelos símbolos "?" e ":" utilizados 
 * na seguinte estrutura de sintaxe.

		É uma forma resumida para definir uma condição e escolher por um dentre dois valores. Você deve pensar numa condição ternária, como se fosse uma condição IF normal, porém, de uma forma em que toda a sua estrutura estará escrita numa única linha. */

		int a = 5, b = 5;        

		/* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
		 * if(a==b) resultado = "verdadeiro"; else resultado = "falso";
		 */

		// MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
		String resultado2 = (a == b) ? "verdadeiro" : "false";

		System.out.println(resultado2);
	}

}
