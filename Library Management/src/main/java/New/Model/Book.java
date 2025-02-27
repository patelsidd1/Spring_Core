package New.Model;

public class Book {
    private int id;
    private String title;
    private String aurthor;
    private boolean isAvailable;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAurthor() {
        return aurthor;
    }

    public void setAurthor(String aurthor) {
        this.aurthor = aurthor;
    }

    public boolean isAvailable(boolean b) {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
