package decorator;

public class MotionDecorator extends Decorator {
   public void shot() {
      super.shot();
      System.out.println("-using motion capture technology");
   }
   public void getInfo() {
      super.getInfo();
      System.out.println("\nEnabled: MotionCapture");
   }
}
