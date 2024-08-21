import java.util.*;

/* this is the willians' formula for computing the nth prime number
    formula ->
    check assets/willians-formula.png in the main directory

    if the answer is a whole number then it's a prime number.
 */
public class PrimeCompute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Double> list= new ArrayList<>();

        for(int i=1;i<=n;i++) {
            list.add(computePrime(i));
        }

        System.out.println(list);
    }

    private static double computePrime(int n) {
        double result = 1;
        for (int i = 1; i <= Math.pow(2, n); i++) {
            double sum = 0;
            for (int j = 1; j <= i; j++) {
                double cosineValue = Math.cos(Math.PI * (factorial(j - 1) + 1) / j);
                sum += Math.floor(Math.pow(cosineValue, 2));
            }
            result += Math.floor(Math.pow(n / sum, 1.0 / n));
        }
        return result;
    }

    private static double factorial(int n) {
        double num = 1;
        while (n > 0) {
            num *= n;
            n--;
        }
        return num;
    }
}

/*

    j                   P(n)
 ___________________________________________________________

    1                   2
    2                   3
    3                   5
    4                   7
    5                   11
    6                   13
    7                   17
    8                   19
    9                   23
    10                  29
    11                  31

 */
