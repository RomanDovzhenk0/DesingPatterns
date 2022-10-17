package strategy;

import java.util.Arrays;
import java.util.List;

public class MixWashing extends WashingStrategy {
   private final String[] material = {"Cotton", "Wool", "Silk"};
   private final String[] result = {" medium washed", " medium washed", " medium washed"};

   public List<String> washing(List<String> list) {
      for(String i : list){
         clothesList.add(i + result[Math.abs(Arrays.binarySearch(material, i.split(" ")[0]))]);
      }
      return clothesList;
   }
}
