package kundenverwaltung;

public class JuristischePerson extends Personen {
    private String Rechtsform;

    public JuristischePerson(String name, String adresse, int anzahlBestellungen, String Rechtsform, int bisherigesBestellvolumen) {
        super(name, adresse, anzahlBestellungen, bisherigesBestellvolumen);
        this.Rechtsform = Rechtsform;
    }

    public String getName(){
        return this.name;
    }

    public int getAnzahlDerBestellungen(){
        return anzahlBestellungen;
    }

    public boolean istPremiumkunde(){
      return anzahlBestellungen >= 10 && (Rechtsform.equals("KG") || Rechtsform.equals("Kapitalgeselschaft"));

    }

    public String premiumkundeJaNein( ){
        if(istPremiumkunde()){
            return  "Premiumkunde";
        }else{
            return "Kein Premiumkunde";
        }
    }


    public String istKapitalgesellschaft(){
        if(Rechtsform.equals("KG") || Rechtsform.equals("Kapitalgesellschaft")){
            return "Ist eine Kapitalgesellschaft";
        }else

        {return "Ist keine Kapitalgesellschaft";}
    }

    public void rueckgabeBestellung(){
        System.out.println("Die Bestellung kann nicht zurückgegeben werden");

    }

    @Override
    public double berechneWichtigkeit() {
        double wichtigkeit = bisherigesBestellvolumen + anzahlBestellungen;
        if (istPremiumkunde()) {
            wichtigkeit *= 1.1;
        }
        return wichtigkeit;
    }

    @Override
    public String lieferePostanschrift(){
       return "Postanschrift: "+this.name+",\n"+this.adresse;
    }

    @Override
    public int ergaenzeBestellungen(int ergaenzung) {
        this.anzahlBestellungen += ergaenzung;
        return this.anzahlBestellungen;
    }


}
