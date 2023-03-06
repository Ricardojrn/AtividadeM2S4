package atividades;
import java.util.Scanner;
/**
 *
 * @author Ricardo
 */
public class Desafio {
    
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        
        double horaIngresso;
        double horaAtual;
        
        System.out.println("Seja bem-vindo! Qual a hora atual?");
        horaAtual = input.nextDouble();
        
        System.out.println("Seja bem-vindo! Qual o horário do ingresso?");
        horaIngresso = input.nextDouble();
        
        double horaCalc = horaIngresso - horaAtual;        
        double transformaMin = horaCalc*60;
        
        if (horaIngresso <= 0 || horaAtual <= 0){
            System.out.print("Valor inválido!");
        } else if (horaCalc <= 0.49 && horaCalc >= -0.49) {
            System.out.print("Entrada permitida!");
        } else if (horaCalc >0.49) {
            System.out.println("Entrada não permitida! Cliente chegou "+transformaMin+" min antes do evento.");
        } else if (horaCalc < -0.49) {
            System.out.println("Entrada não permitida! Cliente " +transformaMin+" min atrasado!");
        }
    }
}
