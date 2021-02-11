public class Main {
    public static void main(String[] args) {
    politePerson jane = new politePerson("Jane");
    politePerson john = new politePerson("John");

    new Thread(new Runnable() {
        @Override
        public void run() {
            jane.sayHello(john);
        }
    }).start();

    new Thread(new Runnable() {
        @Override
        public void run() {
            john.sayHello(jane);
        }
    }).start();

    }
    static class politePerson{
        private final String name;

        public politePerson(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        public synchronized void sayHello (politePerson person){
            System.out.format("%s : %s" + " has say hello to Me %n" , this.name , person.getName());
            person.sayHelloBack(this);
        }

        public synchronized void sayHelloBack(politePerson person){
            System.out.format("%s : %s" + " has say hello to Back Me!%n" , this.name , person.getName());
        }
    }
}
