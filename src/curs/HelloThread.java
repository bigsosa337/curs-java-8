package curs;

public class HelloThread extends Thread{
    @Override
    public void run() {

        for(int i=0; i<5; i++)
        {
            try{
                System.out.println("aaaaaaaaaaaaaaaaaaaaaaaa");
                Thread.sleep(2000);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("cine nu-i gata iau cu lopata");
    }

    public static void main(String[] args) {
        HelloThread thread = new HelloThread();
        thread.start();

    }
}
