import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);





                    User a1 = new User("michael","ejikam", "abuja", "frank@yahoo.com","v" );

                      User s2 = new User("james007@gmail.com");

                      User s3 = new User("harry@gmail.com");
                      s3.createNewAccount();

        System.out.println(a1.printInfo());
        System.out.println(s2.printInfo());
        System.out.println(s3.printInfo());




       Product b2 = new Product("iphone",0,"d3000",15000);
       Product c2 = new Product("hp","x-5879",2000, 500);
        Product d2 = new Product("samgung galaxy12","fgh-5879",1200, 700);

         d2.setPrice(500);
         d2.setNumberOfItems(5);
        b2.printAllInfo();



    }
}