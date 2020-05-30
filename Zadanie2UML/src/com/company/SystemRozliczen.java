package com.company;

import java.util.ArrayList;
import java.util.List;

public class SystemRozliczen {


    public SystemRozliczen(String informacjeOSystemachSpredazy, String rejestPlatnosci) {
        this.informacjeOSystemachSpredazy = informacjeOSystemachSpredazy;
        this.rejestPlatnosci = rejestPlatnosci;
    }


    private  Klient Klient;

    public SystemRozliczen(Klient Klient) {
        this.Klient = Klient;
    }


    Platnosci p1 = new Platnosci("2s",2,3,4);
    public String informacjeOSystemachSpredazy;
    public String rejestPlatnosci;

    public void PrzyjecieSMS(){
        System.out.println("SMS przyjety");

    }
    public void OdnotowanieZaplaty(){
        System.out.println("odnotowano zapłate");
    }

    public void PotwierdzenieDoSystemuSprzedazy(){
        System.out.println("Potwierdzenie do systemu sprzedazy");
    }
    public void SMSzPotwierdzeniem(){
        System.out.println("SMS z potwierdzeniem");
    }





  public static class Platnosci {

      List<SystemSprzedazy.Transakcje> Transakcje = new ArrayList<SystemSprzedazy.Transakcje>();


      public Platnosci(String czasSMS, int numer, int IDplatnosci, double kwota) {
            this.czasSMS = czasSMS;
            this.numer = numer;
            this.IDplatnosci = IDplatnosci;
            this.kwota = kwota;
        }

        public String czasSMS;
        public int numer;
        public int IDplatnosci;
        public double kwota;

        public void dodajPlatnosc(){
            System.out.println("dodano platnosc");
        }

        public void Zestawienie(){
            System.out.println("Zestawienie");
        }


    }
}

