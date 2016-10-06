/**
 * Created by sk10271 on 06.10.2016.
 */
public class Ex14P91 {
    public static void main(String[] args){
        cats("ararat", "ara", (char) 1);
        cats("ararat", "ararat", (char) 2);

    }

    public static void cats(String s1, String s2, char c1){
        System.out.println(s1==s2);
        System.out.println(s1!=s2);
        System.out.println(s1.equals(s2) + "\n");
    }
}
