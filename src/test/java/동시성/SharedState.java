package 동시성;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.*;

public class SharedState {

    @Test
    public void sharedState(){
        final ExecutorService executorService = Executors.newCachedThreadPool();
        final AtomicCounter counter = new AtomicCounter();

        executorService.execute(new CounterSetter(counter));

        final int value = counter.getNumber().incrementAndGet();
        assertEquals(1, value);
    }

    private static class CounterSetter implements Runnable{
        private final AtomicCounter counter;
        public CounterSetter(AtomicCounter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            while(true){
                counter.getNumber().set(0);
            }
        }
    }

    public class SimpleCounter{
        private int number = 0;

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }
    }

    public class AtomicCounter{
        private final AtomicInteger number = new AtomicInteger(0);

        public AtomicInteger getNumber(){
            return number;
        }
    }
}
