import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome de algum filme");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento:");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Dê a sua avaliação para o filme");
        double avaliação = leitura.nextDouble();
        

        System.out.println("Filme: " + filme);
        System.out.println("Ano de lançamento" + anoDeLancamento);
        System.out.println("Sua nota dele" + avaliação);
    }
}
