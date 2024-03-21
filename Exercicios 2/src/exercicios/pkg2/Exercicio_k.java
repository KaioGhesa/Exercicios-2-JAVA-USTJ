package exercicios.pkg2;
import java.util.Scanner;

/*Faça um programa que recebe duas datas distintas e exibe a mais recente. 
Cada data deve ser fornecida como três valores inteiros, 
onde o primeiro representa o dia, o segundo o mês e o terceiro o ano. 
Dica: comece verificando pelo ano.**/

public class Exercicio_k {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a primeira data (dia mes ano):");
        int dia1 = sc.nextInt();
        int mes1 = sc.nextInt();
        int ano1 = sc.nextInt();
        
        System.out.println("Digite a segunda data (dia mes ano):");
        int dia2 = sc.nextInt();
        int mes2 = sc.nextInt();
        int ano2 = sc.nextInt();
        
        if (ano1>ano2){
            System.out.println("A primeira data é mais recente: " + dia1 + "/" + mes1 + "/" + ano1);
        }else if (ano1<ano2) {
            System.out.print("A seguunda data é mais recente: " + dia2 + "/" + mes2 + "/" + ano2);
        }else {
        if (mes1>mes2){
            System.out.println("A primeira data é mais recente: " + dia1 + "/" + mes1 + "/" + ano1);
        } else if (mes1<mes2){
        System.out.print("A seguunda data é mais recente: " + dia2 + "/" + mes2 + "/" + ano2);
        }
        else {
                if (dia1>dia2){
                 System.out.print("A primeira data é mais recente: " + dia2 + "/" + mes2 + "/" + ano2);
                    }else if (dia2>dia1){
                        System.out.print("A seguunda data é mais recente: " + dia2 + "/" + mes2 + "/" + ano2);   
                            }
                   else {
                    System.out.println("Datas iguais");}
        }
       }
    }
}
