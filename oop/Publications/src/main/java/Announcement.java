public class Announcement extends Publication{
    private final int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", daysToExpire=" + daysToExpire;
    }
}
