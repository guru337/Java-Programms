import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows: ");
        int row=sc.nextInt();
        System.out.println("Enter columns: ");
        int column=sc.nextInt();

        int[][] num=new int[row][column];

        //input
        //rows
        for(int i=0;i<row;i++){
            //columns
            for(int j=0;j<column;j++){
                num[i][j]=sc.nextInt();
            }
        }

        //output 
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
}
