public class Vehicle {
    private int dateOfProduction;
    private String model;
    private boolean aircon;
    private int milleage;

    public Vehicle (int dateOfProduction, String model, boolean aircon, int milleage){
        this.dateOfProduction = dateOfProduction;
        this.model = model;
        this.aircon = aircon;
        this.milleage = milleage;

    }
    public void startEngine(){
        System.out.println("The engine is on");
    };


    public int getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(int dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isAircon() {
        return aircon;
    }

    public void setAircon(boolean aircon) {
        this.aircon = aircon;
    }

    public int getMilleage() {
        return milleage;
    }

    public void setMilleage(int milleage) {
        this.milleage = milleage;
    }
}

