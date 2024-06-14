//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Vehicle vehicleStandard = new VehicleStandard("1234", "Red");
        Vehicle vehicleDeluxe = new VehicleDeluxe("4321", "blue", 3.0);

        Driver driver = new Driver("Felipe", vehicleStandard);

        driver.howMuchForTrip(10.0);
        driver.howMuchForTrip(66.0);

        driver.setVehicle(vehicleDeluxe);
        driver.howMuchForTrip(30.0);


        Vehicle car1 = new VehicleStandard("ABC123", "Red");
        Vehicle car2 = new VehicleDeluxe("XYZ789", "Blue", 2.5);

        double distance = 30.0; // Distancia del viaje

        // Calcular el costo del viaje para cada vehículo
        double costCar1 = car1.calculateFare(distance);
        double costCar2 = car2.calculateFare(distance);

        // Comparar los costos de los viajes
        if (costCar1 < costCar2) {
            System.out.println("Car 1 is cheaper for the trip.");
        } else if (costCar1 > costCar2) {
            System.out.println("Car 2 is cheaper for the trip.");
        } else {
            System.out.println("Both cars have the same price for the trip.");
        }
    }
}