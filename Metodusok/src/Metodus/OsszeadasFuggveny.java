package Metodus;

public class OsszeadasFuggveny {
    static int szam1 = 3;
    static int szam2 = 5;
    
    static int kettoSzamotOsszead() {
        return szam1 + szam2;
    }

    /* static void kettoSzamOsszegetKiir(int szam1, int szam2, int eredmeny) {
        System.out.printf("| %d + %d = %d |\n", szam1, szam2, eredmeny);
    } */
    
    static void kettoSzamOsszegetKiir() {
        System.out.printf("| %d + %d = %d |\n", szam1, szam2, kettoSzamotOsszead());
    }
    
    public static void main(String[] args) {
        // int szam1 = 3, szam2 = 5;
        // int eredmeny = osszead(szam1, szam2);
        int eredmeny = kettoSzamotOsszead();
        // kettoSzamOsszegetKiir(szam1, szam2, eredmeny);
        kettoSzamOsszegetKiir();

        szam1 = eredmeny;
        szam2 = 2;
        int masikEredmeny = kettoSzamotOsszead();
        // kettoSzamOsszegetKiir(eredmeny, 2, masikEredmeny);
        kettoSzamOsszegetKiir();

        szam1 = 13;
        szam2 = 8;
        // kettoSzamOsszegetKiir(13, 8, osszead(13, 8));
        kettoSzamOsszegetKiir();
    }
}
