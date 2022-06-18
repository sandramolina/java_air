package staff;

public class Pilot extends SuperStaff{
    private String license;

    public Pilot(String name, RankTypes rank, String license) {
        super(name, rank);
        this.license = license;
    }

    public String getLicense() {
        return  this.license;
    }

    public String PilotPlane() {
        return "Time to leave";
    }
}
