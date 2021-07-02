package se.lexicon.ted_brink.product;

public class Fruit extends Product {

/*    int nr;
    String fName;
    String description;
    int price;  */

    public Fruit(int nr, String fName, String description, int price) {
        this.nr = nr;
        this.fName = fName;
        this.description = description;
        this.price = price;
    }

    @Override
    public String use() {
        return "Eat the healthy fruit";
    }

    @Override
    public String examine() {
        return "Nr." + nr + ", " + fName + " " + description + ", price:" + price + "kr";
    }
}