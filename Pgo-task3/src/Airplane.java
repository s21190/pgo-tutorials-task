import javax.management.ConstructorParameters;

public class Airplane extends Engine {


        private String brand;
        private int seatnumber;






    public Airplane(int power, int production, String brand, int seatnumber) {
        super(power, production);
        this.seatnumber=seatnumber;
        this.brand=brand;

    }


        public void setSeatnumber(int seatnumber) {
            this.seatnumber = seatnumber;
        }



        public String  getBrand(){

            return brand;


        }
        public String airplane(){

            return "\n "+"brand name ="+ this.getBrand()+"   \n   "+"seat number ="+this.seatnumber + "\n" + "production year = "+super.getProduction()+"\n" +"Engine power = "+super.getPower();

        }

}





