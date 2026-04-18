public class Reiziger {
    private String naam;
    private OvKaart kaart;

    public Reiziger(String naam) {
        this.naam = naam;
    }

    public void setKaart(OvKaart kaart) {
        this.kaart = kaart;
    }

    public OvKaart getKaart() {
        return kaart;
    }

    public String getNaam() {
        return naam;
    }


}