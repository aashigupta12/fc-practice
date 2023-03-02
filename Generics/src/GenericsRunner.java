public class GenericsRunner {

    static <X> X doubleValue(X value){
        return value;
    }
    public static void main(String[] args) {

        doubleValue(new String());
        doubleValue(Integer.valueOf(6));


        MyCustomList<String> list1 = new MyCustomList<>();
        list1.addElement("element1");
        list1.addElement("element2");

        String value = list1.get(0);
        System.out.println(value);

        System.out.println(list1);

        MyCustomList<Integer> list2 = new MyCustomList<>();
        list2.addElement(Integer.valueOf(5));
        list2.addElement(Integer.valueOf(6));

        Integer number = list2.get(0);
        System.out.println(number);

        System.out.println(list2);

    }
}
