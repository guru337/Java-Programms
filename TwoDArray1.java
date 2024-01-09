import java.util.Scanner;

public class TwoDArray1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows: ");
        int rows=sc.nextInt();
        System.out.println("Enter column: ");
        int column=sc.nextInt();

        int[][] num=new int[rows][column];
        //input
        //rows
        for(int i=0;i<rows;i++){
            //column
            for(int j=0;j<column;j++){
                num[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt();
        //output
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                if(num[i][j]==x){
                    System.out.println("x found at the location(" + i + "," + j + ")");
                }
                    else{
                        System.out.println("Given value does not found");
                    }
            }
        }
    }
}
