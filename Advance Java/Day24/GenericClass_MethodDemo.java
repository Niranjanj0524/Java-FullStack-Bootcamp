class Box<T>{
    private T data;

    public void setData(T data){
        this.data = data;
    }
    public T getData(){
        return data;
    }
    public void display(){
        System.out.println("Box Data : " + data);
    }
}

public class GenericClass_MethodDemo {
    public static <T> void printData(T data){
        System.out.println(data);
    }

    public static void main(String[] args) {
        System.out.println("--- Generic Method Data ---" );
        printData(10);
        printData(20);
        printData("Niranjan");

        System.out.println("--- Generic Box Class ---");
        Box <Integer> intBox = new Box<>();
        intBox.setData(100);
        intBox.display();

        Box <String> strBox = new Box<>();
        strBox.setData("Yash");
        strBox.display();
    }
}