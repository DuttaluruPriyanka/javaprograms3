public class Test2 implements Runnable  {

public static void main(String[] args) {

    final Test2 testThr = new Test2();

    for(int i =1; i<=10; i++){
        Thread t1=new Thread(testThr);
        t1.start();
    }

}
public void run() {
    for(int i=1; 1<=10; i++) {
        sync(i);
    }
}

public synchronized void sync(int num){
    for (int i=1;i<=10;i++){
        System.out.println(i + "X" + num + ": "  +i*num  +Thread.currentThread().getName());
        try{
            Thread.sleep(500);
        }catch (Exception e) {}
    }
}
}