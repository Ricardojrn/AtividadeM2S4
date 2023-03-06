/**
 * @author Ricardo
Desafio 1 - Multa de Velocidade

Leia a velocidade de um carro e a velocidade máxima da via,
lembrando de inserir os 10% de tolerância na velocidade máxima:

1. Informe 50 reais se estiver até 10km/h acima da velocidade máxima;
2. Informe 100 reais se estiver entre 11km/h e 30km/h acima da velocidade máxima;
3. Informe 300 reais se estiver acima de 31km/h acima da velocidade máxima;
 */
package atividades;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);                         //Instaciando o Scanner
        
        System.out.print("Informe a velocidade máxima na via(Km/h): "); //Solicitando informação do usuário
        double velMaxima = input.nextDouble();                          //Armazena o valor digitado, na variável criada
        
        System.out.print("Informe a velocidade do veículo(Km/h): ");
        double velCarro = input.nextDouble();
        
        double tolerada = (velMaxima*0.1 + velMaxima);                  //calculo da tolerância de 10% solicitada
        
        double velUltra = (velCarro - velMaxima);
        
        /*
            Abaixo expressão de validação das condicões pedidas no desafio
        */
        if (((velCarro) > (tolerada)) && ((velCarro) <= (velMaxima + 10))) 
        {
            System.out.println("Veículo "+ velUltra +"Km/h acima da velocidade permitida.");
            System.out.print("Multa no valor de 10 reais.");
        }
        else if (((velCarro) > (velMaxima + 10)) && ((velCarro) <= (velMaxima + 30))) 
        {
            System.out.println("Veículo "+ velUltra +"Km/h acima da velocidade permitida.");
            System.out.print("Multa no valor de 100 reais.");
        }
        else
        {
            System.out.println("Veículo "+ velUltra +"Km/h acima da velocidade permitida.");
            System.out.println("Multa no valor de 300 reais.");
        }
        
    }
    
}
