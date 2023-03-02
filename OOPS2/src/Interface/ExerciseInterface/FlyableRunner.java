package Interface.ExerciseInterface;


interface Flyable{
 void fly();
}

class Bird implements Flyable{

    @Override
    public void fly() {
        System.out.println("with wings");
    }
}
class Aeroplane implements Flyable{

    @Override
    public void fly() {
        System.out.println("with fuel");
    }
}
public class FlyableRunner {
    public static void main(String[] args) {
        Flyable[] flyingObjects = {new Aeroplane(), new Bird()};
        for(Flyable object : flyingObjects){
            object.fly();
        }
    }
}
