public class FanRunner {
    public static void main(String[] args) {

        Fan fan = new Fan("Manufacturer1", 0.345, "Green");

        fan.switchOn();
        fan.setSpeed((byte) 4);
        System.out.println(fan);

        fan.switchOff();
//        fan.setSpeed((byte) 0); //no need to write it 0,
//        we already added the feature in method is fan class
        System.out.println(fan);
    }
}
