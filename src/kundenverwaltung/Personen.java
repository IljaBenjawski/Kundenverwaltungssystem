package kundenverwaltung;

public abstract class Personen {

    final String name;
    final String adresse;
    protected int anzahlBestellungen;
    protected int bisherigesBestellvolumen;

    public Personen( String name, String adresse, int anzahlBestellungen, int bisherigesBestellvolumen){
        this.name = name;
        this.adresse = adresse;
        this.anzahlBestellungen = anzahlBestellungen;
        this.bisherigesBestellvolumen = bisherigesBestellvolumen;
    }

    public abstract int ergaenzeBestellungen(int ergaenzung);
    public abstract double berechneWichtigkeit();
    public abstract String lieferePostanschrift();

}
