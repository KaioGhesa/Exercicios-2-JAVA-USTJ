package exercicios.pkg2;
import java.util.Scanner;

/*e) Faça um programa que recebe um número inteiro e 
exibe uma mensagem indicando se ele é par ou ímpar 
(use o operador % para obter o resto de uma divisão inteira).**/

public class Exercicio_e {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    
    
    int numero;

    System.out.println("Digite um numero");
    numero = sc.nextInt();


    if (numero % 2 == 0){
        System.out.println("Par");
    }
    else {
        System.out.println("Impar");
    }
}
}
