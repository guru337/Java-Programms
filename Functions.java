import java.util.Scanner;

public class Functions{
    static int sum(int m, int n){
        return m+n;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(sum(4,7));
    }
}
