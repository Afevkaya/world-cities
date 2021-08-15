
public class City {
    private int id;
    private String name;
    private String countryCode;
    private String distirct;
    private int population;

    public City(int id, String name, String countryCode, String distirct, int population) {
        this.id = id;
        this.name = name;
        this.countryCode = countryCode;
        this.distirct = distirct;
        this.population = population;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDistirct() {
        return distirct;
    }

    public void setDistirct(String distirct) {
        this.distirct = distirct;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
