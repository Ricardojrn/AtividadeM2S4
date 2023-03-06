package atividadesM3S2;
/**@author Ricardo
Pseudocódigo 2
    inicio
        var double peso, altura, imc;

        escreva(“Digite seu peso: ”);
        leia(peso)

        escreva(“Digite seu altura: ”);
        leia(altura)

        imc = peso / (altura * altura);
        se (IMC < 18.5) entao
          escreva(“Abaixo do peso normal”);
        senao se (IMC >= 18.5 & IMC <= 24.9) entao
          escreva(“Peso normal”);
        senao se (IMC >= 25.0 & IMC <= 29.9) entao
          escreva(“Excesso de peso”);
        senao se (IMC >= 30.0 & IMC <= 34.9) entao
          escreva(“Obesidade classe I”);
        senao se (IMC >= 35.0 & IMC <= 39.9) entao
          escreva(“Obesidade classe II”);
        senao se (IMC >= 40.0) entao
          escreva(“Obesidade classe III”);
        fimSe
    fimAlgoritmo
 */
import java.util.Scanner;

public class CalculoIMC2 {    
    
    public static void main (String args[]){
        double peso, altura, imc;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite seu peso: ");
        peso = input.nextDouble();
        
        System.out.println("Digite sua altura: ");
        altura = input.nextDouble();
        
        imc = peso / (altura*altura);
        
       if (imc < 18.5){
           System.out.println("Abaixo do peso normal");
       } else if (imc >= 18.5 && imc <= 24.9){
           System.out.println("Peso normal");
       } else if (imc >= 25 && imc <= 29.9){
           System.out.println("Excesso de peso");
       } else if (imc >= 30 && imc <= 34.9){
           System.out.println("Obesidade classe I");
       } else if (imc >= 35 && imc <= 39.9){
           System.out.println("Obesidade classe II");
       } else if (imc >= 40){
           System.out.println("Obesidade classe III");
       }
    }
}
