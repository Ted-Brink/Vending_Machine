package se.lexicon.ted_brink;

import se.lexicon.ted_brink.product.Drinks;
import se.lexicon.ted_brink.product.FrozenFood;
import se.lexicon.ted_brink.product.Fruit;
import se.lexicon.ted_brink.product.Product;
/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        FrozenFood pizza = new FrozenFood(201, "Pizza", "Ost, skinka, tomat, champion", 38);
        FrozenFood pirog = new FrozenFood(202, "Pirog", " Nötkött, ost, tomatpure, lök", 30);
        FrozenFood köttbull = new FrozenFood(203, "Köttbullar med potatismos", "Köttbullar, potatismos, lingonsylt", 50);

        System.out.println(pizza.use());
        System.out.println(pizza.examine());

        Fruit banana = new Fruit(201, "Banana", "ecologic fruit from Panama", 10);
        Fruit appel = new Fruit(202, "Appel", "Ingrid Marie from Sweden", 10);
        Fruit orange = new Fruit(203, "Orange", "From Spain", 10);

        System.out.println(orange.examine() + " ." + orange.use());

        Drinks pepsi = new Drinks(301, "Pepsi Cola", "Kolsyrad dryck: innehåll socker, smakämnen, färgämnen", 12);
        Drinks fanta = new Drinks(302, "Fanta", "Kolsyrad dryck apelsinsmak: innehåll socker, smakämnen, färgämnen", 12);
        Drinks öl = new Drinks(303, "Norrlands Guld", "Öl, alkoholhalt 3.5%", 20);

        System.out.println(öl.examine() + " " + öl.use());
    }
}