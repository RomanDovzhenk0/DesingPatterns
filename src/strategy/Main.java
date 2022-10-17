package strategy;

public class Main {
   public static void main(String[] args) {
      WashingList washingList = new WashingList();

      washingList.add("Cotton t-shirt");
      washingList.add("Silk pants");
      washingList.add("Wool pullover");

      System.out.println("Delicate mode:");
      washingList.setWashingStrategy(new DelicateWashing());
      washingList.washing();

      System.out.println();
      System.out.println("Mix mode:");
      washingList.setWashingStrategy(new MixWashing());
      washingList.washing();

      System.out.println();
      System.out.println("Extra mode:");
      washingList.setWashingStrategy(new ExtraWashing());
      washingList.washing();
   }
}
