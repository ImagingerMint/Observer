public class PrintScreen implements Interface {
    @Override
    public void update(String author, String post) {
        System.out.println("@" + author + " posted: " + post);
    }
}