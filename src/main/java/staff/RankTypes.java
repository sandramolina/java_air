package staff;

public enum RankTypes {
    TRAINING_CAPTAIN("Training Captain"),
    CAPTAIN("Captain"),
    SENIOR_FIRST_OFFICER("Senior First Officer"),
    FIRST_OFFICER("First Officer"),
    SECOND_OFFICER("Second Officer"),
    CADET_TRAINEE("Cadet/Trainee"),
    PURSER("Purser"),
    FLIGHT_ATTENDANT("Flight attendant");

    private final String rank;

    RankTypes(String rank) {
        this.rank = rank;
    }
}
