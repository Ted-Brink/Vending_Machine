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
/*
    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
            */
    @Override
    public String use() {
        return "Eat the healthy fruit";
    }

    @Override
    public String examine() {
        return "Nr." + nr + ", " + fName + " " + description + ", price:" + price + "kr";
    }
}