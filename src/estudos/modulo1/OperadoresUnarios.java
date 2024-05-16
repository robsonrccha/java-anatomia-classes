package estudos.modulo1;

public class OperadoresUnarios {

	public static void main(String[] args) {
		
		/* OPERADORES UNARIOS:
        São aplicados juntamente com um outro operador aritmético. Eles realizam alguns 
        trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos.
        (+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente;
        (-) Operador unário de valor negativo – nega um número ou expressão aritmética;
        (++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;
        (--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;
        (!) Operador unário lógico de negação – nega o valor de uma expressão booleana.*/
        int numero = 5;
		
        System.out.println(- numero); //Imprimindo o numero negativo
        numero = - numero; //transformando a variavel em numero negativo
        numero = numero * - 1; //para voltar um numero negativo para positivo não é possivel usar + por ser um operador aritmetico, e sim deve-se realizar a multiplicação por -1.
        System.out.println(numero); 
        numero ++; //incrementando numero em mais 1 numero, imprimIrá 6
        System.out.println(numero); 

        //incrementando numero em mais 1 numero, imprimirá 7
        System.out.println(numero ++); //ops algo de errado não está certo - nesse caso a variavel esta sendo imprimida e em sequência feito o incremendo, assim a segunda impressao irá mostrar o valor 7
        System.out.println(numero);//agora sim, numero virou 7
        System.out.println(++ numero);  //ordem de precedencia aqui. Para realizar o incremento antes da impressão usa-se a precedência, onde é feito o incremento antes da impressao.


	}

}
