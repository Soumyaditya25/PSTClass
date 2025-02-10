public class Linear {
    public static void main(String[] args) {
        System.out.println(linear(2, 3));
    }

    public static int linear(int x, int n) {
        if(n==0){
            return 1;
        }

        return n*linear(x, n-1);
    }
}
