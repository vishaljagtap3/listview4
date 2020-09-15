package in.bitcode.listview3;

public class City {

    private String mName;
    private int mImageId;
    private String mState;
    private boolean mSelected;

    public City(String name, int imageId, String state ) {
        this.mName = name;
        this.mImageId = imageId;
        mState = state;
        mSelected = false;
    }

    public void setName( String name ) {
        mName = name;
    }

    public String getName() {
        return mName;
    }

    public void setImageId( int imageId ) {
        mImageId = imageId;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setState( String state ) {
        mState = state;
    }

    public String getState() {
        return mState;
    }

    public boolean isSelected() {
        return mSelected;
    }

    public void setSelected(boolean selected) {
        this.mSelected = selected;
    }
}
