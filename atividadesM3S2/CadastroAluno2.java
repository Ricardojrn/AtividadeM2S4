package atividadesM3S2;
import java.util.Scanner;
/**@author Ricardo
Pseudocódigo 4
    inicio
        var quantidadeAluno;
        var String nome, disciplina;
        var double media;
        var int contador = 1;

        escreva(“Digite a quantidade de alunos que deseja digitar:  ”);
        leia(quantidade)

        enquanto (contador <= quantidade) faca
          escreva(“Digite o nome do aluno:  ”);
          leia (nome)
          escreva(“Digite a disciplina:  ”);
          leia (disciplina)
          escreva(“Digite a média final da disciplina:  ”);
          leia (media)
          contador = contador + 1;
        fimEnquanto

        escreva(“Aluno:  ” + nome + “ da disciplina: ” + disciplina + “ com média =  ” + media);
    fimAlgoritmo
 */
public class CadastroAluno2 {
    public static void main (String args[]){
        int qntAluno;
        String nome, disciplina;
        double media;
        int contador = 1;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de alunos: ");
        qntAluno = input.nextInt();
        
        while (contador <= qntAluno){
            System.out.println("Digite o nome do aluno: ");
            nome = input.next();
            
            System.out.println("Digite a disciplina: ");
            disciplina = input.next();
            
            System.out.println("Digite a média final da disciplina: ");
            media = input.nextDouble();
            
            contador = contador + 1;
            System.out.println("Aluno: "+nome+" ficou com média = "+media+" na disciplina: "+disciplina);
        }
    }
}
