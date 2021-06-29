package se.lexicon.ted_brink;


import se.lexicon.ted_brink.product.Drinks;
import se.lexicon.ted_brink.product.FrozenFood;
import se.lexicon.ted_brink.product.Product;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");


        FrozenFood pizza = new FrozenFood(201,"Pizza","Ost, skinka, tomat, champion", 38);
    //    FrozenFood pirog = new FrozenFood(202,"Pirog"," Nötkött, ost, tomatpure, lök",30);
    //    FrozenFood köttbull = new FrozenFood(203, "Köttbullar med potatismos", "Köttbullar, potatismos, lingonsylt", 50);


        String foo = pizza.use();
        System.out.println(foo);
}
}


