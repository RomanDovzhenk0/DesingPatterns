package strategy;

import java.util.Arrays;
import java.util.List;

public class DelicateWashing extends WashingStrategy {
   private final String[] material = {"Cotton", "Wool", "Silk"};
   private final String[] result = {" medium washed", " badly washed", " washed well"};

   public List<String> washing(List<String> list) {
      for(String i : list){
         clothesList.add(i + result[Math.abs(Arrays.binarySearch(material, i.split(" ")[0]))]);
      }
      return clothesList;
   }
}
