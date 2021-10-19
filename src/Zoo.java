public class Zoo {
    public static void main(String[] args) {
        /* First Tester
        Animal animal1 = new Animal(2,'F',120);
        animal1.eat();
        animal1.sleep();
        animal1.eat();
        */
        /*Second tester
        Bird aBird = new Bird(2,'F',3);
        Fish aFish = new Fish(17,'M',6);

        aBird.fly();
        aBird.eat();
        aFish.swim();
        aFish.eat();
        */
        Chicken aChicken = new Chicken(2,'M',2);
        Sparrow aSparrow = new Sparrow(1,'F',1);

        Fish aFish = new Fish(2,'M',2);
        Bird aBird = new Bird(1,'F',1);

        Animal sparrow1 = new Sparrow(1,'F',2);
        sparrow1.move();

        aChicken.fly();
        aSparrow.fly();

        aFish.move();
        aBird.move();
    }
}
