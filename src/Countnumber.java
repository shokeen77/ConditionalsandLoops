public class Countnumber {
    public static void main(String[] args) {
        int n = 13839;
        int count =0;
        while( n > 0){
            int rem = n % 10; // remainder = 9
            if(rem == 3){
                count ++;
            }
            n = n / 10; //quotient
        }
        System.out.println(count);
    }
}
