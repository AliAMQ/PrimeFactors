
public class Main {

    public static void main(String[] args) {

        int nmbr = 14;

        boolean found = false;
        int cntr =2;

        while (found==false && cntr < (nmbr/2)){
            if (isPrime(cntr) && isPrime(nmbr-cntr)){
                found=true;
                System.out.println(cntr + " and " + (nmbr - cntr));
            }
            cntr++;
        }

    }

    public static boolean isPrime(int nmbr){

        if (nmbr==1 || nmbr==0){
            return false;
        }

        for(int i=2;i*i <= nmbr;i++){
            if (nmbr%i==0){
                return false;
            }
        }
        return true;
    }
}
