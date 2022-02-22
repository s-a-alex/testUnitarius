import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertEquals;

@Slf4j
public class TestDemo {

    private final static int maxM = 1024;
    private final static int cntTest = 1000;

    @Test
    public void testRun() {
        log.info("testRun");
        Random random = new Random();
        Demo demo = new Demo();
        for (int j = 0; j < cntTest; j++) {
            int m = random.nextInt(maxM) + 1;
            Integer[] array = new Integer[m + random.nextInt(maxM) + 1], arrayTest = new Integer[array.length];
            for (int i = 0; i < array.length; i++) array[i] = i;
            for (int i = 0; i < array.length; i++) arrayTest[i] = array[(i + m) % array.length];
            log.info(String.format("m=%d, k=%d, n=%d", m, array.length - m, array.length));
            log.info(String.valueOf(Arrays.asList(arrayTest)));
            demo.run(array, array.length - m);
            log.info(String.valueOf(Arrays.asList(array)));
            for (int i = 0; i < array.length; i++) assertEquals(array[i], arrayTest[i]);
        }
    }
}
