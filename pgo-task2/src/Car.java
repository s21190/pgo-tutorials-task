public class Car {

  private  String color;
   private  String brand;
    private int enginecapacity ;

    public Car(String color, String brand, int enginecapacity) {
        this.color = color;
        this.brand = brand;
        this.enginecapacity = enginecapacity;

    }



    public String carinfo(){
        return "car color is ="+this.color+"\n"+"car brand is = "+this.brand+"\n"+this.getEnginecapacity();

}

    public int getEnginecapacity() {
        if (enginecapacity >= 21) {
            System.out.println("car is high speed");
            return enginecapacity;
        } else {
            System.out.println("car is high speed");
            return  enginecapacity;
        }
    }


    public void setEnginecapacity(int enginecapacity) {
        this.enginecapacity = enginecapacity;
    }

}
