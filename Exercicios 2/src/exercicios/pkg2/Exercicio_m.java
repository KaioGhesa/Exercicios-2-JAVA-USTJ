package exercicios.pkg2;
import java.util.Scanner;

/*m) Faça um programa que recebe a quantidade de cilindradas (cc) de um veículo 
de competição e exibe a categoria a qual ele pertence, sendo:

- De 0cc a 120cc: “Sub Production”;
- De 121cc a 240cc: “Production”;
- Acima de 240cc: “Super Production”.**/

public class Exercicio_m {
    public static void main(String[] args) {
Scanner sc = new Scanner (System.in);

int cc;

   System.out.println("Fale quantas cc (cilindradas) tem seu carro");
   cc = sc.nextInt();


   if (cc < 120) {
       System.out.println("Sub Production");
   }

   else if (cc < 240) {
       System.out.println("Production");
   }

   else {
   System.out.println("Super Production");
}

}
}
