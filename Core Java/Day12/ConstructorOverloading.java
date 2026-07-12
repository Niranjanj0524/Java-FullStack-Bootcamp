public class ConstructorOverloading {
    int a;
    int b;
    String name;
    int age;
    public ConstructorOverloading(){
        System.out.println("ConstructorOverloading Running");
        System.out.println("-----------------------");
    }

    public ConstructorOverloading(int n1, int n2){
        a = n1;
        b = n2;
    }
    public ConstructorOverloading(int sAge, String sName){
        name = sName;
        age = sAge;
    }

    void displaySum(){
        System.out.println("a + b : " + (a+b));
        System.out.println("------------------");
    }
    void displayStd(){
        System.out.println("Age : " + age + " Name : " + name);
    }


    public static void main(String[] args) {
        ConstructorOverloading conOver = new ConstructorOverloading();
        ConstructorOverloading conOver1 = new ConstructorOverloading(10, 15);
        ConstructorOverloading conOver2 = new ConstructorOverloading(21, "Niranjan");

        conOver1.displaySum();
        conOver2.displayStd();
    }
}
