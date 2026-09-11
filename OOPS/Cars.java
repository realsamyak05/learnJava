public class Cars {
    String model;
    String color;

    Cars(String model, String color){
        this.model = model;
        this.color = color;
    }
    
    void Drive(){
        System.out.println("You are driving " + color + " " + model);
    }

    public static void main(String[] args) {
        Cars car1 = new Cars("Mustang", "Red");
        
        Cars car2 = new Cars("Corvette", "Black");

        Cars car3 = new Cars("Charger", "Yellow");

        Cars[] c = {car1, car2, car3};
        for(int i = 0; i < c.length; i++){
            c[i].Drive();
        }
        

    }
}
