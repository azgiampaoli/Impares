/*Escreva um programa que carregue dois valores A e B pelo teclado e imprima todos os números
ímpares entre A e B*/

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int a = sc.nextInt();
        System.out.println("Digite um número:");
        int b = sc.nextInt();

        for(int i = a; i<b; i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }

    }
}
