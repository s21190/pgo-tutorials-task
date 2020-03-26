import java.util.Scanner;
public class User {
    private String Name,LastName, Password;
    private String email, customerVef;

    public User(String name, String lastName, String password, String email, String customerVef) {
        Name = name;
        LastName = lastName;
        Password = password;
        this.email = email;
        this.customerVef = customerVef;if(customerVef != null) {
            System.out.println("this account owned by " + name + " " + lastName + " with email - " + email + " is a user account ");
        }else{
            System.out.println("this account owned by "+name+" "+lastName+" with email - "+ email+ " is a user account ");
        }

    }

Scanner input = new Scanner(System.in);
    public User(String email) {
        this.email = email;
        if(customerVef == null){
        System.out.println("this  account with "+email +" is a Quest account");}else{
            System.out.println("this account with "+" with email - "+ email+ " is a user account ");

        }
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerVef() {
        return customerVef;
    }

    public void setCustomerVef(String customerVef) {
        this.customerVef = customerVef;
    }

    public void createNewAccount(){
int j =4;

        System.out.println("please enter details for new account"+"\n"+
                " 1.name"+" \n" +
                " 2. lastName"+"\n"+
                " 3. password"+"\n"+
                " 4.current email"+"\n");
        String[] Customerinfo = new String [3];
        for (int i = 0; i <Customerinfo.length ; i++) {
            System.out.println("please enter details");
            Customerinfo[i]= input.nextLine ();


        }
       setName(Customerinfo[0]);
setLastName(Customerinfo[1]);
setPassword(Customerinfo[2]);
;

System.out.println("name = "+this.getName());
        System.out.println("lastName = " + this.getLastName());
        System.out.println("password =" +this.getPassword());
        System.out.println("email = " +this.getEmail());
        System.out.println(" new user account created ");
        System.out.println(" \n "+"\n");
    }
 public String printInfo(){
        return " name = "+getName()+" \nlastname = "+getLastName()+" \npassword = "+getPassword()+" \nemail = "+getEmail()+" \nCustomerVeferication = "+getCustomerVef()+"\n this is your information thanks"+" \n "+"\n";
    }





}


