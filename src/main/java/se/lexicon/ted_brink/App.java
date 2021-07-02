package se.lexicon.ted_brink;

import se.lexicon.ted_brink.product.Drinks;
import se.lexicon.ted_brink.product.FrozenFood;
import se.lexicon.ted_brink.product.Fruit;
import se.lexicon.ted_brink.product.Product;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {


    public static void main(String[] args) {
        System.out.println("Hello World!");

        FrozenFood pizza = new FrozenFood(101, "Pizza", "Ost, skinka, tomat, champion", 38);
        FrozenFood pirog = new FrozenFood(102, "Pirog", " Nötkött, ost, tomatpure, lök", 30);
        FrozenFood köttbull = new FrozenFood(103, "Köttbullar med potatismos", "Köttbullar, potatismos, lingonsylt", 50);

        //FrozenFood[]frozenF = {pizza, pirog, köttbull};
        Product[] varor = {pizza, pirog, köttbull};

        System.out.println("Pizza " + pizza.use() + " " + pizza.examine());
        System.out.println(varor[0].use() + " test array");
        System.out.println(varor[0].examine() + " test array");


        Fruit banana = new Fruit(201, "Banana", "ecologic fruit from Panama", 10);
        Fruit appel = new Fruit(202, "Appel", "Ingrid Marie from Sweden", 10);
        Fruit orange = new Fruit(203, "Orange", "From Spain", 10);

        System.out.println(orange.examine() + " ." + orange.use());

        Drinks pepsi = new Drinks(301, "Pepsi Cola", "Kolsyrad dryck: innehåll socker, smakämnen, färgämnen", 12);
        Drinks fanta = new Drinks(302, "Fanta", "Kolsyrad dryck apelsinsmak: innehåll socker, smakämnen, färgämnen", 12);
        Drinks öl = new Drinks(303, "Norrlands Guld", "Öl, alkoholhalt 3.5%", 20);


        System.out.println(öl.examine() + " " + öl.use());

        String[] produkter = new String[varor.length];
        for (int i = 0; i < varor.length; i++) {
            produkter[i] = (varor[i].getNr() + ": " + varor[i].getfName());
        }
       // System.out.println(Arrays.toString(produkter));

        for (int i = 0; i < produkter.length; i++)
            System.out.println(produkter[i]);

        // Söka efter priset på en produkt
        int p=0;
        for(int i = 0; i < varor.length; i++){
            if (varor[i].getNr()==101)
                 p = varor[i].getPrice();
            System.out.println(p);
            break;
        }



    }
}