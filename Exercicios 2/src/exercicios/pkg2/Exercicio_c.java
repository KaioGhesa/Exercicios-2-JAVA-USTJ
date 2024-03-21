package exercicios.pkg2;
import java.util.Scanner;

/*Faça um programa que recebe dois números inteiros distintos e exibe o maior.**/

public class Exercicio_c {
    
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    int num1, num2;

    System.out.print("Digite o primeiro numero: ");
    num1 = sc.nextInt();

    System.out.print("Digite o segundo numero: ");
    num2 = sc.nextInt();

    if (num1 >num2){
        System.out.println("Primeiro numero maior");
    }

    else if (num1 < num2) {
        System.out.println("Segundo numero maior");
    }

    else{
        System.out.println("Numero Iguais");
    }


}
    
}
