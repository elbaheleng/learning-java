class Laptop{
    int price;
    String model;
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + price;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (price != other.price)
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Laptop [price=" + price + ", model=" + model + "]";
    }
}
public class objectclass {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.price = 1000;
        obj1.model = "lenovo";
        System.out.println(obj1);
        System.out.println(obj1.hashCode());
    

        Laptop obj2 = new Laptop();
        obj2.price = 1000;
        obj2.model = "lenovo";
        System.out.println(obj2);

        System.out.println(obj1.equals(obj2));
        
        
    }
}
