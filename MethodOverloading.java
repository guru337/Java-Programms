//method overloading
public class MethodOverloading {
    public static int overload(int m,int n){
        return m+n;
    }
    public static double overload(double m,double n){
        return m+n;
    } 
    public static void main(String[] args) {
        int m=overload(3,6);
        System.out.println(m);
    }
}
