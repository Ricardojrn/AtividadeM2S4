package atividadesM3S2;
import java.util.Scanner;
/**@author Ricardo
Pseudocódigo 3
    inicio
      var quantidadeAluno;
      var String nome, disciplina;
      var double media;
      var int contador;

      escreva(“Digite a quantidade de alunos que deseja digitar:  ”);
      leia(quantidade)

      para (contador de 1 ate quantidade incrementa 1) faca
        escreva(“Digite o nome do aluno:  ”);
        leia (nome)
        escreva(“Digite a disciplina:  ”);
        leia (disciplina)
        escreva(“Digite a média final da disciplina:  ”);
        leia (media)
      fimPara

      escreva(“Aluno:  ” + nome + “ da disciplina: ” + disciplina + “ com média =  ” + media);
    fimAlgoritmo
 */
public class CadastroAluno {
    public static void main (String args[]){
        int qntAluno;
        String nome, disciplina;
        double media;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de alunos: ");
        qntAluno = input.nextInt();
        
        for (int contador = 0; contador < qntAluno; contador ++){
            System.out.println("Digite o nome do aluno: ");
            nome = input.next();
            
            System.out.println("Digite a disciplina: ");
            disciplina = input.next();
            
            System.out.println("Digite a média final da disciplina: ");
            media = input.nextDouble();
            
            System.out.println("Aluno: "+nome+" ficou com média = "+media+" na disciplina: "+disciplina);
        }
    }
}
