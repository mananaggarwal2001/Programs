public class ThreadClass extends Thread {

    public ThreadClass( String Threadname) {
        super(Threadname);
        System.out.println("Child Thread Name : " + Threadname);
    }
      public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("Child Thread No is :" + i);
                Thread.sleep(1000);
            }

        } catch (InterruptedException e){
            System.out.println("Child thread intrrupted");
        }
    }
}
