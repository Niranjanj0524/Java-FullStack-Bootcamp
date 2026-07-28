interface AdditionCalculator{
    int add(int a, int b);
}

public class LambdaDemo {
    public static void main(String[] args) {
        AdditionCalculator calc = (a,b) -> a + b;

        int res = calc.add(20, 30);
        System.out.println(res);
    }
}