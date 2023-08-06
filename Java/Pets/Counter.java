import java.io.Closeable;
import java.io.IOException;

public class Counter implements Closeable {
    
    private int count = 0;

    public void Add() throws Exception {
        count = count + 1;
    }

    @Override
    public void close() throws IOException {
        System.out.println("Closed Counter: count=" + count);
    }

}
