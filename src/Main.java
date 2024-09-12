package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String r;
        Scanner sc = new Scanner(System.in);
        int primeiro;
        int repetir ;
        do{
            System.out.println("Caso escolha...");
            switch (primeiro) {
                case 1:
                    System.out.println("Ótima escolha!");
                    break;
                case 2:
                    System.out.println("O valor da blusa é R$ 2,00");
                    break;
                case 3:
                    System.out.println("Falar com atendente");
                    break;
                default:
                    System.out.println("Inválido");

            }
            System.out.print("Para repetir, digite S");
            r = sc.next();
        } while (r.equalsIgnoreCase("S"));
    }
}



