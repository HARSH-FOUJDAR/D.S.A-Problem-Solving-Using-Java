import java.util.Scanner ;
class ClimbingStairs {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.print(ans(num));
    }
    public static int ans(int n){
        if(n==1 || n==0){
            return 1;
        }
        return  ans(n-1) + ans(n-2);
    }
}
