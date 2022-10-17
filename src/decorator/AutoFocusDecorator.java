package decorator;

public class AutoFocusDecorator extends Decorator {
   public void shot() {
      super.shot();
      System.out.println("-using auto focus technology");
   }
   public void getInfo() {
      super.getInfo();
      System.out.println("\nEnabled: Auto Focus");
   }
}
