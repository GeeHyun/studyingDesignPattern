import Sam.SamFactory;
import abst.BikeFactory;

public class Main {
    public static void main(String[] args) {
        BikeFactory factory = new SamFactory();
        
        Body body = factory.createBody();
        Wheel wheel = factory.createWheel();
    }
}