package com.company;

import java.util.ArrayList;
import java.util.List;

public class SystemSprzedazy {

    List<Klient> Klientx = new ArrayList<Klient>();

    public SystemSprzedazy(String oferta) {
        this.oferta = oferta;
    }


    public String oferta;

    public void ObslugaTransakcji(){
        System.out.println("Obsługa Transakcji");
    };
    public void OdnotowanieZaplaty(){
        System.out.println("Odnotowoano zapłate");

    };

    public static class Transakcje extends Klient{

        List<SystemRozliczen.Platnosci> Platnosci2 = new ArrayList<SystemRozliczen.Platnosci>();


        public Transakcje(int IDTransakcji, int IDPlatnosci, double kwotaTransakcji, String Klient, String szcegolyTransakcji) {
            this.IDTransakcji = IDTransakcji;
            this.IDPlatnosci = IDPlatnosci;
            KwotaTransakcji = kwotaTransakcji;
            this.Klient = Klient;
            SzcegolyTransakcji = szcegolyTransakcji;
        }



        public int IDTransakcji;
        public int IDPlatnosci;
        public double KwotaTransakcji;
        public String SzcegolyTransakcji;



        public void rejestracjaTransakcji(){
            System.out.println("Zarejestrowanie transakcji");
        };
        public void odnotowanieZaplaty(){
            System.out.println("odnotowanie zapłaty");
        };



    }
}
