package exercicio03;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();

        //Entrada de dados
        System.out.println("Informe as coordenadas x e y do ponto 1");
        p1.x = entrada.nextInt();
        p1.y = entrada.nextInt();

        System.out.println("Informe as coordenadas x e y do ponto 2");
        p2.x = entrada.nextInt();
        p2.y = entrada.nextInt();

        //Impressão da distância entre dois pontos
        System.out.println();
        System.out.println("Distância de p1 para p2: " + formato.format(p1.calcularDistancia(p2)));
        System.out.println("Distância de p2 para p1: " + formato.format(p2.calcularDistancia(p1)));

        //Impressão da distância de cada ponto até a origem
        System.out.println();
        System.out.println("Distância do p1 até a origem: " + formato.format(p1.calcularDistanciaAteOrigem()));
        System.out.println("Distância do p2 até a origem: " + formato.format(p2.calcularDistanciaAteOrigem()));

        //Impressão do ponto mais próximo da origem
        System.out.println();
        Ponto aux = p1.maisProximoDaOrigem(p1, p2);
        System.out.println(aux.formatarPonto());
    }//main
}//class
