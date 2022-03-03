package Progtetelek;

import java.util.Scanner;

public class Onallo_feladat {

    static void cim(String szoveg) {
        System.out.println(szoveg);
    }

    static void beker(String kerdes, int egyikSzam, int masikSzam) {
        Scanner sc = new Scanner(System.in);
        
        kerdes = kerdes + ": ";
        System.out.print(kerdes);
        int szam = -1;
        boolean jo = false;
        while(!jo) {
            szam = sc.nextInt();
            jo = szam >= egyikSzam && szam <= masikSzam;
            if(!jo) {
                System.out.println("Hibás! Újra!");
                System.out.print(kerdes);
            }
        }
    }
    
    public static void main(String[] args) {
        cim("BMI index kiszámítása");
        beker("Testtömeg [40; 150] (kg)", 40, 150);
        beker("Testmagasság [100; 200] (cm)", 100, 200);
    }
}
