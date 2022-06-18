package staff;

public class SuperStaff {
    private String name;
    private RankTypes rank;

    public SuperStaff(String name, RankTypes rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return this.name;
    }

    public RankTypes getRank() {
        return this.rank;
    }
}
