package massimiliano.pizzealtavolo;

import massimiliano.pizzealtavolo.classi.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("application.properties")
public class BeansConfiguration {


    @Bean
    Topping getPeperoncino() {
        return new Topping("peperoncino", 0.40, 3);
    }

    @Bean
    Topping getPanna() {
        return new Topping("panna", 0.60, 6);
    }

    @Bean
    Topping getVentricina() {
        return new Topping("ventricina", 0.80, 8);
    }

    @Bean
    Topping getAnanas() {
        return new Topping("ananas", 2.00, 4);
    }

    @Bean
    Pizza getMarghe() {
        return new Pizza("margherita", 4.99, 1104, new ArrayList<Topping>());

    }

    @Bean
    Pizza getDiavola() {
        List<Topping> ingr = new ArrayList<Topping>();
        ingr.add(getPeperoncino());
        ingr.add(getVentricina());
        return new Pizza("diavola", 5.99, 1200, ingr);
    }

    @Bean
    Pizza getAmericana() {
        List<Topping> ingr = new ArrayList<Topping>();
        ingr.add(getAnanas());
        ingr.add(getPanna());
        return new Pizza("americana", 10.99, 2400, ingr);
    }

    @Bean
    Drink getLemonade() {
        return new Drink("Lemonade (0.33l)", 1.29, 128);
    }

    @Bean
    Drink getWater() {
        return new Drink("Water (0.5l)", 1.29, 0);
    }

    @Bean
    Drink getWine() {
        return new Drink("Wine (0.75l), 13%", 7.49, 607);
    }

    @Bean
    void menu() {
        System.out.println("PIZZE");
        List<Pizza> listaPizze = new ArrayList<>();
        listaPizze.add(getMarghe());
        listaPizze.add(getDiavola());
        listaPizze.add(getAmericana());
        System.out.println(listaPizze);

        System.out.println("TOPPINGS");
        List<Topping> listaToppings = new ArrayList<>();
        listaToppings.add(getPeperoncino());
        listaToppings.add(getPanna());
        listaToppings.add(getVentricina());
        listaToppings.add(getAnanas());
        System.out.println(listaToppings);

        System.out.println("BEVANDE");
        List<Drink> listaBevande = new ArrayList<>();
        listaBevande.add(getLemonade());
        listaBevande.add(getWater());
        listaBevande.add(getWine());
        System.out.println(listaBevande);

    }

    @Bean
    Tavolo getTavolo(@Value("${coperto.costo}") int coperto) {
        return new Tavolo(1, 6, coperto, StatoTavolo.OCCUPATO);
    }

    @Bean
    Ordine getOrdine(@Value("${coperto.costo}") int coperto) {
        List<Pizza> pizza = new ArrayList<>();
        pizza.add(getMarghe());
        pizza.add(getMarghe());
        pizza.add(getDiavola());
        pizza.add(getDiavola());
        pizza.add(getAmericana());
        pizza.add(getAmericana());
        List<Drink> drink = new ArrayList<>();
        drink.add(getLemonade());
        drink.add(getWater());
        drink.add(getWater());
        drink.add(getWater());
        drink.add(getWater());
        drink.add(getWine());

        return new Ordine(1, StatoOrdine.IN_CORSO, pizza, drink, 6, coperto, LocalDateTime.now());
    }
}