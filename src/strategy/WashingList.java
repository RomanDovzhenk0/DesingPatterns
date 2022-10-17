package strategy;

import java.util.ArrayList;
import java.util.List;

public class WashingList {
   private WashingStrategy washingStrategy;
   private List<String> list = new ArrayList<>();

   public void setWashingStrategy(WashingStrategy washingStrategy) {
      this.washingStrategy = washingStrategy;
   }

   public void add(String clothes) {
      list.add(clothes);
   }

   public void washing() {
      List<String> washedlist = washingStrategy.washing(list);
      System.out.println("---All clothes have been washed---");
      for(String i : washedlist) {
         System.out.println(i);
      }
   }
}
