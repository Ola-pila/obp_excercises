public class Volvo extends Vehicle{

    private String typeOfSeats;

    public Volvo (int dateOfProduction, String model, boolean aircon, int milleage, String typeOfSeats){
        super(dateOfProduction ,model ,aircon,milleage);
        this.typeOfSeats = typeOfSeats;
    }

    @Override
    public void startEngine(){
        System.out.println("Volvo enige is on");
    };


}
