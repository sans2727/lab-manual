/*write a program to compare two sets and retain element which are the same on both set*/
import java.util.*;
  public class Sets{
  public static void main(String[] args) {
     // Create a empty hash set
        HashSet<String> h_set1 = new HashSet<String>();
     // use add() method to add values in the hash set
          h_set1.add("SWEETY");
          h_set1.add("SID");
          h_set1.add("SANS");
          h_set1.add("LAXMI");
          System.out.println("Frist HashSet content: "+h_set1);
          HashSet<String>h_set2 = new HashSet<String>();
          h_set2.add("SWEETY");
          h_set2.add("SID");
          h_set2.add("SANS");
          h_set2.add("Orange");
          System.out.println("Second HashSet content: "+h_set2);
          h_set1.retainAll(h_set2);
          System.out.println("HashSet content:");
          System.out.println(h_set1);
     }
}