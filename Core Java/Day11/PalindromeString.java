public class PalindromeString {
    public static void main(String[] args) {
        String str = "ababa";
        String revStr = "";

        for(int i=str.length()-1; i>=0;i--){
            revStr += str.charAt(i);
        }

        if(str.equals(revStr)){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String not Palindrome");
        }
    }
}
