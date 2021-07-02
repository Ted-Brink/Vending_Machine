package se.lexicon.ted_brink;

import se.lexicon.ted_brink.product.*;


public class StandardVendingMachine implements VendingMachine {

    int depositPool;

    FrozenFood pizza = new FrozenFood(101, "Pizza", "Ost, skinka, tomat, champion", 50);
    FrozenFood pirog = new FrozenFood(102, "Pirog", " Nötkött, ost, tomatpure, lök", 30);
    FrozenFood köttbull = new FrozenFood(103, "Köttbullar med potatismos", "Köttbullar, potatismos, lingonsylt", 50);

    Fruit banana = new Fruit(201, "Banana", "ecologic fruit from Panama", 10);
    Fruit appel = new Fruit(202, "Appel", "Ingrid Marie from Sweden", 10);
    Fruit orange = new Fruit(203, "Orange", "From Spain", 10);

    Drinks pepsi = new Drinks(301, "Pepsi Cola", "Kolsyrad dryck: innehåll socker, smakämnen, färgämnen", 12);
    Drinks fanta = new Drinks(302, "Fanta", "Kolsyrad dryck apelsinsmak: innehåll socker, smakämnen, färgämnen", 12);
    Drinks öl = new Drinks(303, "Norrlands Guld", "Öl alkoholhalt 3.5%", 20);

    Product[] products = {pizza, pirog, köttbull, banana, appel, orange, pepsi, fanta, öl};


        void addCurrency(int amount) { // Add to deposit pool (MoneyPool)
            depositPool = amount;
        }




    //Product request (int productNumber) {
    //    return


// Buy a product
//    int endSession() {}                           // Return changes and reset deposit pool
//    String getDescriptions(int productNumber) {}  // View a product description
//    int getBalance() {}                           // return the deposit pool amount

   /*  void getProducts() {                           //return all Products name and product numbers
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].getNr()); // + ": " + products[i].getfName());
        }
*/

       /*  String[]produkter = new String[products.length];

         for(int i =0; i < products.length; i++){
             produkter[i] = String.valueOf(products[i].getNr() + ": " + products[i].getfName());
         }

*/

 //   public static String[] getProducts(){

   //     return products;


}





