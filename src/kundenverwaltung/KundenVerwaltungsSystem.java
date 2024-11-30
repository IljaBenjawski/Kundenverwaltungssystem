package kundenverwaltung;
import java.util.ArrayList;

public class KundenVerwaltungsSystem {
    public static void main(String[] args){

        ArrayList<Personen> kunden = new ArrayList<>();
        kunden.add(new NatuerlichePerson("Max Mustermann", "Musterstraße 1, 12345 Musterstadt", 10,   2500, "M"));
        kunden.add(new NatuerlichePerson("Anna Schmidt", "Hauptstraße 3, 54321 Beispielstadt", 5,  1000, "W"));
        kunden.add(new NatuerlichePerson("John Doe", "Beispielweg 2, 98765 Teststadt", 15,   4500, "M"));
        kunden.add(new NatuerlichePerson("Lisa Müller", "Bergstraße 7, 67890 Bergstadt", 8,    3000, "W"));
        kunden.add(new NatuerlichePerson("Maria Garcia", "Elmstraße 5, 23456 Eichenstadt", 4,   700, "W"));

        kunden.add(new JuristischePerson("Tech AG", "Technologiepark 7, 54321 Techstadt", 20,   "AG",  15000));
        kunden.add(new JuristischePerson("Handels GmbH", "Industriestraße 5, 11111 Handelsstadt", 15,  "GmbH",  8000));
        kunden.add(new JuristischePerson("Innovations KG.", "Forschungsweg 3, 22334 Innovationsstadt", 25,  "KG",  20000));
        kunden.add(new JuristischePerson("Global Corporation", "Weltstraße 10, 87654 Globalstadt", 30,  "AG",  12000));
        kunden.add(new JuristischePerson("Digital Solutions GmbH", "Digitalstraße 8, 98765 Digicity", 18,  "GmbH",  9500));


        kunden.sort((k1, k2) -> Double.compare(k2.berechneWichtigkeit(), k1.berechneWichtigkeit()));
        System.out.println("****Top 10 Liste****\n");
        for(Personen kunde : kunden){
            if(kunde instanceof NatuerlichePerson){
                if(((NatuerlichePerson) kunde).getName().equals("Lisa Müller")){
                    kunde.ergaenzeBestellungen(10);
                }

                System.out.println(kunde.lieferePostanschrift());
                System.out.println("Geschlecht: "+ ((NatuerlichePerson) kunde).ermitllungGeschlecht());
                if(((NatuerlichePerson) kunde).getName().equals("John Doe")){
                    ((NatuerlichePerson) kunde).rueckgabeBestellung(4);
                }
                System.out.println(((NatuerlichePerson) kunde).premiumkundeJaNein());
                System.out.println("Anzahl der Bestellungen: "+ ((NatuerlichePerson) kunde).getAnzahlBestellungen());
                System.out.println("Wichtigkeit: "+kunde.berechneWichtigkeit()+"\n");
            }
            else if (kunde instanceof JuristischePerson) {
                if(((JuristischePerson) kunde).getName().equals("Tech AG")){
                    kunde.ergaenzeBestellungen(5);
                }
                System.out.println(kunde.lieferePostanschrift());
                System.out.println(((JuristischePerson) kunde).premiumkundeJaNein());
                if (((JuristischePerson) kunde).getName().equals("Digital Solutions GmbH")){
                    ((JuristischePerson) kunde).rueckgabeBestellung();
                }
                System.out.println(((JuristischePerson) kunde).istKapitalgesellschaft());
                System.out.println("Anzahl der Bestellungen: "+((JuristischePerson) kunde).getAnzahlDerBestellungen());
                System.out.println("Wichtigkeit: "+kunde.berechneWichtigkeit()+ "\n");
            }
        }


    }

}
