
public class KillCilantro {
   public static String killCilantro(String text) { // replace the word 'cilantro' to 'parsley'
      String result = "";
      int i = 0;
      while (i < text.length()) {
         if (i + 8 <= text.length() && text.substring(i, i + 8).equals("cilantro")) {
            result += "parsley"; 
            i += 8;
         } else {
            result += text.charAt(i);
            i++;
         }
      }
      return result;
   }
   public static void main(String[] args) {
      System.out.println("cilantrotest");
      System.out.println(killCilantro("testcilantrotest"));
      System.out.println(killCilantro("cilantrotest"));
      System.out.println(killCilantro("nothinghere"));
      System.out.println(killCilantro("testcilantro"));
      System.out.println(killCilantro("cilantrocilantrocilantro"));
   }
}