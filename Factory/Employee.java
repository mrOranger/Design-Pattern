package Factory;

public class Employee implements Person{

    private String name;
    private String surname;
    private float salary;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getSurname() {
        return this.surname;
    }

    @Override
    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public float getSalary(){
        return this.salary;
    }

    public void setSalary(final float salary){
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Employee: " + this.name + " " + this.surname + " " + this.salary;
    }

}