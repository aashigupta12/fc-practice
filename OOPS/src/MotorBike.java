public class MotorBike {
    //state
    private int speed; //member variable

    MotorBike(){
//        this.speed = 6;
        //by this we called paramterised constrcutor into default one
        this(6);
    }
    //constructor
    MotorBike(int speed){
        this.speed = speed;
    }
    //behaviour
    //method
    //inputs - int speed
    //outputs - void
    //name - setSpeed

    //wrote getter setter method manually
//    void setSpeed(int speed){ //local variable
//        this.speed = speed;
//    }
//
//    int getSpeed(){
//        return this.speed;
//    }

//generate getter setter method using intellij
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed > 0)
        this.speed = speed;
    }

    public void increaseSpeed(int howMuch){
        setSpeed(this.speed + howMuch);
    }
    public void decreaseSpeed(int howMuch){
        setSpeed(this.speed - howMuch);
    }

    void start(){
        System.out.println("Bike started");
    }
}
