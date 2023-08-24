package Recursion;

public class fibonacci {
    public static void main(String[] args) {

        int ans = fib(4);
        System.out.println(ans);

    }

    static int fib(int n){
        if(n==0 || n==1){
            return n;

        }
        else {
            return (n-1 + n-2);
        }
    }
}
