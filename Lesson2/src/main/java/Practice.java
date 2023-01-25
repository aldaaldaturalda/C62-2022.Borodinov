public class Practice {
    public static void main(String[] args) {
        calculation();
        next();
    }
    public static void calculation(){
        int a = 2;
        int b = 5;
        int sum = a + b;
        System.out.println(sum);
        if(b > a){
            String ss = next();
            System.out.println(ss);
        }
    }
    public static String next(){return "next"; }
}

