package L2;

public class StringMetod {
    public static void main(String[] args) {
        String str1 = new String("Hot JavaHello");
        String str2 = "Java";
//        System.out.println(String.valueOf(65));
        String str3 = String.valueOf(65);
        System.out.println(String.copyValueOf(str2.toCharArray()));
    }
}