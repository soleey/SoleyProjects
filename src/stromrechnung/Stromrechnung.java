package stromrechnung;

public class Stromrechnung {

    public static void main(String[] args) {
        /*Anfang von Variablenamen immer klein + zusammen schreiben*/

        double tarif1;
        double tarif2;

        double grundpreisTarif1 = 5.75;
        double grundpreisTarif2 = 9.85;

        double verbrauchspreisTarif1 = 23.49;
        double verbrauchspreisTarif2 = 22.10;

        int JahresverbrauchkWh = 3536;

        System.out.println((int) (((grundpreisTarif1 * 12 + verbrauchspreisTarif1 * JahresverbrauchkWh / 100) * 100 + 0.5)) * 1.0 / 100 );
        System.out.println((int) (((grundpreisTarif2 * 12 + verbrauchspreisTarif2 * JahresverbrauchkWh / 100) * 100 + 0.5)) * 1.0 / 100 );

        tarif1 = ((int) (((grundpreisTarif1 * 12 + verbrauchspreisTarif1 * JahresverbrauchkWh / 100) * 100 + 0.5)) * 1.0 / 100);
        tarif2 = ((int) (((grundpreisTarif2 * 12 + verbrauchspreisTarif2 * JahresverbrauchkWh / 100) * 100 + 0.5)) * 1.0 / 100 );

        System.out.println(((tarif1 < tarif2)? tarif1 : tarif2));

    }
}
