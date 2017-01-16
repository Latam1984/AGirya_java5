package modul_10;

/**
 * Created by Aleksey on 16.01.2017.
 */
public class Test {
    public static void main(String[] args) {
        try {
            int [] ar = {1,2,3};
            System.out.println(ar[3]);
        }   catch (IndexOutOfBoundsException a){
            System.out.println(11);
        }
        catch (Exception e){
            System.out.println(10);
        }
//try {
//    throw new Test();
//}
    }
}
