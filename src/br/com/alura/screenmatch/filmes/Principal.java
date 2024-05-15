package br.com.alura.screenmatch.filmes;

import br.com.alura.screenmatch.calculos.calculadoraDetempo;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1980);
        meuFilme.setDuracaoEmMinutos(120);
        
       meuFilme.exibeFichaTecnica();
       meuFilme.avalia(8);
       meuFilme.avalia(7);
       meuFilme.avalia(6);
    //    System.out.println("Duração do filme em minutos " + meuFilme.getduracaoEmMinutos());
    
    System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
    System.out.println(meuFilme.getPegamedia());
    //   System.out.println("Média de avalições do filme: " + meuFilme.getPegamedia());
    //   System.out.println("Soma das avaliações: " + meuFilme.somaDasAvaliacoes);

    Serie serie = new Serie();
        serie.setNome ("Alguma coisa");
        serie.setAnoDeLancamento(2020);
        serie.exibeFichaTecnica();
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada (10);
        serie.setMinutosPorEpisodio(30);
        System.out.println("Duração total em minutos " + serie.getduracaoEmMinutos());

        calculadoraDetempo calculadora = new calculadoraDetempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());
    }
}
