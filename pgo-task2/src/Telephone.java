import java.util.Scanner;

public class Telephone {
   private String brand;
  private  long phonenumber;
  private   String screensize;
    Scanner in = new Scanner(System.in);

    public Telephone(String brand, long phonenumber, String screensize) {
        this.brand = brand;
        this.phonenumber = phonenumber;
        this.screensize = screensize;
    }

    public String telephoneinfo() {

        return "phone brand = " + this.brand + "\n" + "phone number is = " + this.phonenumber + "\n" + "screnn size is =" + this.screensize;
    }


    public String sendmessage() {
        long j;

        System.out.println(" enter phone number");
        j = in.nextLong();
        System.out.println(" enter message");
        String  text = in.nextLine();
        System.out.println("sending message " + text + " to " + j);
 return "thank you";

    }
}