package zad1;

public class Lampa {

    boolean czySwieci;

    public boolean wlacz() {
        return czySwieci=true;
    }

    public boolean wylacz() {
        return czySwieci=false;
    }

    public void wypisz() {
        if ( czySwieci == true) {
            System.out.println("swieci");
        }
        else {
            System.out.println("nie swieci");
        }

    }



}
