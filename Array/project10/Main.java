package Array.project10;

import java.util.Scanner;

public class Main {
    public boolean isPalindrome(String words){
        char[] charArray = words.toCharArray();
        int start = 0;
        int end = words.length() - 1;
        while(start < end){
            if(charArray[start] != charArray[end]){
                return  false;
            }
            else{
                start++;
                end--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Main obj = new Main();
        Scanner input = new Scanner(System.in);
        String words = input.next();
        System.out.println(obj.isPalindrome(words));
        input.close();
    }
}
