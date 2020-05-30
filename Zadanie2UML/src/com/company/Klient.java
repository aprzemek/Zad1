package com.company;

import java.util.ArrayList;
import java.util.List;

public class Klient {

    List<SystemSprzedazy.Transakcje> Transakcje = new ArrayList<SystemSprzedazy.Transakcje>();
    List<SystemSprzedazy> SystemSprzedazy = new ArrayList<SystemSprzedazy>();

    public int IDKlienta;
    public String Klient;
    public String miasto;
    public int numerKomorki;

    public Klient(int IDKlienta, String Klient, String miasto, int numerKomorki) {
        this.IDKlienta = IDKlienta;
        this.Klient = Klient;
        this.miasto = miasto;
        this.numerKomorki = numerKomorki;
    }


    public Klient() {
    }

    public void informujOSukcesieLubPorazce(){
        System.out.println("sukces");

    }

}
