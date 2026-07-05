public class IfElse {
    public static void main(String[] args) {
        //Smallest of Two Numbers
        int num1 = 21;
        int num2 = 33;
        if(num1 < num2){
            System.out.println("Smallest Num is : " + num1);
        }else{
            System.out.println("Smallest Num is : " + num2);
        }
        System.out.println();

        //Divisible by 5
        int num = 15;
        if(num % 5 == 0){
            System.out.println("Num is divisible by 5 : " + num);
        }else{
            System.out.println("Num i not divisible by 5 : " + num);
        }
        System.out.println();

        //Leap Year
        int year = 2004;
        if(year % 4 == 0){
            System.out.println("It is leap Year : " + year);
        }else{
            System.out.println("It is not leap year : " + year);
        }
        System.out.println();

        //Vowel or Consonant
        char ch = 'a';
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch + " is Vowel");
        }else{
            System.out.println(ch + " is Consonant");
        }
        System.out.println();

        //Character is Alphabet or Not
        char char1 = 'B';
        if((char1 >= 'a' && char1 <= 'z') || (char1 >= 'A' && char1 <= 'Z')){
            System.out.println(char1 + " is Aplhabet");
        }else{
            System.out.println(char1 + " is Not Aplhabet");
        }
        System.out.println();
    }
}
