package kundenverwaltung;

public class Personen {

    // public boolean istJurPerson;
    public String name;
    public String adresse;
    // bei Jur public boolean istKapitalgesellschaft;
    public int anzahlBestellungen;
    public boolean istPremiumkunde;
    public int wichtigkeit;


    public Personen( String name, String adresse, int anzahlBestellungen, boolean istPremiumkunde, int wichtigkeit ){

    }
    public int getAnzahlBestellungen(){
        return this.anzahlBestellungen;
    }
    public void setAnzahlBestellungen(int anzahlBestellungen){
        this.anzahlBestellungen = anzahlBestellungen;
    }
    public int ergaenzeBestellungen(int ergaenzung){
       int bestellunsvolumen =getAnzahlBestellungen() + ergaenzung;
        return bestellunsvolumen;
        // bestellVolumen fehlt noch
    }



}
