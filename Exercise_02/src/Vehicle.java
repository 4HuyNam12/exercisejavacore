public class Vehicle {
    int id;
    String name;
    float speed;

    Vehicle(int vehicleID, String vehicleName, float vehicleSpeed) {
        id = vehicleID;
        name = vehicleName;
        speed = vehicleSpeed;
    }

    @Override
    public String toString() {
        return name + " - " + id + " - " + speed;
    }
}


