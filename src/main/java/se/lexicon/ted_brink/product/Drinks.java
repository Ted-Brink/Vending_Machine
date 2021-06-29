package se.lexicon.ted_brink.product;

public class Drinks extends Product {

    //public String examine = "skadligt innehåll";
    public String use = "Open the can and drink";



    @Override
    String use() {
        return use;
    }

    @Override
    String examine() {
        return null;
    }
}