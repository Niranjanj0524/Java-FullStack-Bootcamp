public class IfStatement {
    public static void main(String[] args) {
        // Positive or Negative Number
        int num = 11;
        if (num > 0) {
            System.out.println("Number is Positive :" + num);
        }
        if(num < 0){
            System.out.println("Number is Negative :" + num);
        }
        System.out.println();

        //Even or Odd
        if(num % 2 == 0){
            System.out.println("Number is Even :" + num);
        }
        if(num % 2 != 0){
            System.out.println("Number is Odd :" + num);
        }
        System.out.println();

        //Eligible to Vote
        int age = 19;
        if(age >= 18){
            System.out.println("Eligible to Vote :" + age);
        }
        System.out.println();

        //Pass or Fail
        int marks = 90;
        if(marks >= 35){
            System.out.println("Pass :" + marks);
        }
        System.out.println();

        //Largest of Two Numbers
        int a = 21;
        int b = 34;
        if(a > b){
            System.out.println("Largest num is :" + a );
        }
        if(b > a){
            System.out.println("Largest Num is :" + b);
        }
    }
}