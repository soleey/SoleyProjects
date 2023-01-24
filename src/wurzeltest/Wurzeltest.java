package wurzeltest;

public class Wurzeltest {
    public static boolean istWurzel (int z1, long z2){
       return  z1 * z1 == z2 ? true : false;
    }

    public static void main(String[] args) {
        System.out.println ( istWurzel(3,9));
    }
}
