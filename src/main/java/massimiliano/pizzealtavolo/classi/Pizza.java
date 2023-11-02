package massimiliano.pizzealtavolo.classi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Pizza {
    private final String base1 = "pomodoro";
    private final String base2 = "mozzarella";
    String name;
    double prezzo;
    int calorie;
    private List<Topping> topping = new ArrayList<>();
}
