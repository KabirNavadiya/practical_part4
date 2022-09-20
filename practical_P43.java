package practicalPART4;

public class practical_P43 {
        public static void main(String[] args) {
            int []a=new int[5];
            int x=10;
            int y=0;
            try
            {
                System.out.println(x/y);
                // System.out.println(a[10]);
            }
            catch(ArrayIndexOutOfBoundsException e1)
            {
                System.out.println(e1);
                System.out.println("handled");
            }
            catch(ArithmeticException e2)
            {
                System.out.println(e2);
                System.out.println("Handled");
            }
            finally
            {
                System.out.println("prepared by 21CE080-Kabir Navadiya");
            }
        }


}
