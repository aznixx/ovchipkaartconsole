public class Station {
    private String stationNaam;
    private String stad;

    public Station(String stationNaam, String stad) {
        this.stationNaam = stationNaam;
        this.stad = stad;

    }

    public String getStationNaam() {
        return stationNaam;
    }

    public String getStad() {
        return stad;
    }

    public String toString() {
        return stationNaam + " (" + stad + ")";
    }


}