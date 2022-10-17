package decorator;

public abstract class Decorator extends Camera {
   protected Camera camera;

   public void setCamera(Camera camera) {
      this.camera = camera;
   }
   public void getInfo() {
      if (camera != null)
         camera.getInfo();
   }
   public void shot() {
      if (camera != null)
         camera.shot();
   }
}
