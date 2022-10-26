package curs;

public class Fir extends  Thread{
    @Override
    public void run() {
        for(int i = 0; i<10; i++)
        {
            System.out.println("se incearca o 9 retragere :/");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Cont.retragere((int)(Math.random()*500));
        }
    }
}
