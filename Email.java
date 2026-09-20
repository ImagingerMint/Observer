public class Email implements Interface {
    @Override
    public void update(String author, String post) {
        System.out.print("NOTIFICATION: ");
        System.out.println("@" + author + " has published a new post");
        System.out.print("POST: ");
        System.out.println(post);
    }
}