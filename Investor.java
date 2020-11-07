
public class Investor {

    private String id;
    private String name;
    private Integer netWorth;

    public Investor() {

    }

    public Investor(String id, String name, Integer netWorth) {
        this.id = id;
        this.name = name;
        this.netWorth = netWorth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(Integer netWorth) {
        this.netWorth = netWorth;
    }

}
