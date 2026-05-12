class TaskPing implements Runnable {
    public void run() {
        for(int i = 1; i <= 5; i++){
            System.out.println("Ping");
            try{Thread.sleep(500);} catch (Exception e) {}
        }
    }
}

class TaskPong implements Runnable {
    public void run() {
        for(int i = 1; i <= 5; i++){
            System.out.println("Pong");
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

public class Main5 {
    public static void main(String[] args){
        TaskPing ping = new TaskPing();
        TaskPong pong = new TaskPong();

        Thread t1 = new Thread(ping);
        Thread t2 = new Thread(pong);

        t1.start();
        t2.start();

        System.out.println("Main thread is finished, but the children are running!");
    }
}