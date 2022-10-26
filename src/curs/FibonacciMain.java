package curs;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class FibonacciMain {
    public static void main(String[] args) {

        try
        {
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

            FibonacciProducator fp = new FibonacciProducator(pos, 10);
            FibonacciConsumator fc = new FibonacciConsumator(pis);
            fp.start();
            fc.start();
        }catch (IOException ex)

        {
            ex.printStackTrace();
        }


    }
}
