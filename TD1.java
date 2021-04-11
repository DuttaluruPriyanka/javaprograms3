class T1 extends Thread
{
public void run()
{
int i=1;
while(i<=10)
{
System.out.println("Thread");
{
try{
Thread.sleep(1000);
}
catch(InterruptedException e)
{}
}
i++;
}
}
}
class R1 implements Runnable
{
public void run()

{
int i=1;
while(i<=10)
{
System.out.println("Runnable");
{
try{
Thread.sleep(1000);
}
catch(InterruptedException e)
{}
}
i++;
}
}
}
class TD1
{
public static void main(String a[])
{
T1 t1=new T1();
t1.start();
R1 r1=new R1();
Thread t2=new Thread(r1);
t2.start();
}
}
