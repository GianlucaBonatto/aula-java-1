import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliação = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Dê a sua avaliação para o filme");
            nota = leitura.nextDouble();
            mediaAvaliação += nota; 
            //Pode ser feito tbm desse jeito: mediaAvaliação = mediaAvaliação + nota;

        }

        System.out.println("Media de avaliações " + mediaAvaliação /3);
        

    }
}
