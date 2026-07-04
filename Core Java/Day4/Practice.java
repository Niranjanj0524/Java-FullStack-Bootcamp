import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input and print name
        System.out.print("Enter Name :");
        String name = sc.next();
        System.out.println("Name :" + name);
        System.out.println();

        //Input age
        System.out.print("Enter Age :");
        int age = sc.nextInt();
        System.out.println("Age :" + age);
        System.out.println();

        //Sum of two numbers
        System.out.print("Enter Value of a :");
        int a = sc.nextInt();
        System.out.print("Enter Value of b :");
        int b = sc.nextInt();
        System.out.println("Sum of a and b :" + (a+b));
        System.out.println();

        //Average of three numbers
        System.out.print("Enter Value of x :");
        int x = sc.nextInt();
        System.out.print("Enter Value of y :");
        int y = sc.nextInt();
        System.out.print("Enter Value of z :");
        int z = sc.nextInt();
        System.out.println("Average of x, y and z :" + (float)((x + y +z)/3));
        System.out.println();

        //Area of rectangle
        System.out.print("Enter length :");
        int l = sc.nextInt();
        System.out.print("Enter width :");
        int w = sc.nextInt();
        int areaRectangle = l * w;
        System.out.println("Area of Rectangle :" + areaRectangle);
        System.out.println();

        //Area of circle
        System.out.println("Enter Circle Radius :");
        float r = sc.nextFloat();
        double areaCircle = Math.PI * r * r;
        System.out.println("Area of Circle :" + areaCircle);
        System.out.println();

        //swap a & b
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Swap of a & b -->" + " a :" + a + " b :" + b);
        System.out.println();

        //Implicit type casting
        int impl = 10;
        double impl1 = impl;
        System.out.print("Implicit :" + impl1);
        System.out.println();

        //Explicit type casting
        double expl = 7.77;
        int expl1 = (int) expl;
        System.out.print("Explicit :" + expl1);
        System.out.println();

        //char to ASCII
        char myChar = 'A';
        int asciiValue = (int) myChar;
        System.out.print("Chacacter A to ASCII value :" + asciiValue);
        System.out.println();

        System.out.println("--- Input All Primitive Data Types ---");

        // 1. byte (1 byte)
        System.out.print("1. Enter a byte value (-128 to 127): ");
        byte by = sc.nextByte();

        // 2. short (2 bytes)
        System.out.print("2. Enter a short value (-32,768 to 32,767): ");
        short s = sc.nextShort();

        // 3. int (4 bytes)
        System.out.print("3. Enter an int value: ");
        int i = sc.nextInt();

        // 4. long (8 bytes)
        System.out.print("4. Enter a long value: ");
        long lo = sc.nextLong();

        // 5. float (4 bytes)
        System.out.print("5. Enter a float value (e.g., 5.75): ");
        float f = sc.nextFloat();

        // 6. double (8 bytes)
        System.out.print("6. Enter a double value (e.g., 99.99): ");
        double d = sc.nextDouble();

        // 7. boolean (1 bit)
        System.out.print("7. Enter a boolean value (true or false): ");
        boolean bool = sc.nextBoolean();

        // 8. char (2 bytes)
        System.out.print("8. Enter any single character (char): ");
        char c = sc.next().charAt(0);

         System.out.println("\n--- Your Output ---");
        System.out.println("byte value: " + by);
        System.out.println("short value: " + s);
        System.out.println("int value: " + i);
        System.out.println("long value: " + lo);
        System.out.println("float value: " + f);
        System.out.println("double value: " + d);
        System.out.println("boolean value: " + bool);
        System.out.println("char value: " + c);
    }
}