import java.util.ArrayList;
import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        ArrayList<Integer> originalArray = new ArrayList<>(10);
        Random rand = new Random();

        
        for(int i = 0; i < 10; i++){
            originalArray.add(rand.nextInt((50-1) -1));
        }   


        ArrayList<Integer> copyArray = new ArrayList<>(originalArray);

        originalArray.set(9, -5);

        System.out.println(originalArray);
        System.out.println(copyArray);



    }
}
