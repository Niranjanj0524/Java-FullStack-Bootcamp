public class MaxMethod {
    public int maxNum(int a, int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }

    public static void main(String[] args) {
        MaxMethod obj = new MaxMethod();
        int maxi = obj.maxNum(15, 44);
        System.out.println(maxi);
    }
}
