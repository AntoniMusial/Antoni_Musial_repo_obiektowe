public class Car {
    Car car1 = new Car();
    Car car2 = new Car();
    private String name;
    
    public void setName(String name) { 
        this.name = name;
    }
    
    public String getName() { 
        System.out.println(name);
        return name;
    }
}
