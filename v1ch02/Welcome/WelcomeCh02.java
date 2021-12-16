/**
 * This program displays a greeting from the authors.
 * 
 * @version 1.20 2004-02-28
 * @author Cay Horstmann
 */
public class WelcomeCh02 {
   public static void main(String[] args) {
      // String[] greeting = new String[3];
      // greeting[0] = "Welcome to Core Java";
      // greeting[1] = "by Cay Horstmann";
      // greeting[2] = "and Gary Cornell";

      // for (String g : greeting)
      // System.out.println(g);
      int[] a = { 1, 2,1};
      int result=0;
      int count=0;
      for(int i=0;i<a.length;i++) {
         result^=(1 << a[i]);
         count++;
      }
      System.out.println(Integer.bitCount(result));

   }
}
