public class Operators{
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        //All Arithmetic Operation
        System.out.println("Addition: " + (a + b));
        System.out.println("Substraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        System.out.println();

        //Relational Operators
        boolean result = a == b;
        System.out.println(result);

        boolean result1 = a != b;
        System.out.println(result1);

        boolean result2 = a < b;
        System.out.println(result2);

        boolean result3 = a > b;
        System.out.println(result3);

        System.out.println();

        //Logical Opertors
        int x = 12;
        int y = 10;
        boolean res = a > b && x > y;
        System.out.println(res);

        boolean res1 = a < b || x < y;
        System.out.println(res1);

        boolean res2 = a != y;
        System.out.println(res2);

        System.out.println();

        //Assignment Operators
        int m = 40;
        m += m;
        System.out.println(m);

        int n = 30;
        n -= n;
        System.out.println(n);
        int l = 10;
        l /= l;
        System.out.println(l);

        System.out.println();

        //Pre-Fix and Post-Fix
        int d = 10;
        System.out.println("d++ :" + d++);
        int e = 20;
        System.out.println("++e :" + ++e);
        System.out.println();

        //Ternary Operator
        int larger = a > b ? 1 : 0;
        System.out.println("a > b --> then print(1) else print(0): " + larger);

        //Calculate Area of Rectangle
        int length = 5;
        int width = 7;
        int area = length * width;
        System.out.println("Area of Rectangle: " + area);

        //Swap without using 3rd variable
        int ab = 10;
        int ba = 15;
        ab = ab + ba;
        ba = ab - ba;
        ab = ab - ba;
        System.out.println("ab: " + ab);
        System.out.println("ba: " + ba);

        System.out.println();
        //whether a number is even or odd using %
        int num = 15;
        String ans = num % 2==0 ? "even" : "odd";
        System.out.println(num + " num is " + ans);
        System.out.println();

        //Convert temperature from Celsius to Fahrenheit.
        int temp = 32;
        double F = (temp * 9.0 / 5) + 32;
        System.out.println("Temp in F" + F);
    }
}