package br.com.alura.screenmatch.calculos;

// import br.com.alura.screenmatch.filmes.Filme;
import br.com.alura.screenmatch.filmes.Titulo;

public class calculadoraDetempo {
    private int tempoTotal;

    public int getTempoTotal () {
        return tempoTotal;
    }

    // public void inclui (Filme f) {
    //     tempoTotal += f.getduracaoEmMinutos();
    // }
    public void inclui (Titulo titulo) {
        this.tempoTotal += titulo.getduracaoEmMinutos();
    }
}