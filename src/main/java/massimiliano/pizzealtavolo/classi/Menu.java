package massimiliano.pizzealtavolo.classi;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Menu {
    private List<Pizza> pizza;
    private List<Drink> drink;
    private List<Topping> topping;
}
