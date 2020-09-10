import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str){
        int count = 0;
        String strlil = str.toLowerCase();
        for(int i=0;i<strlil.length();i++){
            if((str.substring(i,i+1).equals("a")) || (str.substring(i,i+1).equals("b")) || (str.substring(i,i+1).equals("c"))){
                count+=1;
            }
        }
        return count;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        return str.indexOf("The")>-1 || str.indexOf("the")>-1;
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        String reverse = "";
        for(int i=0;i<str.length();i++){
            reverse = reverse + str.charAt(str.length()-1-i);
        }
        return str.equals(reverse);
        }
    
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a string");
        String str = scan.nextLine(); 
        System.out.println("There are " + countABC(str) + " A's, B's, and C's.");
        if(containsThe(str)){
            System.out.println("There is at least one 'The' or 'the' in your string.");
        }else{
            System.out.println("There is NOT at least one 'The' or 'the' in your string.");
        }
        if(isPalindrome(str)){
            System.out.println("Your String is a Palindrome.");
        }else{
            System.out.println("Your String is NOT a Palindrome.");
        }
        scan.close();

    }
}
