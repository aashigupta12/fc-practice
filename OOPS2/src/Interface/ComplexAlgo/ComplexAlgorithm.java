package Interface.ComplexAlgo;



interface ComplexAlgorithm {
    int complexAlgorithm(int number1, int number2);
}

class DummyAlgorithm implements ComplexAlgorithm{

    @Override
    public int complexAlgorithm(int number1, int number2) {
        return number1 + number2;
    }
}

class RealAlgorithm implements ComplexAlgorithm{
    @Override
    public int complexAlgorithm(int number1, int number2) {
        return number1 * number2;
    }
}

class Project {
    public static void main(String[] args) {

        //cannot create obj of interface, since there are no constructor in interface
        //can only create references
        ComplexAlgorithm algo = new RealAlgorithm(); //29
//        ComplexAlgorithm algo = new DummyAlgorithm(); //30
        System.out.println(algo.complexAlgorithm(1,29));


    }
}
