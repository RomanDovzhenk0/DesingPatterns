package decorator;

public class Main {
   public static void main(String[] args) {
      Camera a6500 = new SonyCamera("A6500", 15000, 30);

      MotionDecorator motionDecorator = new MotionDecorator();
      motionDecorator.setCamera(a6500);

      FlashlightDecorator flashlightDecorator = new FlashlightDecorator();
      flashlightDecorator.setCamera(motionDecorator);

      NoRedEyesDecorator noRedEyesDecorator = new NoRedEyesDecorator();
      noRedEyesDecorator.setCamera(flashlightDecorator);

      AutoFocusDecorator autoFocusDecorator = new AutoFocusDecorator();
      autoFocusDecorator.setCamera(noRedEyesDecorator);

      autoFocusDecorator.getInfo();
      System.out.println();
      autoFocusDecorator.shot();
   }
}
