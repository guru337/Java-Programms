import java.util.*;

public abstract class UpdateBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int oper=sc.nextInt();
        int n=5;//0101
        int pos=2;
        // int oper=1;//update bit to 1 else update bit to 0
        int bitMask=1<<pos;
        if(oper==1){
            //set
            int newNumber=bitMask | n;
            System.out.println(newNumber);
        }else{
            //clear
            int newBitMask=~(bitMask);
            int newNumber=newBitMask & n;
            System.out.println(newNumber);
        }
    }
}
