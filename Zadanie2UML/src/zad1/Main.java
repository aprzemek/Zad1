package zad1;

public class Main {
    public static void main(String[] args) {

        Lampa l1 = new Lampa();
        Lampa l2 = new Lampa();

        l1.wlacz();
        System.out.println("lampa l1: ");
        l1.wypisz();

        l2.wlacz();
        System.out.println("lampa l2: ");
        l2.wypisz();
        l2.wylacz();
        System.out.println("lampa l2: ");
        l2.wypisz();

    }



}
