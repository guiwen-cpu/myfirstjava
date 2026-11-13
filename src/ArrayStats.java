public class ArrayStats {
    static int max(int[] arr) {
        int m = arr[0];
        for (int n : arr) {
            if (n > m) m = n;
        }
        return m;
    }

    static int min(int[] arr) {
        int m = arr[0];
        for (int n : arr) {
            if (n < m) m = n;
        }
        return m;
    }

    static double average(int... arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int haha = Main.add(3, 2);
        System.out.println(average(3,5,9));
        System.out.println(max(new int[]{1,2,3}));
        System.out.println(min(new int[]{1,2,3}));


    }
}
