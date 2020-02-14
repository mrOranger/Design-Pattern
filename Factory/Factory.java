package Factory;

public class Factory{

    private String element;

    public Factory(){
        this.element = new String();
    }

    public Person getInstance(String element){
        if(element == null){
            if(this.element.equals("Employee")){
                return new Employee();
            }
            if(this.element.equals("Manager")){
                return new Manager();
            }
        }else{
            this.element = element;
            if(element.equals("Employee")){
                return new Employee();
            }
            if(element.equals("Manager")){
                return new Manager();
            }
        }
        return null;
    }

}