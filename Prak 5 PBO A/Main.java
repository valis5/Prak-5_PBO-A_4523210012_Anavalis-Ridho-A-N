public class Main {
    public static void main(String[] args) {
    
        Spider spider = new Spider();
        spider.eat();

    
        Dog meli = new Dog();
        meli.setName("Meli");
        System.out.println("Name dog: " + meli.getName());
        meli.play();
        meli.eat();
        meli.walk();

        // Buat objek garfill dan set namanya
        Cat garfill = new Cat("garfill");
        System.out.println("Name cat: " + garfill.getName());
        garfill.play();
        garfill.eat();
        garfill.walk();
    }
}
