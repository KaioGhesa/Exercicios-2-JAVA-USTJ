package exercicios.pkg2;
import java.util.Scanner;

/* h) Desenvolva um programa que recebe a base e a altura de três triângulos
e exibe a maior área. 
Lembre-se da fórmula: 𝐴 = 𝑏𝑎𝑠𝑒 ×𝑎𝑙𝑡𝑢𝑟𝑎 / 2 **/

public class Exercicio_h {
    public static void main(String[] args) {
Scanner sc = new Scanner (System.in);

double area1, altura1, base1, area2, altura2, base2, area3, altura3, base3 ;

System.out.print("Digite a base do primeiro triangulo: ");
base1 = sc.nextDouble();

System.out.print("Digite a altura do primeiro triangulo: ");
altura1 = sc.nextDouble();

area1 = (altura1 * base1) /2;


System.out.print("Digite a base do segundo triangulo: ");
base2 = sc.nextDouble();

System.out.print("Digite a altura do segundo triangulo: ");
altura2 = sc.nextDouble();

area2 = (altura2 * base2) /2;


System.out.print("Digite a base do terceiro triangulo: ");
base3 = sc.nextDouble();

System.out.print("Digite a altura do terceiro triangulo: ");
altura3 = sc.nextDouble();

area3 = (altura3 * base3) /2;


double maiorArea = area1;
int trianguloMaiorArea = 1;

if (area2 > maiorArea) {
    maiorArea = area2;
    trianguloMaiorArea = 2;
}

if (area3 > maiorArea) {
    maiorArea = area3;
    trianguloMaiorArea = 3;
}

System.out.println("A maior area e: " + maiorArea);
System.out.println("O triangulo com a maior area e o numero: " + trianguloMaiorArea);
}
}
