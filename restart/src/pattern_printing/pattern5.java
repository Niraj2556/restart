package pattern_printing;
//Print this
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
public class pattern5 {
    public static void main(String[] args) {
        int number  = 4;
        print(number);
    }
    static void print(int n){
        for (int i = 0; i <= 2 * n; i++) {
            int total = i > n ? 2 * n - i : i;
            for (int j = 0; j <= total; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
