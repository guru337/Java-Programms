//set bit 
public class SetBit {
    public static void main(String[] args) {
        int num=5;//0101
        int pos=3;
        int bitmask=1<<pos;

        int newNumber=bitmask | num;//for set bit we use or operator 
        System.out.println(newNumber);//0111
        }
}
