package command;

public class Task {
   protected Executor executor;

   public void setExecutor(Executor executor) {
      this.executor = executor;
   }

   public int execute() {
      if(executor != null) {
         return executor.doHomeTask();
      } else {
         return 7;
      }
   }
}
