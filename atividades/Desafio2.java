/**
 * @author Ricardo
Desafio 2 - Soma de Números Digitados

Escreva um algoritmo que leia uma sequência de números do usuário e realize a soma desses números. 
Obs. Encerre a execução quando um número negativo for digitado.
 */

package atividades;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);   //Instaciando o Scanner
        //inicialização das variáveis
        double numero1;
        double numero2;
        double soma;
        
        do{
        // Aqui inicia o bloco de repetição
            System.out.println("___________________________________________");
            System.out.println("       SOMA DE DOIS NUMEROS POSITIVOS      ");
            System.out.println("___________________________________________");
            System.out.print("Digite o primeiro número: ");
            numero1 = input.nextDouble();
            
            System.out.print("Digite o segundo número: ");
            numero2 = input.nextDouble();
            
            soma = numero1 + numero2;
            
            System.out.println("A soma dos dois número é "+soma);
            
        }
        while(numero1 > 0 && numero2 > 0); //Condicinal para a repetição do loop
        
        System.out.println("Um dos números digitados não é positivo");
    }
}
