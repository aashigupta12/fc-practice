public class AnotherThread extends Thread{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
