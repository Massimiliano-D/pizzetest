package massimiliano.pizzealtavolo.classi;

import lombok.Data;

@Data


public class Tavolo {
    private int numero;
    private int numeroPersone;
    private int coperto;
    private double costoTotale = coperto * numeroPersone;
    private StatoTavolo statoTavolo;


    public Tavolo(int numero, int numeroPersone, int coperto, StatoTavolo statoTavolo) {
        this.numero = numero;
        this.numeroPersone = numeroPersone;
        this.coperto = coperto;
        this.statoTavolo = statoTavolo;
    }
}
