package iteratordesignpattern;

public class IteratorMain {

    public static void main(String[] args) {

        User user1 = new User("ram", "001");
        User user2 = new User("sham", "002");
        User user3 = new User("sita", "003");

        UserManagement userManagement = new UserManagement();
        userManagement.addUser(user1);
        userManagement.addUser(user2);
        userManagement.addUser(user3);

        MyIterator iterator = userManagement.getIterator();
        while (iterator.hasNext()){
            User next = (User) iterator.next();
            System.out.println(next.getName()+" : "+next.getUserId());
        }
    }
}
