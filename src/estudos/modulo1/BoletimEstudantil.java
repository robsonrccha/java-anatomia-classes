package estudos.modulo1;

public class BoletimEstudantil {
    public static void main(String[] args) {
        
        int mediaFinal = 5;
        
/* PRINCIPIO DO IDENTAÇÃO (TAB)
Pode ter um nivel entre 4 - 6 de identação, caso supere esse valor seria interessante
rever o codigo para melhorar a identação e sua profundidade */

        if (mediaFinal<6) 
            System.out.println("REPROVADO");
        else if (mediaFinal==6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVADO");
    }
}
