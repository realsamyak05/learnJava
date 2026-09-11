public abstract class Shape {

    abstract double area();

    public static void main(String[] args) {
        Circle cr = new Circle(5);
        Rectangle rec = new Rectangle(10.0, 5.0);
        Triangle tri = new Triangle(10, 5);

        System.out.println(cr.area());
        System.out.println(rec.area());
        System.out.println(tri.area());
    }
    
}

class Circle extends Shape{
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override 
    double area(){
        return Math.PI * radius * radius;
    } 
    

}

class Rectangle extends Shape{
    double length;
    double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }  
    
    @Override
    double area(){
        return length * width;
    }

}

class Triangle extends Shape{

    double height;
    double base;

    Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override 
    double area(){
        return 0.5 * height * base;
    }

    

}