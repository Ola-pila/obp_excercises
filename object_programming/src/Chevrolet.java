public class Chevrolet extends Vehicle{

//    public String drive;
    public Drive drive;
    public Chevrolet(int dateOfproduction, String model, boolean aircon, int milleage , Drive drive){
        super(dateOfproduction,model,aircon,milleage);
        this.drive=drive;
    }

}
