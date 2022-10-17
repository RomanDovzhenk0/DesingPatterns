package strategy;

import java.util.ArrayList;
import java.util.List;

public abstract class WashingStrategy {
   public List<String> clothesList = new ArrayList<>();
   public abstract List<String> washing(List<String> list);
}
