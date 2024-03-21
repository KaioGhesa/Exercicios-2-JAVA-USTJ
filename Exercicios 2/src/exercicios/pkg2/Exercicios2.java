package exercicios.pkg2;
import java.util.Scanner;

/*a) Faça um programa que recebe duas notas, exibe a média aritmética das notas 
e uma mensagem indicando se o aluno foi aprovado ou reprovado. 
A média para aprovação deve ser maior que seis.**/

public class Exercicios2 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);    
    
    float a1, a2, media;

    System.out.print("Digite sua primeira nota: ");
    a1 = sc.nextFloat();

    System.out.print("Digite sua segunda nota: ");
    a2 = sc.nextFloat();

    media = ((a1 + a2)) /2;

    if (media >= 6 && media <=10)
    {
        System.out.println("Parabens sua media é: " + media + " passou de ano");
    }

    else if (media <6 && media >= 0)
    {
        System.out.println("Infelizmente sua nota é: " + media + "Reprovado");
    }

    else {
        System.out.println("Nota Invalida");
    }
    }
}
