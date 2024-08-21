import java.util.*;

/* this is the willians' formula for detecting if a number is prime
    formula ->
    ((n-1)!+1)/n
    if the answer is a whole number then it's a prime number.
 */
public class PrimeDetector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(isPrime(n));
    }

    private static boolean isPrime(int n) {
        double value= (double) (factorial(n - 1) + 1) /n;
        return value==Math.floor(value);
    }

    private static long factorial(int n) {
        long num = 1;
        while(n>0) {
            num *= n;
            n--;
        }
        return num;
    }
}

/*

    j               ((n-1)!+1)/n              isPrime()
 ___________________________________________________________

    1                   2                       true
    2                   1                       true
    3                   1                       true
    4                   7/4                     false
    5                   5                       true
    6                   121/6                   false
    7                   103                     true
    8                   5041/8                  false
    9                   40321/9                 false
    10                  362881/10               false
    11                  329891                  true

 */
