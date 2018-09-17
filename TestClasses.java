public class TestClasses {
    public static void main(String [] args){

        //Объект класса Circle
        Circle circle1 = new Circle();
        System.out.println(circle1.toString());

        circle1.SetColor("Blue");
        System.out.println("Set new color");
        System.out.println(circle1.GetColor());

        circle1.SetDiameter(30);
        System.out.println("Set new diameter");
        System.out.println(circle1.GetDiameter());

        //Объект класса Book
        Book book1 = new Book("Florea","My life");

        System.out.println(book1.toString());

        book1.SetPostDate("2008");
        System.out.println("Set post date");
        System.out.println(book1.GetPostDate());

    }
}
