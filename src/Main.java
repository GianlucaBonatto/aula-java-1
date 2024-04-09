public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        
        // boolean incluidoNoPlano = true;
        // System.out.println(incluidoNoPlano);
        
        // NOTA DO FILME
        // double notaDoFilme = 8.1;
        // System.out.println(notaDoFilme); 

        double media = (8.5 + 6.3 + 7.2) /3;
        System.out.println("Media do filme: " + media);
        // System.out.println(media); Media do filme, mas eu botei ali em cima para roda do lado.

        
        String sinopse;
        sinopse = """
                Filme de ação com um doidão ai.
                Falam que é bom, mas nunca vi e é isso msm.
                Nota do filme: 8.1
                """;
        System.out.println(sinopse);  
        
        int classificacao;
        classificacao = (int) (media /2);
        System.out.println("Estrelas: " + classificacao);


        System.out.println("Todos os dados são tirados da minha cabeça");
    }
}


