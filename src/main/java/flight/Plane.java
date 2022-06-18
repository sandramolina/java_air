package flight;

public class Plane {
    private String planeName;
    private int capacity;
    private double  weight;

    public Plane(PlaneTypes planeTypes){
        this.planeName = planeTypes.getPlaneName();
        this.capacity = planeTypes.getCapacity();
        this.weight= planeTypes.getWeight();
    }

    public String getPlaneName() {
        return this.planeName;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public double getWeight() {
        return this.weight;
    }
}
