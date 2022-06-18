package staff;

public class CabinCrewMember extends SuperStaff{
    public CabinCrewMember(String name, RankTypes rank) {
        super(name, rank);
    }

    public String talk() {
        return "Please fasten your belts";
    }
}
