import testclass.MotorBike;
public class MotorBikeRunner {

    public static void main(String[] args){
        MotorBike honda = new MotorBike();
        honda.starting();

        honda.speed = 50;
        System.out.println(honda.speed);
    }
}
