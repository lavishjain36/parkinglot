public abstract class Vehicle {
    public String vehicleType;
    public String color;
    public String regNumber;

    public Vehicle(){

    }

    public Vehicle(String regNumber, String color){
        this.color = color;
        this.regNumber = regNumber;
    }

}
