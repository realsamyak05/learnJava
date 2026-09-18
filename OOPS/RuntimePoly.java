import java.util.Scanner;

abstract class Animal{
    abstract void speak();
}

class Dog extends Animal{
    
    @Override void speak(){
        System.out.println("The dog is barking");
    }
}

class Cat extends Animal{
    
    @Override void speak(){
        System.out.println("The cat is meowing.");
    }
}

public class RuntimePoly {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Animal a;

        System.out.print("Would u like a dog(1) or a cat(2) : ");
        int x = s.nextInt();

        if (x == 1){
            a = new Dog();
            a.speak();
        }
        else{
            a = new Cat();
            a.speak(); 
        }
    }   
}
