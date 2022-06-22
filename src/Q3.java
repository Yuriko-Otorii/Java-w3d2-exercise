import java.util.ArrayList;
import java.util.Collections;


public class Q3 {
    public static void main(String[] args)   {

        ArrayList<Cars> car = new ArrayList<>();
        
        car.add(new Cars("TOYOTA", "Prius", 2000));
        car.add(new Cars("NISSAN", "Leaf", 2018));
        car.add(new Cars("TOYOTA", "Carolla", 2010));
        car.add(new Cars("NISSAN", "NOTE", 1999));
        
        Collections.sort(car);
        for(Cars elem: car){
            System.out.printf("%s%s%s%s%s%d%s%n", "[", elem.getMake(), ", ", elem.getModel(), ", ", elem.getYear(), "]");
        }
    }    
}

class Cars implements Comparable<Cars>{
    private String make;
    private String model;
    private int year;


    public Cars(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

   
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Cars o) {
        if(this.year == o.year){
            return 0;
        }else if(this.year < o.year){
            return -1;
        }else{
            return 1;
        }
    }

    
}