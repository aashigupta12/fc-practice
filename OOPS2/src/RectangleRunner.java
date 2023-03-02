public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(2 , 8);

        System.out.println(rect);

        System.out.println(rect.area());
        System.out.println(rect.perimeter());

        rect.setLength(10);
        rect.setBreadth(20);

        System.out.println(rect.area());
        System.out.println(rect.perimeter());

    }
}
