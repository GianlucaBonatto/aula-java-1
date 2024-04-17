package br.com.alura.screenmatch.filmes;

public class Filme {

    private String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;


     String getNome () {
        return nome;
    }

    int getTotalDeAvaliacoes () {
        return totalDeAvaliacoes;
    }

    double getSomaDasAvaliacoes () {
        return somaDasAvaliacoes;
    }
    
    public void avalia (double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
     }
      

    private double pegaMedia () {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    double getPegamedia () {
        return pegaMedia () ;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento (int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano (boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos (int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }


    public void exibeFichaTecnica () {
        System.out.println("Filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração do filme: " + duracaoEmMinutos);
        System.out.println("Incluído no plano: " + incluidoNoPlano);
    }

}