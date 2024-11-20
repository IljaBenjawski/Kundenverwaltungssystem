package kundenverwaltung;


public class JuristischePerson extends Personen {
    public String Rechtsform;
    public JuristischePerson(String name, String adresse, int anzahlBestellungen, boolean istPremiumkunde, int wichtigkeit,
                             String Rechtsform) {
        super(name, adresse, anzahlBestellungen, istPremiumkunde, wichtigkeit);
    }
}
