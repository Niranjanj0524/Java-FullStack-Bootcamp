class Parent{
    String name = "Parent Variable";
    Parent(){
        System.out.println("Parent class Constrctor called!");
    }

    void display(){
        System.out.println("Inside parent class method");
    }
}
class Child extends Parent{
    String name = "Child Variable";
    Child(){
        // super();
        System.out.println("Child class Contructor called!");
    }

    void show(){
        // super.display();

        System.out.println("Parent Name : " + super.name);
        System.out.println("Child Name : " + this.name);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
