package app.phuketvc.mylistview;

public class DataDao {
    private String text = "Hello";
    private int imageId = R.mipmap.ic_launcher;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
