public class MotorBikeRunner {
    public static void main(String[] args) {
        //by adding args in obj , we are constructing an object
        MotorBike ducati = new MotorBike(900);
        MotorBike honda = new MotorBike(200);
        MotorBike somethingElse  = new MotorBike();


        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());
        System.out.println(somethingElse.getSpeed());

        ducati.start();
        honda.start();

//        ducati.setSpeed(100);

        ducati.increaseSpeed(100);
        honda.increaseSpeed(100);

        ducati.decreaseSpeed(10);
        honda.decreaseSpeed(50);

//        int ducatiSpeed = ducati.getSpeed(); //get speed
//        ducatiSpeed += 100;//increase it by 100
//        ducati.setSpeed(ducatiSpeed);//set it to ducati
//
//        int hondaSpeed = honda.getSpeed(); //get speed
//        hondaSpeed += 100;//increase it by 100
//        honda.setSpeed(hondaSpeed);


        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());
    }
}
