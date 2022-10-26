package curs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sortare2 extends Thread{
    public  int vector[] = new int[50];

    @Override
    public void run() {
        super.run();
        for(int i=0; i<vector.length;i++)
            vector[i] = (int)Math.random()*(100+i);
        Arrays.sort(vector);

        for(int i=0;i<vector.length;i++)
            System.out.println("vector2: " +vector[i]);
        System.out.println("gataaaaaaaaaaaaasortare2");

    }
}
