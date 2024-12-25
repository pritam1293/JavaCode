public class Car {
    private  String make = "Honda";
    private String model = "SUV";
    private String color = "red";
    private String doors = "4";
    private boolean convertible = true;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void describeCar() {
        System.out.println("The brand is "+make+" and the model name is "
        +model+" and it has "+doors+" doors.");


    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setMake(String make) {
        if(make == null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake) {
            case "holden" , "porsche" , "tesla" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
//        this.make = make;
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("tesla");
        car.setModel("A9");
        car.setColor("white");
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();
    }
}
