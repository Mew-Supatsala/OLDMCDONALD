public class Owl extends Animal implements Flyable{
     
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
    
}
