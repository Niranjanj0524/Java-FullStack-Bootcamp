package Day2;

public class VariableAndDataTypes {
    public static void main(String[] args) {
        int age = 22;
        String name = "Niranjan";
        String branch = "Computer";
        float cgpa = 7.6f;

        System.out.println("Name : "+ name);
        System.out.println("Age : "+ age);
        System.out.println("Branch : "+ branch);
        System.out.println("CGPA : "+ cgpa);

        System.out.println();

        byte b = 10;
        short s = 200;
        int i = 5000;
        long l = 9876543210L;
        float f = 12.5f;
        double d = 25.6789;
        char c = 'A';
        boolean isJavaFun = true;

        System.out.println("b : " + b);
        System.out.println("s : " + s);
        System.out.println("i : " + i);
        System.out.println("l : " + l);
        System.out.println("f : " + f);
        System.out.println("d : " + d);
        System.out.println("c : " + c);
        System.out.println("isJavaFun : " + isJavaFun);

        System.out.println();

        int x = 10;
        int y = 20;
        int z = x + y;
        System.out.println("sum of x and y : " + z);
    }
}
