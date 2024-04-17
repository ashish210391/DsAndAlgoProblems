package Recursion;

public class FindNthFibonacciNumber {

    public int  fib(int n){
        if(n <=1) return n;
        return fib(n-1)+fib(n-2);

    }

    public static void main(String[] args) {
        FindNthFibonacciNumber fib = new FindNthFibonacciNumber();
        int n =1;
        int fibNum = fib.fib(n);
        System.out.println(n+"th fibonacci number is : "+fibNum);


    }
}
