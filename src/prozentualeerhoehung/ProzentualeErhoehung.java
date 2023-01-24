package prozentualeerhoehung;

public class ProzentualeErhoehung {

    public static void main (String []agrs) {
        System.out.println("Soll: 3.69 Ist: " + erhoeheBetrag(2.46F, 50));
        System.out.println("Soll: 3.0 Ist: " + erhoeheBetrag(3,0));
        System.out.println("Soll: 0.0 Ist " + erhoeheBetrag( 0, 90));
        System.out.println("Soll: 23.81 Ist: " + erhoeheBetrag( 17.9F, 33));
    }

    public static float erhoeheBetrag(float betrag, int prozent ) {
        // Variable, damit float betrag und int prozent zusammen gemacht werden koennen
        float erhoehterBetrag;

        // Berechne ich den neuen Betrag
        erhoehterBetrag = betrag + betrag * prozent / 100;

        //runden
        erhoehterBetrag = (int) (erhoehterBetrag * 100 + 0.5F);
        erhoehterBetrag = erhoehterBetrag / 100;

        return erhoehterBetrag;
    }


     }






