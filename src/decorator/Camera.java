package decorator;

public abstract class Camera {
   protected String model;
   protected int memory;
   protected int mpixeles;

   public abstract void shot();
   public abstract void getInfo();
}
