public class Animal2 {
    void move(){
        System.out.println("the animal is running.");
    }

    public static void main(String[] args) {
        Dog2 sheru = new Dog2();
        sheru.move();

        Fish pui = new Fish();
        pui.move();
    }
}

class Dog2 extends Animal2{

}
class Fish extends Animal2{
    @Override 
    void move(){
        System.out.println("the animal is swimming.");
    }
}
