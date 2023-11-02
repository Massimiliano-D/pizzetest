package massimiliano.pizzealtavolo.classi;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Topping {
    String name;
    double prezzo;
    int calorie;
}
