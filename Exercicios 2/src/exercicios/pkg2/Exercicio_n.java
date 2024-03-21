package exercicios.pkg2;
        
import java.util.Scanner;        
/*n) Faça um programa que recebe a idade de um nadador e exibe a categoria que ele pertence. Sendo o critério:
• Infantil (0 a 10 anos);
• Junior (11 a 14 anos);
• Adolescente (15 a 20 anos);
• Jovem (21 a 35 anos) 
• Máster (> 35 anos).**/
        
public class Exercicio_n {
    public static void main(String[] args) {
   
    int idade;

    Scanner sc = new Scanner(System.in);

    System.out.print("Digite a idade do nadador: ");
    idade = sc.nextInt();

    if (idade <0 ) {
        System.out.println("Idade invalida");
    }
    else {
        if (idade <= 10) {
            System.out.println("Voce esta na categoria Infantil");
        } else if (idade <= 14) {
            System.out.println("Voce esta na categoria Junior");
        } else if (idade <= 20) {
            System.out.println("Voce esta na categoria Adolescente");
        } else if (idade <= 35) {
            System.out.println("Voce esta na categoria Jovem");
        } else {
            System.out.println("Voce esta na categoria Master");
        }
    }
    }
}
