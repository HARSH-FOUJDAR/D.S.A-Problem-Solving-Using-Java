public class Recursion1st {

    public static  void  Number(int n ){
        if(n==9){
            return;
        }
        System.out.print(n + " ");
        Number(n+1);
    }
    public  static void main(String[] args) {
       int n =1;
        Number(n);
    }
}
