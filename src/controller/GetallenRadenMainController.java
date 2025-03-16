package controller;

import java.util.Arrays;
import java.util.Scanner;

public class GetallenRadenMainController {


    public static int[] genereerGetallen() {
        int[] mpRijRandomGetallen = {0, 0, 0};
        int mpRandomGetal = 0;
        boolean mpBlijfDraaien;

        final int mpGetalBovengrens = 10;
        final int mpGetalOndergrens = 1;

        for (int i = 0; i < mpRijRandomGetallen.length; i++) {

            mpBlijfDraaien = true;

            while (mpBlijfDraaien) {

                mpRandomGetal = (int) (Math.random() * mpGetalBovengrens) + mpGetalOndergrens;


                for (int j = 0; j < mpRijRandomGetallen.length; j++) {

                    if (mpRandomGetal != mpRijRandomGetallen[0] && mpRandomGetal != mpRijRandomGetallen[1] && mpRandomGetal != mpRijRandomGetallen[2]) {

                        mpBlijfDraaien = false;
                    }
                }
            }

            mpRijRandomGetallen[i] = mpRandomGetal;

        }


        return mpRijRandomGetallen;

    }

    public static boolean komtVoorIn(int mpZoekGetal, int[] mpRij) {

        for (int i = 0; i < mpRij.length; i++) {

            if (mpRij[i] == mpZoekGetal) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {

        // variabelen
        int[] rijRandomGetallen = genereerGetallen();
        int[] gekozenGetallen = new int[3];
        int pogingenOmAlleGetallenTeRaden = 0;
        int aantalJuisteGetallen;
        boolean antwoordNietGeraden = true;
        Scanner userInput;

        // Scanner init
        userInput = new Scanner(System.in);

        while (antwoordNietGeraden) {

            aantalJuisteGetallen = 0;
            System.out.println("Geef 3 verschillende getallen tussen 1 en 10, gescheiden door spaties: ");

            for (int i = 0; i < gekozenGetallen.length; i++) {
                gekozenGetallen[i] = userInput.nextInt();
            }
            pogingenOmAlleGetallenTeRaden++;
            for (int i = 0; i < gekozenGetallen.length; i++) {
                if (komtVoorIn(gekozenGetallen[i], rijRandomGetallen)) {
                    aantalJuisteGetallen++;
                }
            }
            if (aantalJuisteGetallen == 3){
                antwoordNietGeraden = false;
            }

            System.out.println("Aantal correcte getallen = " + aantalJuisteGetallen);
        }

        System.out.println();
        System.out.printf("Je hebt %d keer geraden.%n", pogingenOmAlleGetallenTeRaden);

        System.out.print("De te raden getallen waren: ");
        Arrays.sort(rijRandomGetallen);

        for (int i = 0; i < rijRandomGetallen.length; i++) {
            System.out.printf("%d ", rijRandomGetallen[i]);
        }
        System.out.println();

    }

}
