package kundenverwaltung;

import org.w3c.dom.ls.LSOutput;

public class KundenVerwaltungsSystem {
    public static void main(String[] args){
        Personen JurPerson1 = new Personen("adidie","hausmann Straße 34",
                50, false, 10 );
        JurPerson1.ergaenzeBestellungen(5);

        System.out.println(JurPerson1.anzahlBestellungen);
        System.out.println(JurPerson1.ergaenzeBestellungen(5)+"wichtig");
        JurPerson1.setAnzahlBestellungen(50);
        JurPerson1.getAnzahlBestellungen();
        System.out.println(JurPerson1.getAnzahlBestellungen());
        System.out.println(JurPerson1.ergaenzeBestellungen(5)+"wichtig");
    }


}
