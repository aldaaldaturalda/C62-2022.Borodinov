public class Main {
    public static void main(String[] args) {

        User user2 = new User("Kolyan", "Bobrov", "male");
        User user3 = new User("Roma", "Bolobanov", "male", 32);
        User user4 = new User("Petya", "Maiorov", "transgender", 33);
        user2.myAge(28);
        user2.myPersonInfo("Kolya", "Aldanou", 28, "male");
    }
}
