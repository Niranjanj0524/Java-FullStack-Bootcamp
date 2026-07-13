class A{
    void displayA(){
        System.out.println("This is A");
    }
}
class B extends A{
    void displayB(){
        System.out.println("This is B");
    }
}

class C extends A{
    void displayC(){
        System.out.println("This is C");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.displayC();
        obj.displayA();

        B obj1 = new B();
        obj1.displayB();
        obj1.displayA();

    }
}
