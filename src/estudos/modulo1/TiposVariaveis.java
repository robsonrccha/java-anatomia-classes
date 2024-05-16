package estudos.modulo1;

public class TiposVariaveis {

    public static void main(String[] args) {

        byte idade = 123; // -128 a 127
	    short ano = 2021; // -32.768 a 32.767
	    int cep = 21070333; //Se começar com zero, talvez tenha que ser outro tipo (String) pois o Java não aceita inicio int com zero
	    long cpf = 98765432109L; //Precisa encerrar com o L para o Java entender que sera do tipo long; e se começar com zero, talvez tenha que ser outro tipo
	    float pi = 3.14F; //Precisa encerrar com F para entender que sera do tipo float.
	    double salario = 1275.33;
        char genero = 'M';
        String nome = "Robson";


        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        /*A troca da tipagem de variavel de short para int é possivel pois o int é superior ao short, agora ao inverso
        não é possivel e pra isso é necessario fazer uma adaptação(cast) para determinar essa alteração para o tipo escolhido*/


        //Impressao das variaveis utilizadas
        System.out.println(numeroCurto2);
        System.out.println("Olá meu nome é " + nome + " tenho " + idade + " anos, e moro no CEP " + cep);
        System.out.println(genero);
        System.out.println(ano);
        System.out.println(cpf);
        System.out.println(pi);
        System.out.println(salario);


    }

}
