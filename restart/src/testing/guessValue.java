package testing;

public class guessValue {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = (x>y)?(x++):(y--);
        System.out.println(x);
    }
}
