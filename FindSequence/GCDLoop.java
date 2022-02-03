

public class GCDLoop {
    public static void main(String[] args) {
        int a =Integer.parseInt(args[0]);
        int b =Integer.parseInt(args[1]);
        int greater = a > b ? a : b;
        int smaller = a < b ? a : b;

        int q = greater / smaller;
        int r = greater % smaller;
        System.out.println("greater = "+greater);
        System.out.println("smaller = "+smaller);
        System.out.println("r = "+r);
        while (r > 0) {
            q = smaller / r;
            r = smaller % r;
            System.out.println("greater = "+greater);
            System.out.println("smaller = "+smaller);
            System.out.println("r = "+r);
            greater=smaller;
            smaller = r;

        }
        System.out.println("GCD "+greater);
    }
}