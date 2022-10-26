package curs;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FibonacciConsumator extends Thread{
    private DataInputStream fluxIn;

    public FibonacciConsumator(InputStream in)
    {
        fluxIn = new DataInputStream(in);
    }



    @Override
    public void run() {
        try{
            while (true)
                System.out.println("Consumator: " + fluxIn.readInt() + "SUA");

        }catch(IOException ex)
        {
            if(ex.getMessage().equals("Pipe broken")
                    || ex.getMessage().equals("write end dead"))
                return;
            ex.printStackTrace();
        }
    }
}
