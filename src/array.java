public class array {
    public static void main(String[] args) {
        int[] array = new int[900];
        for(int i = 0, res = 100; i < array.length; i++, res++) {
            array[i] = res;
        }
        int[] arr_rev = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr_rev[i] = array[array.length - (i + 1)];
        }
        System.out.println(array[array.length - 1]);
        System.out.println(arr_rev[arr_rev.length-1]);
    }
}
