package exercicio01;

public class Jogador {
    //Atributos ou variáveis de instância
    String nome;
    int[] pontuacao = new int[3];

    //Método para calcular e retornar a pontuação total
    public int calcularPontuacao() {
        int total=0;
        for(int i : pontuacao) {
            total += i;
        }
        return total;

    }
}//class
