public class Main {
    public static void main(String[] args) {
    countDown countDown = new countDown();

    countThreaddown countThreaddown1 = new countThreaddown(countDown);
    countThreaddown1.setName("Thread 1");

    countThreaddown countThreaddown2 = new countThreaddown(countDown);
    countThreaddown2.setName("Thread 2");

    countThreaddown1.start();
    countThreaddown2.start();
    }
}

class countDown{
    private int i;
  public synchronized void doCountDown(){
      String color;
      switch (Thread.currentThread().getName()){
          case "Thread 1" :
              color=ThreadColor.ANSI_BLUE;
              break;
          case "Thread 2":
              color=ThreadColor.ANSI_RED;
              break;
          default:
              color= ThreadColor.ANSI_GREEN;
      }

      for( i=10;i>0;i--){
          System.out.println(color + Thread.currentThread().getName() + " i: " + i);  // we cant predict the Scheduling possiblity of the thread in the run method.
      }
  }


}

class countThreaddown extends Thread{
    countDown countDown = new countDown();
    public countThreaddown(countDown countDown){
        this.countDown = countDown;
    }

    public void run(){
        countDown.doCountDown();
    }

}
