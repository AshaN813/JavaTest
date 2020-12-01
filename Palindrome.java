import java.util.Scanner;

public class Palindrome  
{ 
    static boolean isPalindrome(int n)  
    {   if (n % 11 == 0)  
        {  
    	System.out.println("true");
            return true;   
        }   
    System.out.println("false");
	return false;
    }   
    public static void main(String[] args)  
    { 
        Scanner scr=new Scanner(System.in);
        Palindrome obj=new Palindrome();
        System.out.printf("Enter number:");
        int n=scr.nextInt();
        obj.isPalindrome(n);
        
    } 
} 

/*
 * else { int temp, digit, count = 0; temp = n; while(n > 0) { n = n / 10;
 * count++; } while(temp > 0) { digit = temp % 10;
 * System.out.println(count+" is: "+digit); temp = temp / 10; count--;
 * System.out.println("true"); return true; } }
 */