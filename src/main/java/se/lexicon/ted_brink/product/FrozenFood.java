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

    @Override
    public int getNr() {
        return nr;
    }

    @Override
    public void setNr(int nr) {
        this.nr = nr;
    }

    @Override
    public String getfName() {
        return fName;
    }

    @Override
    public void setfName(String fName) {
        this.fName = fName;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
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
