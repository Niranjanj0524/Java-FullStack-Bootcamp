public class ThisKeyword {
    int age;
    String name;

    public ThisKeyword(int age, String name){
        this.age = age;
        this.name = name;
    }

    void display(){
        System.out.println("Age : " + age);
        System.out.println("Name : " + name);
    }

    public static void main(String[] args) {
        ThisKeyword tk = new ThisKeyword(21, "Niranjan");

        tk.display();
    }
}
