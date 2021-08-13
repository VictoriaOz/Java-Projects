import java.util.Scanner;
public class PasswordGenerator {
    
    private String word1;
    private String word2;
    private String word3;
    private String word4;
    private String word5;
    private int n;
    String p;

    //constructor
    PasswordGenerator() {
        word1 = "null";
        word2 = "null";
        word3 = "null";
        word4 = "null";
        word5 = "null";
    } 

   public void passwordGenerator (int i, String a, String b, String c, String d, String e) {
       //cut the letters of each word to the specified amount i.
       n = i;
       if (a.length() < n) {
        word1 = a;
       }
       else {
        word1 = a.substring(0, n);
       }
       if (b.length() < n) {
        word2 = b;
       }
       else { 
           word2 = b.substring(0, n);
        }
        if (c.length() < n) {
            word3 = c;
        }
        else {
            word3 = c.substring(0, n);
        }
       if (d.length() < n) {
           word4 = d;
       }
       else {
           word4 = d.substring(0, n);
        }
        if (e.length() < n) {
            word5 = e;
        }
       else {
        word5 = e.substring(0, n);
       }
       

   }
   public String getPassword () {
    //returns password
    return word1 + word2 + word3 + word4 + word5;
}
    public void setPhrase(String a, String b, String c, String d, String e) {
        //sets the phrase
        word1 = a;
        word2 = b;
        word3 = c;
        word4 = d;
        word5 = e;
        p = word1 + " " + word2 + " " + word3 + " " + word4 + " " + word5;
    }
    
    public String getPhrase() {
        //returns phrase
        return p;
        
    }
    public void setN (int i) {
        //sets the amount of letters for each word.
        n = i;
    }
    public int getN () {
        //returns N
        return n;
    }
    public int getPasswordLength () {
        //returns the length of the password
        return word1.length() + word2.length() + word3.length() + word4.length() + word5.length();
    }

   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       PasswordGenerator password = new PasswordGenerator();
       System.out.print("Enter 5 phrase words: ");
       String w1;
       String w2;
       String w3;
       String w4;
       String w5;
       int m;
       w1 = s.next();
       w2 = s.next();
       w3 = s.next();
       w4 = s.next();
       w5 = s.next();
       //System.out.println(w1 + " " + w2 + " " + w3 + " " + w4 + " " + w5);
       password.setPhrase(w1, w2, w3, w4, w5);
      // System.out.println(password.getPhrase());
       System.out.print("Enter default n value: ");
       m = s.nextInt();
       password.passwordGenerator(m, w1, w2, w3, w4, w5);
       System.out.println("\nUsing n: " + password.getN() + "," );
       System.out.println("Password: " + "Length = " + password.getPasswordLength() + ": " + password.getPassword());
       System.out.println();
       s.close(); //closes the scanner
        
    }
}