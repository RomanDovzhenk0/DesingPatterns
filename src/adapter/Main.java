package adapter;

public class Main {
   public static void main(String[] args) {
      Adaptee adaptee = new Adaptee();
      System.out.println("UnsupportedLink: " + adaptee.getLink());

      Adapter adapter = new Adapter(adaptee);
      System.out.println("CorrectLink: " + adapter.getLink());
   }
}
