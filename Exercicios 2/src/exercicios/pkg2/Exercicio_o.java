package exercicios.pkg2;
import java.util.Scanner;

/*Desenvolva um programa que, com base em duas notas de provas e três notas de trabalhos dadas pelo usuário,
exibe uma mensagem indicando se o aluno foi aprovado, reprovado ou se fará o exame.
• 6 ≤ 𝑀é𝑑𝑖𝑎 𝑓𝑖𝑛𝑎𝑙 ≤ 10, 𝑎𝑝𝑟𝑜𝑣𝑎𝑑𝑜
• 4 ≤ 𝑀é𝑑𝑖𝑎 𝑓𝑖𝑛𝑎𝑙 < 6, 𝑒𝑥𝑎𝑚𝑒
• 0 ≤ 𝑀é𝑑𝑖𝑎 𝑓𝑖𝑛𝑎𝑙 < 4, 𝑟𝑒𝑝𝑟𝑜𝑣𝑎𝑑𝑜
• Considere que 𝑀é𝑑𝑖𝑎 𝑓𝑖𝑛𝑎𝑙 = A1 (até 3 pontos) + A2 (até 3 pontos) + A3 (até 4 pontos)*/

public class Exercicio_o {
    public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
    
    
    double a1,a2,a3, media;

    System.out.print("A1= ");
    a1 = sc.nextDouble();

    System.out.print("A2= ");
    a2 = sc.nextDouble();

    System.out.print("A3= ");
    a3 = sc.nextDouble();

    media = ((a1 * 3) + (a2 * 3) + (a3 * 4)) / 10;

    if (media >= 6 && media <= 10) {
        System.out.println("Aprovado");
    }

    else if (media > 4) {
        System.out.println("Exame");
    }

    else {
        System.out.println("Reprovado");
    }
}
}
