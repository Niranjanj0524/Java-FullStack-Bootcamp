class Animal{
    void sound(){
        System.out.println("Animal makes a Sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog Barks");
    }
}

public class AnnotationDemo {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Dog myDog = new Dog();

        myAnimal.sound();
        myDog.sound();
    }
}
