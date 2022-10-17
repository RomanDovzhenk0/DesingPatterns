package command;

public class Student {
   public void setExecutor(Task task, Executor executor) {
      task.executor = executor;
   }
   public void executeYourself(Task task) {
      System.out.println("Student has done task himself for 7 points");
      task.execute();
   }
}
