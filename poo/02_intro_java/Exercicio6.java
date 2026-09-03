import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        //switch/case
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um vaor de 1 a 7");
        int numero = leitor.nextInt();
        switch(numero){
            case 1: System.out.println("Segunda");
            case 2: System.out.println("Terça");
            case 3: System.out.println("Quarta");
            case 4: System.out.println("Quinta");
            case 5: System.out.println("Sexta");
            case 6: System.out.println("Sábado");
            case 7: System.out.println("Domingo");
            default: System.out.println("Opção Inválida.");
        }
        System.out.println("Até mais.");
        var1.close();
    }
}
