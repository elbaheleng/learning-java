class MyException extends Exception{
    public MyException(String str){
        super(str);
    }
}
public class exceptions {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        int nums[] = new int[5];
        String str = null;

        try{
            j=18/i;
            if (j==0)
                throw new MyException("this is the exception that I defined");
           System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay within the limits of the array");
        }
        catch(MyException e)
        {
            System.out.println("Message:"+ e);
        }
        catch(Exception e)
        {
            System.out.println("Somehting went wrong..."+ e);
        }
        System.out.println(j);
    }
}
