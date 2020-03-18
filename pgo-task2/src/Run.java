public class Run {

    public static void main(String[] args){
        Telephone a1 = new Telephone("samsung",476943392," 50 inch");
        System.out.println(a1.telephoneinfo());
        System.out.println(a1.sendmessage());

Car b1 = new Car ("red","volvo",60);
        System.out.println(b1.carinfo());

b1.setEnginecapacity(100);

    }
}
