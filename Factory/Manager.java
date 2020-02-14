package Factory;

public class Manager implements Person{

    private String name;
    private String surname;
    private int age;

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

    public int getAge(){
        return this.age;
    }

    public void setAge(final int age){
        this.age = age;
    }

    @Override
    public String toString(){
        return "Manager: " + this.name + " " + this.surname + " " + this.age;
    }
}