package pattern_printing;
//Print this
//        1
//        1 2
//        1 2 3
//        1 2 3 4
public class pattern4 {
    public static void main(String[] args) {

        int number  = 5;

        print(number);
    }

    static void print(int n){
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");

            }
            System.out.println();

        }
    }
}
