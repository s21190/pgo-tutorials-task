package Task2;

 abstract class  Animal {
     private String name;

     public Animal(String name) {
         this.name = name;
     }
     abstract String getType();

     public String getName() {
         return name;
     }
 }
