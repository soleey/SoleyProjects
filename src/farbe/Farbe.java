package farbe;

public class Farbe {

    public static int invertiere(int Farbe) {

        int invertiereFarbe = ( 255255255 - Farbe );

        int rot = Farbe / 10000;
        int gruen = Farbe / 1000;
        int blau = Farbe % 10;

        return invertiereFarbe;
    }


    public static void main (String[] args) {
        System.out.println(invertiere( 000000000));
    }
}
