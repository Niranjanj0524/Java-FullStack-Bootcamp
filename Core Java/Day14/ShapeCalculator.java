abstract class Shape{
    abstract void calculateArea();
    void show(){
        System.out.println("This is Shape Calculator");
    }
}

class Circle extends Shape{
    int r;
    Circle(int r){
        this.r = r;
    }

    @Override
    void calculateArea(){
        System.out.println("Area of Circle : " + Math.PI * r * r);
    }
}

class Rectangle extends Shape{
    int l;
    int w;
    Rectangle(int l, int w){
        this.l = l;
        this.w = w;
    }
    @Override
    void calculateArea(){
        System.out.println("Area of Rectangle : " + l * w);
    }
}

public class ShapeCalculator {
    public static void main(String[] args) {
        Circle c = new Circle(4);
        c.show();
        c.calculateArea();

        Rectangle r = new Rectangle(3, 4);
        r.calculateArea();
    }
}
