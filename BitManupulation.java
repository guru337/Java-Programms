//get bit
public class BitManupulation {
    public static void main(String[] args) {
        int n=4;
        int i=2;
        int bitmask=1<<i;

        if((bitmask | n)==0){
            System.out.println("bit was zero");
        }else{
            System.out.println("bit was not zero");
        }
    }
}
