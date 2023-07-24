public class Duck extends Animal implements Flyable, write{
    @Override
    void sound(){
        System.out.println("Quack quack!");
    }

    public void fly(){
         System.out.println("duck fly!");
    }

    public void glide(){
        System.out.println("duck glide!");
    }

    protected void clean(Animal animal){
       System.out.println(this.toString()+ "is being cleand."+animal.toString() );
    }

    @Override
    public void paint() {
        System.out.println("chicken");
    }

    @Override
    public void draw() {
       System.out.println("tree");
    }

   
    
    

}
