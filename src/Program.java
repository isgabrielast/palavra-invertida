import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Este é um programa simples que inverte palavras!");
        System.out.println("Digite aqui seu nome: ");

        String name = input.nextLine().toLowerCase();
        String lastLetter = name.substring(name.length() -1).toUpperCase();
        name = name.substring(0, name.length() - 1) + lastLetter;

        char[] array = name.toCharArray();

        System.out.println("Seu nome invertido é: ");
        for (int i = array.length - 1; i >= 0; i--){
                System.out.print(array[i]);
        }

       input.close();
    }
}
