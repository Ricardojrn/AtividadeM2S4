/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class Teste1 {
    public static void main (String args[]){
        
        Scanner input = new Scanner(System.in);   //Instaciando o Scanner
        //inicialização das variáveis
        String nome;
        int idade;
        
        do{
        // Aqui inicia o bloco de repetição
            System.out.print("Digite o nome: ");
            nome = input.next();
            
            System.out.print("Digite a idade: ");
            idade = input.nextInt();            
        }
        while(!nome.equals("sair")); //Condicinal para a repetição do loop
    } 
}
