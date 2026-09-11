public class Animal {
    boolean isAlive;

    Animal(){
        isAlive = true;
    }

    void eat(){
        System.out.println("Animal is eating.");
    }

    public static void main(String[] args) {
        Dog sheru = new Dog();
        System.out.println(sheru.isAlive);
        sheru.eat();
        sheru.speak();

        Cat molly = new Cat();
        System.out.println(molly.lives);

    }
}


class Dog extends Animal{
    int lives = 1;
    void speak(){
        System.out.println("Dog Barks...");
    }
}

class Cat extends Animal{
    int lives = 9;
    void speak(){
        System.out.println("Cat meows...");
    }

    
}
