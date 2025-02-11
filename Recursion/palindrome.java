//write a program to check a given array is palindrome or not
public class palindrome {
    public static void main(String[] args) {
        System.out.println(checkpalindrome("abba"));
    }
    public static boolean checkpalindrome(String s){
        int n= s.length();
        if(n==0 || n==1){
            return true;
        }

        return s.charAt(0)== s.charAt(n-1) && checkpalindrome(s.substring(1, n-1));
    }
}

