package aula1java;
public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        System.out.println("Data de lançamento do filme: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        System.out.println("Nota do filme: " + notaDoFilme);

        String tipoPlano = "Plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");            
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("Plus")) {
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Faça a locação do filme.");
        }
    }
}
