public class calculator {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 4;
        int result;
        add obj = new add();
        result = obj.sum(num1,num2);
        System.out.println(result);
    }
}

class add {
    int sum(int n1,int n2){
        int r = n1 + n2;
        return r;
    }
}
