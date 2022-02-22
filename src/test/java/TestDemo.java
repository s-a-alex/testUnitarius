import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Random;
import static org.junit.Assert.assertEquals;

public class TestDemo {
    private static Logger logger = LoggerFactory.getLogger(TestDemo.class);

    @Test
    public void testRun() {
        logger.info("testRun");
        Random random=new Random();
        Demo demo=new Demo();
        for(int j=0;j<100;j++) {
            int start = 0, m = random.nextInt(1024) + 1, k = random.nextInt(1024) + 1, n = m + k;
            Integer[] array = new Integer[n], arrayTest = new Integer[n];
            for (int i = 0; i < n; i++) array[i] = i;
            for (int i = 0; i < n; i++) arrayTest[i] = array[(i + m) % n];
            logger.info(String.format("m=%d, k=%d, n=%d", m, k, n));
            logger.info(String.valueOf(Arrays.asList(arrayTest)));
            demo.run(array, start, m, n, k);
            logger.info(String.valueOf(Arrays.asList(array)));
            for (int i = 0; i < n; i++) assertEquals(array[i], arrayTest[i]);
        }
    }
}
