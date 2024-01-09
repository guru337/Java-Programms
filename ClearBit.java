//clear bit
public class ClearBit {
    public static void main(String[] args) {
        int num=5;//0101
        int pos=2;
        int bitmask=1<<pos;
        int notBitMask=~(bitmask);

        int newNumber=notBitMask & num;
        System.out.println(newNumber);
    }
}
