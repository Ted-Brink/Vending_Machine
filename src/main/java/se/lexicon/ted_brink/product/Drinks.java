package se.lexicon.ted_brink.product;

public class Drinks extends Product {

    int nr;
    String fName;
    String description;
    int price;


    public Drinks(int nr, String fName, String description, int price) {
        this.nr = nr;
        this.fName = fName;
        this.description = description;
        this.price = price;
    }


    //Drinks pepsi = new Drinks(301, "Pepsi Cola", "Kolsyrad dryck: innehåll socker, smakämnen, färgämnen", 12);
    //Drinks fanta = new Drinks(302, "Fanta", "Kolsyrad dryck apelsinsmak: innehåll socker, smakämnen, färgämnen", 12);
    //Drinks öl = new Drinks(303, "Norrlands Guld", "Öl alkoholhalt 3.5%", 20);



    //public String use = "Open the can and drink";
    @Override
    public String use() {
        return "Open the can and drink";
    }

    @Override
    public String examine() {
        return "Nr." + nr + ", " + fName + ": " + description + ", " + price + "kr";
    }
}