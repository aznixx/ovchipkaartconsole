public class BankPas {
    private int PasNummer;
    private double BankSaldo;

    public BankPas() {
        this.PasNummer = (int) (Math.random() * 9000) + 1000;
        this.BankSaldo = 200.0;
    }

    public BankPas(double beginSaldo) {
        this.PasNummer = (int) (Math.random() * 9000) + 1000;
        this.BankSaldo = beginSaldo;
    }

    public double getBankSaldo() {
        return BankSaldo;
    }

    public void setSaldo(double bedrag) {
        this.BankSaldo -= bedrag;
    }
}
