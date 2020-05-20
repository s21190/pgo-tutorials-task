package Task3;

public class Manager extends Employee {
    private long bonus;

    public Manager(String firstName, String lastName, int yearOfBirth, int hireDate, String companyName, long salary, long bonus) {
        super(firstName, lastName, yearOfBirth, hireDate, companyName, salary);
        this.bonus= bonus;
    }

    @Override
    public long getSalary() {
        return super.getSalary()+ bonus;
    }

    @Override
    public String toString() {
        return "Manger " + "with "+ "lastName "+getLastName() +" and age " + super.getAge()+" has "+ "salary " +this.getSalary() ;
    }
}
