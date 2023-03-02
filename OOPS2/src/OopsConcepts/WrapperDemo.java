package OopsConcepts;


//int, float, double
//Integer
public class WrapperDemo {
    public static void main(String[] args) {
        //primitive - i
        int i = 5; //primitive datatype
        //reference - ii (since, Integer is a class)
//                  <WrapperType>.valueOf(<primitiveType>)


        //putting val in obj - boxing
        Integer ii = Integer.valueOf(i);//Boxing Or Wrapping //Wrapper class

        //fetching value from obj - unboxing, unwrapping
        int j = ii.intValue(); //unboxing

        Integer value = i; //autoboxing
        int k = value; //autounboxing


        String str = "123";
        int n = Integer.parseInt(str);
        System.out.println(n);


    }
}
