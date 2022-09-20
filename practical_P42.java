package practicalPART4;
class kabir extends Exception
{
    public kabir(String str)
    {
        super(str);
    }
}
public class practical_P42 {




        public static void main(String[] args) {
            int a=10;
            int b=0;
            try
            {
                //  System.out.println(a/b);
                throw new kabir("this is user defined Exception");
            }
            catch(kabir k)
            {
                System.out.println(k.getMessage());
                System.out.println("Handled");
            }
            finally {
                System.out.println("Prepared by 21CE080-Kabir Navadiya");
            }
//        try  this block throws the exception(by compiler)
//        {
//            System.out.println(a/b);
//        }
//        catch(Exception e)
//        {
//            System.out.println(e);
//        }
        }


}
