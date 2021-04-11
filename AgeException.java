class AgeException
{
 public static void main(String arg[])
 {
try
{
int age=Integer.parseInt(arg[0]);
if(age<18)
throw new ArithmeticException("Invalid Age Exception");
  else
    System.out.println("Valid Age Exception");
  }
    catch(Exception e)  {
  System.out.println(e);
}
 System.out.println("Normal Flow");
}
}