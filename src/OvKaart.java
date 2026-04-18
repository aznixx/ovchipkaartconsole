import java.util.ArrayList;

public class OvKaart {
    private int kaartNummer;
    private double saldo;
    private boolean isIngecheckt;
    private Station vertrekStation;
    private ArrayList<String> history;

    public OvKaart(int kaartNummer) {
        this.kaartNummer = kaartNummer;
        this.saldo = 1000.0;
        this.isIngecheckt = false;

        this.history = new ArrayList<>();
    }

    public int getKaartNummer() {
        return kaartNummer;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean getIsIngecheckt() {
        return isIngecheckt;
    }

    public void laadOp(double bedrag, BankPas bp) {
        if (bedrag > 0 && bp.getBankSaldo() >= bedrag) {
            this.saldo += bedrag;
            bp.setSaldo(bedrag);
            System.out.println("Saldo opgeladen met €" + bedrag);
        } else {
            System.out.println("Bedrag ongeldig of bank saldo te laag!");
        }
    }

    public void toonGeschiedenis() {
        System.out.println("--- Reisgeschiedenis ---");
        if (history.size() >= 1) {
            for (int i = 0; i < history.size(); i++) {
                System.out.println((i + 1) + ". " + history.get(i));
            }
        }
    }

    public void checkIn(Station station) {
        if (saldo >= 4.00) {
            this.isIngecheckt = true;
            this.vertrekStation = station;
            System.out.println("Ingecheckt op: " + station.getStationNaam());
        } else {
            System.out.println("Onvoldoende saldo om in te checken.");
        }


    }

    public void checkUit(Station aankomstStation) {
        if (isIngecheckt) {
            this.saldo -= 4.00;
            this.isIngecheckt = false;
            this.history.add("Reis: " + vertrekStation.getStationNaam() + " -> " + aankomstStation.getStationNaam());

            this.vertrekStation = null;
        }
    }
}