import java.util.List;
import java.util.ArrayList;

public class User implements Interface {
    protected int id;
    protected String name;
    protected List<Interface> followers;

    protected PrintScreen myScreen;
    protected Email myMail;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.followers = new ArrayList<>();

        this.myScreen = new PrintScreen();
        this.myMail = new Email();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addFollower(Interface follower) {
        this.followers.add(follower);
    }

    public String post(String postContent) {
        for (Interface follower : followers) {
            follower.update(this.name, postContent);
        }
        return "Posted: " + postContent;
    }

    @Override
    public void update(String author, String post) {
        System.out.println("|EMAIL NOTIFICATION|");
        myMail.update(author, post);
        System.out.println("\n|FORUM NOTIFICATION|");
        System.out.println("@" + author + " has published a new post");
        System.out.println("\n|MESSAGE ON FORUM|");
        myScreen.update(author, post);
        System.out.println();
        
    }
}