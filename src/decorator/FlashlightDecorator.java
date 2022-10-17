package decorator;

public class FlashlightDecorator extends Decorator {
   public void shot() {
      super.shot();
      System.out.println("-using flashlight");
   }
   public void getInfo() {
      super.getInfo();
      System.out.println("\nEnabled: Flashlight");
   }
}
