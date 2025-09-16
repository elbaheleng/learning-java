import calculator.VeryAdvCalc;

public class inheritance {
    public static void main(String[] args) {
         VeryAdvCalc obj = new VeryAdvCalc();
         int r1 = obj.add(4,5);
         int r2 = obj.sub(5,3);
         int r3 = obj.mult(5,3);
         int r4 = obj.div(15,3);
         double r5 = obj.power(2,2);

         System.out.println("Sum :" + r1);
         System.out.println("Difference :" + r2);
         System.out.println("Product :" + r3);
         System.out.println("Quotient :" + r4);
         System.out.println("Power :" + r5);
    }
}
