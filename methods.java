public class methods {
    public static void main(String[] args) {
        computer obj = new computer();
        obj.playVideo();
        String output = obj.getMeAPen(2);
        System.out.println(output);
    }
}

class computer {
    public void playVideo(){
        System.out.println("Playing video...");
    }
    public String getMeAPen(int cost){
        if(cost>=10)
            return "Pen";
        return "Nothing";
    }
}
