package Task3;

public abstract class Person {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
int ageCounter=2020;
    public Person(String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

   public int getAge (){
     return ageCounter - yearOfBirth;
   }

    public String getLastName() {
        return lastName;
    }
}
