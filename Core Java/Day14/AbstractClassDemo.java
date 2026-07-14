abstract class A{
    abstract void display();
    void show(){
        System.out.println("This is inside abstract class");
    }
}

class B extends A{
    void display(){
        System.out.println("This is inside B class");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        B obj = new B();

        obj.display();
        obj.show();
    }
}

