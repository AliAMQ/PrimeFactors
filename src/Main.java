import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(primeFactors(14));
    }

    public static ArrayList<Integer> primeFactors(int a) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for(int i=2;i<a-2;i++){
            if(isPrime(i) && isPrime(a-i)){
                primes.add(i);
                primes.add(a-i);
                return primes;
            }
        }
        return primes;
    }

    public static boolean isPrime(int number){
        if (number==1 || number==0){
            return false;
        }
        for (int i =2; i*i <= number;i++){
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
}
