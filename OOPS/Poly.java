abstract class Vehicle{
    abstract void go();
}

class Car extends Vehicle{
    @Override 
    void go(){
        System.out.println("The car is going.");
    }
}

class Bike extends Vehicle{
    @Override 
    void go(){
        System.out.println("The bike is going.");
    }
}

class Boat extends Vehicle{
    @Override 
    void go(){
        System.out.println("The boat is going.");
    }
}

public class Poly {
    public static void main(String[] args) {
        Car c1 = new Car();
        Bike b1 = new Bike();
        Boat b2 = new Boat();

        // c1.go();
        // b1.go();
        // b2.go();

        Vehicle[] v = {c1, b1, b2};

        for(Vehicle x : v){
            x.go();
        }
    }
    
}
