package massimiliano.pizzealtavolo.classi;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor

public class Ordine {
    int numeroOrdine;
    StatoOrdine statoOrdine;
    private List<Pizza> pizza;
    private List<Drink> drink;
    private int numeroPersone;
    private int coperto;
    private LocalDateTime acquisizione;


    public double getConto() {
        double totPizze = pizza.stream().mapToDouble(Pizza::getPrezzo).sum();
        double totDrink = drink.stream().mapToDouble(Drink::getPrezzo).sum();
        int totCoperti = coperto * numeroPersone;
        return totPizze + totDrink + totCoperti;
    }


}
