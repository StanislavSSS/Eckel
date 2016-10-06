import java.util.*;

/**
 * Created by sk10271 on 06.10.2016.
 */
public class Ex1P96 {
    public static void main(String[] args){
        //ex1();
        ex2();
    }

    public static void ex1(){
        for (int i = 1; i <= 100; i++){
            System.out.println(i);
        }
    }

    public static void ex2(){
        Random rand = new Random();
        int i1, i2, i3, i4, i5;
        i1 = rand.nextInt();
        i2 = rand.nextInt();
        i3 = rand.nextInt();
        i4 = rand.nextInt();
        i5 = rand.nextInt();
        if (i1>i2) System.out.println("i1 is greater then i2!");
        else if (i1<i2) System.out.println("i1 is less then i2!");
        else if (i1==i2) System.out.println("i1 is equals i2!");


    }


}
