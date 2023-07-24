public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Cow ngua = new Cow();
        ngua.sound();
        ngua.eat(5);
        Duck donald = new Duck();
        donald.sound();
        Pig piglet = new Pig();
        piglet.sound();
        Owl hedwig = new Owl();
        hedwig.sound();
        
        hedwig.draw();
        piglet.draw();
        donald.draw();
        ngua.draw();

        hedwig.paint();
        piglet.paint();
        donald.paint();
        ngua.paint();
    
        donald.fly();
        hedwig.fly();

        donald.glide();
        hedwig.glide();


        donald.clean(ngua);
        donald.clean(piglet);
        donald.clean(hedwig);
        donald.clean(new Cow());

        Duck threeseasons = new PekingDuck(); 
        threeseasons.clean(new Cow());

    
        Duck daisy = new Duck();
        daisy.clean(donald); 
    }
}
