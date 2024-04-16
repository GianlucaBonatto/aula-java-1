package br.com.alura.screenmatch.filmes;
public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1980);
        meuFilme.setDuracaoEmMinutos(120);

    //    meuFilme.exibeFichaTecnica();
    //    meuFilme.avalia(8);
    //    meuFilme.avalia(7);
    //    meuFilme.avalia(6);
    //    System.out.println("Soma das avaliações: " + meuFilme.somaDasAvaliacoes);
       System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
    //    System.out.println("Média de avalições do filme: " + meuFilme.pegaMedia());
    }
}
