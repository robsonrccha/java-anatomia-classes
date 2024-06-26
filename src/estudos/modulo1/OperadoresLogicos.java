package estudos.modulo1;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
/* OPERADORES LÓGICOS: é representado pelos símbolos "&&" e "||" utilizados 
 * na seguinte estrutura de sintaxe. */
        
        boolean condicao1=true;
        boolean condicao2=false;

        /* Aqui estamos utilizando o operador lógico E para fazer a união de duas expressões. 
         * É como se estivesse escrito: "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
         */

        if(condicao1 && condicao2)
        	System.out.print("Os dois valores precisam ser verdadeiros");

        //Se condicao1 OU condicao2 for verdadeira, executar código.
        if(condicao1 || condicao2)
        	System.out.print("Um dos valores é verdadeiro");
        
        // Negação de valor booleano
        boolean verdadeiro = true;
        System.out.println("\nInverteu true em " + !verdadeiro); //para negar um dado booleano usa-se a exclamação(!) antes da variavel.

        
	}

}
