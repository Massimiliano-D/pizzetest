package massimiliano.pizzealtavolo.classi;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Drink {
    String name;
    double prezzo;
    int calorie;
}
