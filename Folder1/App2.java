package Folder1;

class Plant {
    
    // Usually only static final members are public
    public static final int ID = 7;
    
    // Instance variables should be declared private, 
    // or at least protected.
    private String name;
    
    // Only methods intended for use outside the class should be public
    public String getData() {
        String data = "some stuff" + calculateGrowthForecast();
        
        return data;
    }
    
    // Methods only used in the class itself should be private or protected
    private int calculateGrowthForecast() {
        return 9;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class App2 {

    public static void main(String[] args) {
        Plant plant = new Plant();
        plant.setName("rose");
        System.out.println(plant.getName());
        
        System.out.println(plant.getData());
    }

}
