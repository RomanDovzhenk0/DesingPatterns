package command;

public class Main {
   public static void main(String[] args) {
      Father father = new Father();
      Mother mother = new Mother();
      Brother brother = new Brother();
      Sister sister = new Sister();

      Task tsk = new Task();
      Student std = new Student();
      std.executeYourself(tsk);
      std.setExecutor(tsk, father);
      tsk.execute();
      std.setExecutor(tsk, mother);
      tsk.execute();
      std.setExecutor(tsk, brother);
      tsk.execute();
      std.setExecutor(tsk, sister);
      tsk.execute();
   }
}
