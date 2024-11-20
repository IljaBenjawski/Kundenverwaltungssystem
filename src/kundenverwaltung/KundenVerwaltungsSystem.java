package kundenverwaltung;



public class KundenVerwaltungsSystem {
    public static void main(String[] args){
        Personen JurPerson1 = new Personen("adidie","hausmann Straße 34",
                50, false, 10 );
        JurPerson1.ergaenzeBestellungen(5);


        System.out.println(JurPerson1.anzahlBestellungen);
    }


}
