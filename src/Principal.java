public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1980;
        meuFilme.duracaoEmMinutos = 120;

       meuFilme.exibeFichaTecnica();
       meuFilme.avalia(8);
       meuFilme.avalia(7);
       meuFilme.avalia(6);
       System.out.println(meuFilme.somaDasAvaliacoes);
       System.out.println(meuFilme.totalDeAvaliacoes);
       System.out.println(meuFilme.pegaMedia());
    }
}