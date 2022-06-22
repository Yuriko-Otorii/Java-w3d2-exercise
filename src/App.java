import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> array = new ArrayList<>(10);
        Random rand = new Random();
        Scanner s = new Scanner(System.in);
      
        // for(int i = 0; i <= 10; i++){
        //     array.add(rand.nextInt(51));
        // }   

        displayNums(array);

        System.out.printf("%nPlese chode a nember: ");
        int num = s.nextInt();
        int intIndex = array.indexOf(num);

        if(intIndex != -1){
            System.out.println("The number is in the list.");
        }else{
            System.out.println("The number is not in the list.");
        }

        s.close();
    }

    // static void createRandomNum(){
    //     for(int i = 0; i <= 10; i++){
    //         array.add(rand.nextInt(51));
    //     }
    // }

    static void displayNums(ArrayList<Integer> nums){
        for(int i = 0; i < nums.size(); i++){
            System.out.print(nums.get(i) + " ");
        }
    }
    

    // static int search(int num){
    //     return array.indexOf(num);
    // }

    

}
