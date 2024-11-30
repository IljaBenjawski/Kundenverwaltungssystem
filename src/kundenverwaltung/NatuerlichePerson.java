package kundenverwaltung;

public class NatuerlichePerson extends Personen {
        private String Geschlecht;

    public NatuerlichePerson(String name, String adresse, int anzahlBestellungen, int bisherigesBestellvolumen,String Geschlecht){
        super(name, adresse, anzahlBestellungen, bisherigesBestellvolumen);
        this.Geschlecht = Geschlecht;
    }

    public String getName(){
        return this.name;
    }

    public boolean istPremiumkunde(){
        return  anzahlBestellungen >= 10 ? true : false;
    }

    public int getAnzahlBestellungen(){
        return this.anzahlBestellungen;
    }

    public String premiumkundeJaNein(){
        return istPremiumkunde() ? "Schnellere Lieferzeit für Premiumkunden" : "Kein Premiumkunde";
    }

    public String ermitllungGeschlecht(){
        if(Geschlecht.equals("M")){
            return "Männlich";
        }else if(Geschlecht.equals("W")){
            return "Weiblich";
        }else{
            return "Divers";
        }
    }

    public void rueckgabeBestellung(int bestellungenZurueck){
        this.anzahlBestellungen = anzahlBestellungen - bestellungenZurueck;
        System.out.println("Es sind nur noch: "+anzahlBestellungen+" Bestellungen");
    }

    @Override
    public int ergaenzeBestellungen(int ergaenzung) {
        this.anzahlBestellungen += ergaenzung;
        return this.anzahlBestellungen;
    }

    @Override
    public double berechneWichtigkeit() {
        double wichtigkeit = bisherigesBestellvolumen * 0.8 + anzahlBestellungen * 0.2;
        if (istPremiumkunde()) {
            wichtigkeit *= 1.1;
        }
        return wichtigkeit;
    }

    @Override
    public String lieferePostanschrift(){
        return "Postanschrift: "+this.name+",\n"+this.adresse;
    }
}
