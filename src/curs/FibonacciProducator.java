package curs;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FibonacciProducator extends Thread{
    private DataOutputStream fluxOut;
    private int nr;

    public FibonacciProducator(OutputStream out, int nrelem)
    {
        fluxOut = new DataOutputStream(out);
        nr = nrelem;
    }

    @Override
    public void run() {

        try{
            //f(n) =  f(n-1) + f(n-2)
            int f1 = 1;
            int f2 = 1;
            fluxOut.writeInt(f1);
            System.out.println("Producator: " + f2 + "china");
            fluxOut.writeInt(f2);
            System.out.println("Producator: " + f2 + "taiwan");

            for (int i=2;i<nr;i++)
            {
                int temp = f2;
                f2 = f2+f1;
                f1 = temp;

                System.out.println("Producator: " + f2 + "vietnam");

                fluxOut.writeInt(f2);
            }


        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
