import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
//    final static int N = 63;
//    final static int M = 48;

//    public static void main(String[] str) {
//        Integer[] array = new Integer[N];
//        for (int i = 0; i < N; i++) array[i] = i;
//        int start = 0, m = M, n = N, k = n - m;
//        new Demo().run(array, start, m, n, k);
//    }

    public void run(Integer[] array, int m) {
        int current=array[0], mCurrent=m;
        for (int i=0;i<array.length;i++) {
            array[mCurrent]=
            start = nRun - (m > k ? n % k : m);
            m = nRun - (m > k ? (k + n % k)-(k + n % k) / (n % k) * (n % k) : n-n / m * m) - start;
            n = nRun - start;
            k = n - m;
        }
//        System.out.println(Arrays.asList(array));
    }

    private int range(Integer[] array, int start, int m, int n, int k) {
        int tmp0, tmp1;
        for (int i = start + m; i < start + n; i++) {
            tmp0 = array[i];
            for (int j = 0; j < n / k; j++) {
                tmp1 = array[i - m + j * k];
                array[i - m + j * k] = tmp0;
                tmp0 = tmp1;
            }
            if (!(m >= k && n % k == 0)) array[i] = tmp0;
        }
        return (m > k ? (n % k == 0 ? 0 : k % (n % k)) : n % m);
    }
}
