package exercicios.pkg2;
import java.util.Scanner;

/*f) Faça um programa que recebe três números reais e 
os exibe em ordem crescente.**/

public class Exercicio_f {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    
    double num1, num2, num3;

    System.out.println("Fale seu numero: ");
    num1 = sc.nextDouble();

    System.out.println("Fale seu numero: ");
    num2 = sc.nextDouble();

    System.out.println("Fale seu numero: ");
    num3 = sc.nextDouble();

  if (num1 <= num2 && num1 <= num3) {
        if (num2 <= num3) {
            System.out.println("Sua ordem é: " + num1 + " " + num2 + " " + num3);
        } else {
            System.out.println("Sua ordem é: " + num1 + " " + num3 + " " + num2);
        }
    } else if (num2 <= num1 && num2 <= num3) {
        if (num1 <= num3) {
            System.out.println("Sua ordem é: " + num2 + " " + num1 + " " + num3);
        } else {
            System.out.println("Sua ordem é: " + num2 + " " + num3 + " " + num1);
        }
    } else {
        if (num1 <= num2) {
            System.out.println("Sua ordem é: " + num3 + " " + num1 + " " + num2);
        } else {
            System.out.println("Sua ordem é: " + num3 + " " + num2 + " " + num1);
        }
    }
    }
}
