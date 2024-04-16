package Recursion;

public class VerifyPalindromeString {


    public boolean validatePalindrome(String str, int size,int index){
        if(index>size/2){
            return true;
        }
        if(str.charAt(index) != str.charAt(size-index-1)){
            return  false;
        }
        return validatePalindrome( str,size,index+1);
    }
    public static void main(String[] args) {

        VerifyPalindromeString palindromeString =new VerifyPalindromeString();
        boolean isPalindrome = palindromeString.validatePalindrome("abcaa", 5, 0);
        String output = isPalindrome ? "Is Palindrome String" : "Not a palindrome string";
        System.out.println(output);
    }
}
