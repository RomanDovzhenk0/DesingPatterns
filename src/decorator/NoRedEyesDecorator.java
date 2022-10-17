package decorator;

public class NoRedEyesDecorator extends Decorator {
   public void shot() {
      super.shot();
      System.out.println("-using no red eyes technology");
   }
   public void getInfo() {
      super.getInfo();
      System.out.println("\nEnabled: Red-Eye Remover");
   }
}
