package Task3;

public class Employee extends Person {

   private int hireDate;
   private String companyName;
   private long salary;
private String  jobSeniority="clark";
    public Employee(String firstName, String lastName, int yearOfBirth, int hireDate,String companyName,long salary) {
        super(firstName, lastName, yearOfBirth);
        this.hireDate=hireDate;
        this.companyName= companyName;
        this.salary= salary;
    }

    public String getJobSeniority() {
        return jobSeniority;
    }

    public long getSalary() {
        return salary;
    }
}
