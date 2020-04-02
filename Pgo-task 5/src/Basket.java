
import java.util.Arrays;

public class Basket {
 private int shirt1=shirt, bag1=bag,shoe1=3;
private static int  shirt= 3,bag=4,shoe= 3;
private int bagPrice=0,shirtPrice=0,shoePrice=0;
private int  productNo= shirt + bag+ shoe;
    private String userAccount;
    private static int arraysize=10 , shop= bag+shirt+shoe ;
    int j=1;
     private UserType type;
    private  String  []  productList= new String [arraysize];



    public Basket() {
    }


    public Basket(String userAccount) {
        this.userAccount = userAccount;
        this.type= UserType.guest;
    }

    public Basket(String userAccount, String  productList) {
        this.userAccount = userAccount;
          this.type= UserType.fullUser;
          if(productList.equals("bag")){
              --bag;
              bagPrice+=700;
          }if(productList.equals("shoe")){
            --shoe;
            shoePrice+=600;
        }if(productList.equals("shirt")){
            --shirt;
            shirtPrice+=500;
        }
      for (int j =0; j < 1; j++){ this.productList[j] = productList;
          --shop;

          ++arraysize;
          break;
      }
    }public Basket ( String productList, Basket guest) {
this.type=UserType.guest;
        this.userAccount = guest.userAccount;
        for (int j = 0; j < 1; j++) {
            this.productList[j] = productList;
            --shop;
            ++arraysize;
            break;

        }
    }
    public void addProduct(String   product) {





            if ( bag==0 || shop==0) {
                System.out.println("out of stock");

            }else if(product.equals("bag")){
                productList[j] = product;
                --bag;
                bagPrice+=700;
                ++arraysize;
                ++j;
                --shop;
            }
            if ( shoe ==0|| shop==0) {

                System.out.println("out of stock");

            }else if (product.equals("shoe")){
                productList[j] = product;
                --shoe;
                shoePrice+=600;
                ++arraysize;
                ++j;
                --shop;
            }
            if ( shirt==0 ||shop==0) {
                System.out.println("out of stock");


            }else if (product.equals("shirt")){
                productList[j] = product;
                --shirt;
                shirtPrice+=500;
                ++arraysize;
                ++j;
                --shop;
            }

        }



            public void removeProduct(String product){
        if(product.equals("bag")){
            bagPrice-=700;
            ++bag;
        }if(product.equals("shoe") ){
                    shoePrice-=600;
                    ++shoe;
                }if(product.equals("shirt")){
                    shirtPrice-=700;
                    ++shirt;
                }
     for(int i=0; i<shop;i++){
    if(productList[i] == product ) {
           productList[i]=null;

        ++shop;
    }


     }
    }


    public void buy() {
        System.out.print(Arrays.toString(this.productList)+" ");
        System.out.print("$");
        System.out.println(shirtPrice+shoePrice+bagPrice+" "+this.type);
        System.out.println("total number of products in shop = "+productNo+" total number of product in shop after shopping = "+shop);
        System.out.println("initial number of bags = "+bag1+" number of bags left ="+bag+" initial number of shoes = "+shoe1+" number of shoes left ="+shoe+" initial number of shirts = "+shirt1+" number of shirts left ="+shirt);
System.out.println("\n");
    }


}











