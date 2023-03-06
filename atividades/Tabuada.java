package atividades;

import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class Tabuada {
    public static void main (String args[]){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("--------------TABUADA---------------");
        int x = 0;
        int y = 2;
        System.out.print("Digite um número para calcular a tabuada: ");
        x = input.nextInt();
        while (y<=10){
            System.out.println(x+" * "+y+"= "+x*y);
            y = y+1;
        }        
        
        //PLUS TABUADA DE TODOS OS NÚMEROS DE 2 A 10
        
        System.out.println("------TABUADA COMPLETA------");
        for (int i=2; i<=9; i++){
            for (int j=0; j<=10; j++){
                System.out.println(i+"*"+j+"="+i*j);                                   
            }
            System.out.println("-------------------------");           
        }
    } 
}
