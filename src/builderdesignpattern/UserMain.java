package builderdesignpattern;

public class UserMain {
    public static void main(String[] args) {

        User user = new User.UserBuilder().setUserId("100").setUserName("Ram").setEmailId("ram@gmail.com").build();
        System.out.println(user);

        User user2 = User.UserBuilder.builder().setUserId("101").setUserName("Sham").setEmailId("sham@gmail.com").build();
        System.out.println(user2);
    }
}
