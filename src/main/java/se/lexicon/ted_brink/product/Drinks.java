package se.lexicon.ted_brink.product;

public class Drinks extends Product {

/*    int nr;
    String fName;
    String description;
    int price;              */





    public Drinks(int nr, String fName, String description, int price) {
        this.nr = nr;
        this.fName = fName;
        this.description = description;
        this.price = price;
    }

    @Override
    public String use() {
        return "Open the can and drink";
    }

    @Override
    public String examine() {
        return "Nr." + nr + ", " + fName + ": " + description + ", " + price + "kr";
    }
}