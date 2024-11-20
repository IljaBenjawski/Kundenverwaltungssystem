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
        this.name = name;
        this.adresse = adresse;
        this.anzahlBestellungen = anzahlBestellungen;
        this.istPremiumkunde = istPremiumkunde;
        this.wichtigkeit = wichtigkeit;
    }

    public void setAnzahlBestellungen(int anzahlBestellungen){
        this.anzahlBestellungen = anzahlBestellungen;
    }
    public void ergaenzeBestellungen(int ergaenzung){
        this.anzahlBestellungen = anzahlBestellungen + ergaenzung;

        // bestellVolumen fehlt noch
    }



}
