package Metodus;

public class Osszeadas {
    /*
    Hibás, mert két dolgot is csinál:
    1. kiír
    2. összead
    */
    /*
    static void osszead() {
        System.out.printf("%d + %d = %d\n", a, b, a + b);
    }
    */
    
    static int osszead(int a, int b) {
        return a + b;
    }

    static void kettoSzamOsszegetKiir(int szam1, int szam2, int eredmeny) {
        System.out.println(" ------------ ");
        System.out.printf("| %d + %d = %d |\n", szam1, szam2, eredmeny);
    }

    public static void main(String[] args) {
        int szam1 = 3, szam2 = 5;
        int eredmeny = osszead(szam1, szam2);
        kettoSzamOsszegetKiir(szam1, szam2, eredmeny);

        int ujEredmeny = osszead(eredmeny, 2);
        kettoSzamOsszegetKiir(eredmeny, 2, ujEredmeny);

        kettoSzamOsszegetKiir(13, 8, osszead(13, 8));
    }
}
