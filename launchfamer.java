package Static;
import java.util.Scanner;
class farmer 
{
    int pa ;
    float si;
    float td;
    static float ri;

    void input()
     {   
       Scanner scan = new Scanner(System.in);
        System.out.println("please enter the amount");
        pa= scan.nextInt();
        System.out.println("please enter the time duration ");
        td= scan.nextFloat();
      
      
        scan.close();}
      
    static

      {
        ri=4.5f;
      }

    void compute()
     {
        si=pa*td*ri/100f;
     }   

    void disp()
     {
        System.out.println("si is :"+ si);

     }
}
public class launchfamer
   {
       public static void main(String arg[])
       {
             farmer f1=new farmer();
            farmer f2 = new farmer();
            f1.input();
            f1.compute();
            f1.disp();


             f2.input();
             f2.compute();
             f2.disp();
        }

    }
