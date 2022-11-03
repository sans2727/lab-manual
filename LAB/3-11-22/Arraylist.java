/* Write a Java program to replace the second element of a ArrayList with the specified element*/
import java.util.ArrayList;
  public class ArrayList  {
    public static void main(String[] args){
  ArrayList<String>  color = new ArrayList<String>();

  color.add("Black");
  color.add("white");

  System.out.println("Original array list: " + color);
  String new_color = "White";
  color.set(1,new_color);

  int num=color.size();
  System.out.println("Replace second element with 'White'."); 
  for(int i=0;i<num;i++)
  System.out.println(color.get(i));
  }
}