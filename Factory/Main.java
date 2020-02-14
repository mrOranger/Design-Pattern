package Factory;

public class Main{
    public static void main(String[] args){
        Factory factory = new Factory();
        Person person = factory.getInstance("Person");
        Person manager = factory.getInstance("Manager");
        if(person != null && manager != null){
            System.out.println(person.toString());
            System.out.println(manager.toString());
        }
    }
}