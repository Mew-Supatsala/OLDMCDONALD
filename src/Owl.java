public class Owl extends Animal implements Flyable, write{
     
    @Override
    void sound(){
        System.out.println("Hoot hoot!");
    }

    @Override
    public void fly() {
        System.out.println("owl fly!");
    }

    @Override
    public void glide() {
      System.out.println("owl glide!");
    }

    @Override
    public void paint() {
       System.out.println("cloud");
    }
    @Override
    public void draw() {
        System.out.println("bird");
    }
    
}
