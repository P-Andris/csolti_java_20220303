package Metodus;

public class Osszeadas_jobb {

    static int osszead(int a, int b) {
        return a + b;
    }

    /* static void kettoSzamOsszegetKiir(int szam1, int szam2, int eredmeny) {
        System.out.printf("| %d + %d = %d |\n", szam1, szam2, eredmeny);
    } */
    
    static void kettoSzamOsszegetKiir(int szam1, int szam2) {
        System.out.printf("| %d + %d = %d |\n", szam1, szam2, osszead(szam1, szam2));
    }

    public static void main(String[] args) {
        int szam1 = 3, szam2 = 5;
        int eredmeny = osszead(szam1, szam2);
        // kettoSzamOsszegetKiir(szam1, szam2, eredmeny);
        kettoSzamOsszegetKiir(szam1, szam2);

        int masikEredmeny = osszead(eredmeny, 2);
        // kettoSzamOsszegetKiir(eredmeny, 2, masikEredmeny);
        kettoSzamOsszegetKiir(eredmeny, 2);

        // kettoSzamOsszegetKiir(13, 8, osszead(13, 8));
        kettoSzamOsszegetKiir(13, 8);
    }
}
