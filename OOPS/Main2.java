class Car1 {
    private String model;
    private String color;
    private double price;


    String getModel(){
        return this.model;
    }

    String getColor(){
        return this.color;
    }

    String getPrice(){
        return "$" + this.price;
    }

    void setModel(String model){
        this.model = model;
    }

    void setColor(String color){
        this.color = color;
    }

    void setPrice(double price){
        this.price = price;
    }


}


public class Main2{
    public static void main(String[] args) {
        Car1 c = new Car1();

        c.setColor("yellow");
        c.setModel("Charger");
        c.setPrice(100000.0);


        System.out.println("You have a " + c.getColor() + " " + c.getModel() + " " + c.getPrice());
    }
}
