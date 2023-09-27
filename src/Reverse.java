public class Reverse {
    public static void main(String[] args) {
        int num = 23597;
        int ans = 0; //7

        while (num > 0) {
            int r = num % 10; // gives remainder = 9
            num = num / 10; //  247.9

            ans = ans * 10 + r;
        }
        System.out.println(ans);

    }
}