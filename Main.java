public class Main {
    public static void main(String[] args) {
        User[] userList = new User[5];

        User user1 = new User(1, "User1");
        User user2 = new User(2, "User2");

        userList[0] = user1;
        userList[1] = user2;

        user1.addFollower(user2);

        user1.post("hello.");
    }
}