public class Vehicle implements Comparable<Vehicle>{


    private static Double PRICE_PER_KILOMETER = 100.0;

    //Atributo de clase estático

    private String licensePlate;
    private String color;


    public Vehicle(String licensePlate, String color) {
        this.licensePlate = licensePlate;
        this.color = color;
    }
    public Double calculateFare(Double distanceInKilometers){
        return distanceInKilometers * PRICE_PER_KILOMETER;
    }

    @Override
    public int compareTo(Vehicle other) {
        //Comparar por PRICE_PER_KILOMETER
        return Double.compare(this.PRICE_PER_KILOMETER, other.PRICE_PER_KILOMETER);
    }
}
