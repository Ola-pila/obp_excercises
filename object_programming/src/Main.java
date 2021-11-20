public class Main {
    public static void main(String[] args) {

        Volvo V70 = new Volvo(2000, "V70", true, 429000, "material");

        V70.startEngine();

        Vehicle vehicle = new Vehicle (2012, "Panda", false, 150000);
        vehicle.startEngine();

        Chevrolet chevrolet = new Chevrolet(2014, "Jakis", true, 186909, Drive.FWD);
        chevrolet.startEngine();

//        Car audi = new Car(0,1,"TT",true);
//
//        Car volvo = new Car();
//
//
//        audi.startEngine();
//        audi.setLights(true);
//        System.out.println(audi.getLights());
//        audi.setGear(1);
//        audi.accelerate(20);
//        audi.accelerate(20);
//        audi.slowDown(15);
//        audi.stopEngine();
//
//        System.out.println("Car is changed");
//
//        volvo.startEngine();


    }
}
