import java.util.ArrayList;


public class Main {
    public static  void main (String[] args ){

            Category a1= new Category();
            Category a2 = new Category("Cars");

            Category a3 = new Category("phones","samsung-galaxy 10");

                 a1.addProducts("redbull");
                 a2.addProducts("volvo");
                 a3.addProducts("iphone");

               a1.getProducts();
               a2.getProducts();
               a3.getProducts();



         a3.removeProducts("samsung-galaxy 10");

        a1.removeProducts("redbull");
              a3.renameCategory("house");

                // task number 2

        
Basket b1 = new Basket("ade","bag");
Basket b2 = new Basket("john");
Basket b4 = new Basket("shirt",b2);


        b1.addProduct("shoe");

        b1.addProduct("bag");
        b2.addProduct("shoe");
        b4.addProduct("shirt");
        b1.buy();
        b1.removeProduct("shoe");
        b1.buy();
        b2.buy();
        b4.buy();








    }



}
