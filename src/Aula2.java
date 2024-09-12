package src;

import java.util.Scanner;


public class Aula2 {
    public static void main(String[] args) {

        Scanner tl = new Scanner(System.in);

        Scanner tl2 = new Scanner(System.in);

         int primeiro;
         int repetir ;

        do{
            System.out.println( "digite 1 para cadastrasr uma pessoa:");
            primeiro=tl.nextInt();
            switch (primeiro) {
                case 1:
                    System.out.println("Qual o seu nome?");
                    String nome = tl2.nextLine();
                    System.out.println(nome);

                    System.out.println("Qual a sua idade ?");
                    Integer idade = tl.nextInt();
                    System.out.println(idade);

                    System.out.println("Qual a sua altura?");
                    Double altura = tl.nextDouble();
                    System.out.println(altura);

                    break;
            }
            System.out.print("Para repetir, digite 0");
            repetir=tl.nextInt();
        }while(repetir ==0);

    }
}
