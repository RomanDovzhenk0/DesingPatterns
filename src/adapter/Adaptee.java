package adapter;

public class Adaptee implements Target {
   public String getLink() {
      return "localhost:8080";
   }
}
