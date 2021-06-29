package se.lexicon.ted_brink.product;

public class Fruit extends Product {

    int nr;
    String fName;
    String description;
    int price;
    String use = "Eat the healthy fruit";

    public Fruit(int nr, String fName, String description, int price) {
        this.nr = nr;
        this.fName = fName;
        this.description = description;
        this.price = price;
    }

    Fruit banana = new Fruit(301, "Banana", "ecologic fruit from Panama",10);
    Fruit appel = new Fruit(302, "Appel", "Ingrid Marie from Sweden", 10);
    Fruit orange = new Fruit(303, "Orange", "From Spain", 10);



    @Override
    String use() {
        return null;
    }

    @Override
    String examine() {
        return null;
    }
}
