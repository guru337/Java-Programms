
public class StringBuidler {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);

        //char At
        char c=sb.charAt(2);
        System.out.println(c);

        sb.setCharAt(2, 'y');
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}
