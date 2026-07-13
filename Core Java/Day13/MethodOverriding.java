class Animal{
    void display(){
        System.out.println("This is Animal Class");
    }
}
class Dog extends Animal{
    @Override
    void display(){
        System.out.println("This is Dog Class");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Dog obj = new Dog();

        obj.display();
    }
}
