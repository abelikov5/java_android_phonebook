public class loop {
    public static void main(String[] args) {
        int i = 1;
        int res = 0;
        while (i <= 100) {
            res += i;
            i++;
        }
        System.out.println("среднее число: ");
        System.out.println((float) res / 100);
    }
}
