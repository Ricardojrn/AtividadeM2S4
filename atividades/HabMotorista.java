package atividades;
import java.util.Scanner;
/**
 *
 * @author Ricardo
 */
public class HabMotorista {
    public static void main (String args[]){
    
        int anoNasc;      // ano de nascimento do aluno
        float notaPsico=0;  // nota exame Psicotecnico
        float notaPratico=0;// nota exame prático
        float media = (notaPratico + notaPsico)/2;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o ano de Nascimento do aluno:");
        anoNasc = input.nextInt();
        int idade = 2023-anoNasc;
        
        if (idade < 18){
            System.out.println("Aluno não possui idade para dirigir!");
        }else{
            System.out.println("Nota do exame psicotécnico:");
            notaPsico = input.nextInt();
            System.out.println("Nota do exame prático:");
            notaPratico = input.nextInt();
            
            if (notaPsico<5){
                System.out.println("Aluno REPROVADO no exame Psicotécnico.");
            } else if(notaPratico<5){
                System.out.println("Aluno REPROVADO no exame Prático.");
            }else{
                System.out.println("Aluno APROVADO");
            }
        }
    }
}
