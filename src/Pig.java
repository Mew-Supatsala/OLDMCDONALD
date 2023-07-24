public class Pig extends Animal implements write {

    @Override
    void sound() {
       System.out.println("Oink oink!");
    }

    void turn(){
        System.out.println("");
    }

    @Override
    public void paint() {
        System.out.println("paper");
    }

    @Override
    public void draw() {
        System.out.println("tiger");
    }
       
    
}
