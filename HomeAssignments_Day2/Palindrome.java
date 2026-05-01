package HomeAssignments_Day2;

public class Palindrome {

    public static void main(String[] args) {
         int n = 121, rev = 0;

        for (int i = n; i > 0; i /= 10) {   
            rev = rev * 10 + (i % 10);     
        }

        if (n == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}