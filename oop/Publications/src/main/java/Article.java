public class Article extends Publication{
    private final String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", author=\"" + author + "\"";
    }
}
