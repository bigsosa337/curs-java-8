package curs;

public class HelloRunnable implements Runnable{

    String vector[] = {"Bonjour", "ai" , "20 lei?"};

    @Override
    public void run() {
        for (int i=0; i< vector.length;i++)
        try
        {
            Thread.sleep(2000);
            System.out.println(vector[i]);

        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("gata sefu");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new HelloRunnable());
        thread.start();
    }
}
