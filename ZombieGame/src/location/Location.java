package location;

public class Location {
    private int iPosition ;
    private int jPosition;

    public Location(int iPosition, int jPosition) {
        this.iPosition = iPosition;
        this.jPosition = jPosition;
    }

    public int getiPosition() {
        return iPosition;
    }

    public void setiPosition(int iPosition) {
        this.iPosition = iPosition;
    }

    public int getjPosition() {
        return jPosition;
    }

    public void setjPosition(int jPosition) {
        this.jPosition = jPosition;
    }

    @Override
    public String toString() {
        return iPosition+","+jPosition;
    }
}
