package estudos.modulo1.introducao;

public class MinhaClasse {

    // main é onde sera a sua classe principal executavel
    public static void main(String[] args) {

        System.out.println("Olá mundo!");

        String primeiroNome = "Robson";
        String segundoNome = "Rocha";

        // Para chamar o metodo: variavel com 'nome' e o 'valor' é a chamada do metodo
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        
        // variaveis com a classificação final é usado quando o valor é imutavel
        // variaavelv = tipo 'nomeVariavel' atribuição(valor)
        final String br = "Brasil";
        int ano = 2024;
        final double pi = 3.14;
        final int estadosBrasileiros = 27;

        // variavel boleana tera valor sim ou não(verdadeiro ou falso)
        boolean maiorIdade = true;

        System.out.println(nomeCompleto);

    };


    // Para declarar metodos
    // tipoRetorno NomeObjetivoInfinitivo Parametros(opcional)
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do metodo " + primeiroNome + " " + segundoNome;
    };
    

}