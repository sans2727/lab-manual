import java.util.Scanner;//importing scanner class
public class Multi_Matrix4 {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);//creating object of scanner class
System.out.println("enter the row of  matrix:");
int row=sc.nextInt();//taking row1 as input
System.out.println("enter the column of matrix:");
int col=sc.nextInt();//taking column1 as input
int[] [] matrix=new int[row][col]; //declaring 2d matrix

System.out.println("enter" +" "+ row*col+" "+ "element of  matrix:");
for (int i=0;i<row;i++)//for loop for row and column of  matrix
{
for(int j=0;j<col;j++)
matrix[i][j]=sc.nextInt();
}
for (int i=0;i<row;i++) //for loop for printing the matrix 
{
for(int j=0;j<col;j++)
{
System.out.print(matrix[i][j]+" ");
}

System.out.println();
sc.close();


}

}
}
