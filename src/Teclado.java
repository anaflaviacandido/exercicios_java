package src;

import java.util.Scanner;

public class Teclado {
    public static void main(String[] args) {


                Scanner tl = new Scanner(System.in);

                System.out.println("Qual o seu nome?");
                String nome = tl.nextLine();
                System.out.println(nome);
                System.out.println("Qual a sua idade "  + nome + "?");
                Integer idade = tl.nextInt();
                System.out.println(idade);
                System.out.println("Qual a sua altura?");
                Double altura = tl.nextDouble();
                System.out.println(altura);





    }
}




