package HomeAssignments_Day2;

public class IsPrime {
public static void main(String[] args) {
    
    int n = 7, i;
    for (i=2; i<n; i++)
        if (n % i == 0)
            break;
        if (i == n && n > 1)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");

}
}
