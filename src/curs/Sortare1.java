package curs;

public class Sortare1 extends Thread{
    public  int vector[] = new int[50];

    @Override
    public void run() {

        for(int i=0; i<vector.length;i++)
            vector[i] = (int)Math.random()*(100+i);

        for(int i=0; i<vector.length-1; i++)
            for(int j=i+1;j<vector.length;j++)
                if(vector[i] > vector[j])
                {
                    int temp = vector[i];
                    vector[i] = vector[j];
                    vector[j] = temp;
                }
        for(int i=0;i<vector.length;i++)
            System.out.println("vector1: " +vector[i]);
        System.out.println("gataaaaaaaaaaaaasortare1");

    }
}
