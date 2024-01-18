package gr.aueb.cf.ch5;

public class AppPower {
    public static void main(String[] args) {
        System.out.println(power(2,4));;

    }

    public static int power(int a,int n){
        return (n == 0) ? 1 : a * power(a,n-1);
    }
}

