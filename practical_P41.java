package practicalPART4;
import java.util.*;
public class practical_P41 {



        public static void main(String[] args) {
            int a=10;
            int b=0;
            try
            {
                System.out.println("hello");//before exception occured.
                System.out.println("hello world "+a/b);//the line in which exception occurs does not print anything.
                System.out.println("world");//terminated due to exception in above line so not printed.
            }
//        catch(ArithmeticException e)
//        {
//            System.out.println(e);
//            System.out.println("exception handled");
//        }
            catch (Exception E)
            {

                System.out.println(E);
                System.out.println("Exception handled by parent class");
            }
            finally
            {
                System.out.println("Finally block executed");
            }
            System.out.println("prepared by 21CE080-Kabir Navadiya");

        }


}
