public class MethodOverloading {
    public int add(int a, int b){
        return a + b;
    }   
    public double add(double a, double b){
        return a + b;
    }    
    public int add(int a, int b, int c){
        return a + b + c;
    }   

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        int add1 = obj.add(12, 13);
        System.out.println(add1);

        int add2 = obj.add(12, 13, 15);
        System.out.println(add2);

        double add3 = obj.add(22.2, 22.8);
        System.out.println(add3);
    }
}
