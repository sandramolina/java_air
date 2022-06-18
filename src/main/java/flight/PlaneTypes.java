package flight;

public enum PlaneTypes {
    ABA350("Airbus A350", 350, 248.9),
    BOE747("Boeing 747", 524, 183.5),
    BOE222("Boeing 222", 2, 50.5);

    private String planeName;
    private int capacity;
    private double  weight;

    PlaneTypes(String planeName, int capacity, double weight) {
        this.planeName = planeName;
        this.capacity = capacity;
        this.weight = weight;
    }

    public String getPlaneName() {
        return planeName;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public double getWeight() {
        return this.weight;
    }
}
