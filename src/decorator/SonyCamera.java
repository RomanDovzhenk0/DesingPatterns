package decorator;

public class SonyCamera extends Camera {

   public SonyCamera(String model, int memory, int mpixeles) {
      this.model = model;
      this.memory = memory;
      this.mpixeles = mpixeles;
   }

   public void shot() {
      System.out.println("The camera took a picture");
      memory = memory - 1;
   }

   public void getInfo() {
      System.out.println("This is camera - " + this.model + "\nMemory - " + this.memory + "\nMpixeles - " + this.mpixeles);
   }
}
