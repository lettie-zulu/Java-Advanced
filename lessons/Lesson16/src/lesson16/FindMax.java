package lesson16;

import java.util.concurrent.ThreadLocalRandom;
public class FindMax {

    public static void main(String[] args) {
        int[] data = new int[1024*1024*128];
        for (int i = 0; i < data.length; i++) {
            data[i] = ThreadLocalRandom.current().nextInt();
        }


        int max = Integer.MIN_VALUE;
        for(int value : data) {
            if(value > max) {
                max = value;
                System.out.println("max: " + max);
            }
        }
    }
}
