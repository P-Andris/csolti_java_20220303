package Progtetelek;

import java.util.Random;

public class Primszam_metodussal {
    // static int szam = 23;
    // static boolean prim;
    
    private static boolean ellenorzes(int szam) {
        int i = 2;
        if(szam < 2) return false;
        else {
            while(i <= Math.sqrt(szam) && !(szam % i == 0)) i++;
        }
        return i > Math.sqrt(szam);
    }

    static void sorozatotKiir(int[] sorozat) {
        for(int i = 0; i < sorozat.length; i++) {
            System.out.print(sorozat[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        /* int szam = 25;
        boolean prim;

        if(szam < 2) prim = false;
        else {
            int i = 2;
            while(i <= Math.sqrt(szam) && !(szam % i == 0)) {
                i++;
            }
            
            boolean vanOsztoja = i < szam - 1;
            boolean nincsOsztoja = i >= szam - 1;
            boolean prim = i < szam - 1;
            boolean nemPrim = i >= szam - 1;
            prim = i > Math.sqrt(szam);
        }
        
        System.out.printf("%d az prím? %b", szam, prim); */


        int szam = 10001;
        boolean prim = ellenorzes(szam);

        int[] sorozat = {10001, 2, 1, 10007, new Random().nextInt()};
        sorozatotKiir(sorozat);

        int N = sorozat.length;
        int primDb = 0;
        for(int i = 0; i < N; i++) {
            if(ellenorzes(sorozat[i])) primDb++;
        }
        System.out.printf("Összesen %d db prím van a sorozatban.\n", primDb);

        // Eldöntés I:
        int i = 0;
        while(i < N && !(ellenorzes(sorozat[i]))) i++;
        boolean vanBennePrim = i < N;
        boolean nincsBennePrim = i >= N;
        System.out.println("Van benne prím? " + vanBennePrim);

        // Eldöntés II:
        i = 0;
        while(i < N && ellenorzes(sorozat[i])) i++;
        boolean mindenElemePrim = i >= N;
        System.out.println("Minden eleme prím? " + mindenElemePrim);

        // Lineáris keresés
        i = 0;
        while(i < N && !(ellenorzes(sorozat[i]))) i++;
        boolean vanLegalabbEgyPrim = i < N;
        if(vanLegalabbEgyPrim) System.out.println("Az első prím: " + sorozat[i]);
        else System.out.println("Nincs benne prím.");
    }
}
