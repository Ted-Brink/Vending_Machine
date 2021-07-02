package se.lexicon.ted_brink.product;

public abstract class Product {



    public abstract String use();
    public abstract String examine();

    int nr;
    String fName;
    String description;
    int price;

    public Product() {
    }

    public Product(int nr, String fName, String description, int price) {
        this.nr = nr;
        this.fName = fName;
        this.description = description;
        this.price = price;
    }
/*
    FrozenFood pizza = new FrozenFood(101,"Pizza","Ost, skinka, tomat, champion", 38);
    FrozenFood pirog = new FrozenFood(102,"Pirog"," Nötkött, ost, tomatpure, lök",30);
    FrozenFood köttbull = new FrozenFood(103, "Köttbullar med potatismos", "Köttbullar, potatismos, lingonsylt", 50);

    Fruit banana = new Fruit(201, "Banana", "ecologic fruit from Panama",10);
    Fruit appel = new Fruit(202, "Appel", "Ingrid Marie from Sweden", 10);
    Fruit orange = new Fruit(203, "Orange", "From Spain", 10);

    Drinks pepsi = new Drinks(301, "Pepsi Cola", "Kolsyrad dryck: innehåll socker, smakämnen, färgämnen", 12);
    Drinks fanta = new Drinks(302, "Fanta", "Kolsyrad dryck apelsinsmak: innehåll socker, smakämnen, färgämnen", 12);
    Drinks öl = new Drinks(303, "Norrlands Guld", "Öl alkoholhalt 3.5%", 20);

    */
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
}
