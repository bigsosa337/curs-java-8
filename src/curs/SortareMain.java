package curs;

public class SortareMain {
    public static void main(String[] args) {

        Sortare1 t1 = new Sortare1();
//        t1.join(5000);
        t1.setPriority(10);
        t1.start();
//        Thread.sleep(2000);
        int i=0;
        while(t1.isAlive())
            i++;
        System.out.println("contor t1: " + i);



        Sortare2 t2 = new Sortare2();
        t2.start();
        int j=0;
        while(t2.isAlive())
            j++;
        System.out.println("contor t2: " + j);
    }
}
