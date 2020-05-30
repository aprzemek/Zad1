package com.company;

public class Main {

    public static void main(String[] args) {


        Klient k1 = new Klient(1,"Przemysław","Gdańsk",790500500);
        k1.informujOSukcesieLubPorazce();
        
        SystemSprzedazy ss1= new SystemSprzedazy("Oferta nr 1");
        ss1.ObslugaTransakcji();
        ss1.OdnotowanieZaplaty();


        SystemSprzedazy.Transakcje t1 = new SystemSprzedazy.Transakcje(1,1,100,"Przemysław", "Monitor LCD");
        t1.odnotowanieZaplaty();
        t1.rejestracjaTransakcji();

        SystemRozliczen.Platnosci p1 = new SystemRozliczen.Platnosci("1 s",1,1,100);
        p1.dodajPlatnosc();
        p1.Zestawienie();

        SystemRozliczen sr1 = new SystemRozliczen("system 1","rejestr 1");
        sr1.OdnotowanieZaplaty();
        sr1.PrzyjecieSMS();
        sr1.PotwierdzenieDoSystemuSprzedazy();
        sr1.SMSzPotwierdzeniem();

    }
}
