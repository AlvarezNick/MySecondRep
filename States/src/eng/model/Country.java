package eng.model;

public class Country {

    private String name;
    private int numberOfCitizens;
    private String flagUrl;

    public Country(String name, int numberOfCitizens, String flagUrl) {
        this.name = name;
        this.numberOfCitizens = numberOfCitizens;
        this.flagUrl = flagUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfCitizens() {
        return numberOfCitizens;
    }

    public void setNumberOfCitizens(int numberOfCitizens) {
        this.numberOfCitizens = numberOfCitizens;
    }

    public String getFlagUrl() {
        return flagUrl;
    }

    public void setFlagUrl(String flagUrl) {
        this.flagUrl = flagUrl;
    }
}
