package exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        Jogador jogador = new Jogador();

        //Entrada de dados
        System.out.print("Nome do jogador: ");
        jogador.nome=entrada.next();
        for (int i=0; i<jogador.pontuacao.length; i++) {
            System.out.print("Pontuação " + (i+1) + ": ");
            jogador.pontuacao[i] = entrada.nextInt();
        }

        //Saída de Dados
        System.out.println();
        System.out.print("Nome: " + jogador.nome);
        System.out.print("Pontuação Total: " + jogador.calcularPontuacao());
    }//main
}//class
