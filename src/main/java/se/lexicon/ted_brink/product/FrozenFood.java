package se.lexicon.ted_brink.product;

public class FrozenFood extends Product{

    int nr;
    String fName;
    String description;
    int price;

    public FrozenFood(int nr, String fName, String description, int price) {
        this.nr = nr;
        this.fName = fName;
        this.description = description;
        this.price = price;
    }


    //FrozenFood pizza = new FrozenFood(201,"Pizza","Ost, skinka, tomat, champion", 38);
    //FrozenFood pirog = new FrozenFood(202,"Pirog"," Nötkött, ost, tomatpure, lök",30);
    //FrozenFood köttbull = new FrozenFood(203, "Köttbullar med potatismos", "Köttbullar, potatismos, lingonsylt", 50);

  // FrozenFood[]frozenF = {pizza, pirog, köttbull};




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
        return "Nr." + nr + ". " + fName + ", innehåll:" + description + ", price:" + price + " kr";
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

    public String description () {
       return description + ", price: " + price;


    }






    @Override
    public String use() {
        return "Warm in micro";
    }

    @Override
    public String examine() {
       return getDescription();
    }
}
