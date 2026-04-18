public class BankPas {
    private int PasNummer;
    private double BankSaldo;

    public BankPas() {
        this.PasNummer = (int) (Math.random() * 9000) + 1000; // Genereer een random pasnummer
        this.BankSaldo = 200.0;
    }

    public double  getBankSaldo() {
        return BankSaldo;
    }

    public void setSaldo (double bedrag) {
        this.BankSaldo -= bedrag;
    }
}
