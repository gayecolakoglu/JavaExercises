import java.util.Scanner;

public class FindPrime {
    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        int value=Integer.parseInt(args[0]);//terminal için
        //Scanner scanner=new Scanner(System.in);//intellij için
        //int value=scanner.nextInt();//intellij için
        for(int i=2; i<value; i++ ){
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

}

