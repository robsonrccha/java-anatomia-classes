package estudos.modulo1;

public class TesteMyClass {
	
	// A classe onde fica o "MAIN" é a classe executavel, onde sera utilizado os metodos
	// A classe que estamos testando é a MyClass onde há os metodos especificos.
	
	public static void main(String[] args) {
        MyClass myClass = new MyClass(); // Crie uma instância da classe MyClass
        double resultado = myClass.somar(5, 3); // Chamando o método somar e armazene o resultado em uma variável
        System.out.println("O resultado da soma é: " + resultado); // Imprimir o resultado
        
        
        MyClass myClass2 = new MyClass(); // Criando uma nova instancia MyClass e chamando o metodo somar
        double resultado2 = myClass2.somar(45, 420); // Chamando o método somar e armazene o resultado em uma variável
        System.out.println("O resultado da soma2 é: " + resultado2); // Imprimir o resultado
        
 
        MyClass myClass3 = new MyClass (); // Criando nova instancia para o metodo imprimir
        myClass3.imprimir(); // Não precisa de parametros(atributos) pois o metodo é void(vazio)
        
    }
}