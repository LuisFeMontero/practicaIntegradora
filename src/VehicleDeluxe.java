public class VehicleDeluxe extends Vehicle{

    private Double priceMultiplier;

    public VehicleDeluxe(String licensePlate, String color, Double priceMultiplier) {
        super(licensePlate, color);
        this.priceMultiplier = priceMultiplier;
    }

    @Override
    public Double calculateFare(Double distanceInKilometers) {
        return super.calculateFare(distanceInKilometers) * priceMultiplier;
    }
    //Multiplicar multiplier * Fare del padre

}
