public class SumRecursion {
    public static void main(String[] args){
        int n = 0;
     System.out.println(Sum(n));
    }
    public static int Sum(int n){
        if(n==n){
            return 0;
        }
        return n+= Sum(n +1);
    }
}
