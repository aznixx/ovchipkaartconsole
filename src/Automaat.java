import java.util.ArrayList;
import java.util.Scanner;

public class Automaat {
    private ArrayList<Station> stations;
    private Scanner scanner;

    public Automaat() {
        this.stations = new ArrayList<>();
        this.scanner = new Scanner(System.in);

        stations.add(new Station("Utrecht Centraal", "Utrecht"));
        stations.add(new Station("Amsterdam Centraal", "Amsterdam"));
        stations.add(new Station("Eindhoven Centraal", "Eindhoven"));
        stations.add(new Station("Nijmegen Centraal", "Nijmegen"));
    }

    public OvKaart nummerGenereren() {
        int nummer = (int) (Math.random() * 900000000) + 10002000;
        return new OvKaart(nummer);
    }

    public Station kiesStation(String actie) {
        Station gekozenStation = null;

        while (gekozenStation == null) {
            System.out.println("\nBeschikbare stations voor " + actie + ":");
            for (int i = 0; i < stations.size(); i++) {
                System.out.println(i + ". " + stations.get(i));
            }
            System.out.print("Maak een keuze (nummer): ");

            int keuze = scanner.nextInt();

            if (keuze >= 0 && keuze < stations.size()) {
                gekozenStation = stations.get(keuze);
            } else {
                System.out.println("Ongeldige keuze! Kies een nummer tussen 0 en " + (stations.size() - 1));
            }
        }
        return gekozenStation;
    }
}