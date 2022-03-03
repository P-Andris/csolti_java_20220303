package Metodus;

public class Metodus1 {
    static void valami() {
        System.out.println("Valamit csináltam.");
        valami2();
    }

    static void valami2() {
        System.out.println("Valami mást csináltam.");
    }
    
    public static void main(String[] args) {
        valami();
    }
}
