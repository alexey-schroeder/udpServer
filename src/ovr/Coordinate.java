package ovr;

/**
 * Created by Alex on 11.05.2014.
 */
public class Coordinate {
    double x, y, z, alpha, betta, zetta;
    private boolean undefined;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
        undefined = false;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
        undefined = false;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
        undefined = false;
    }

    public double getAlpha() {
        return alpha;
    }

    public void setAlpha(double alpha) {
        this.alpha = alpha;
        undefined = false;
    }

    public double getBetta() {
        return betta;
    }

    public void setBetta(double betta) {
        this.betta = betta;
        undefined = false;
    }

    public double getZetta() {
        return zetta;
    }

    public void setZetta(double zetta) {
        this.zetta = zetta;
        undefined = false;
    }

    @Override
    public String toString() {
        if(undefined){
            return "null";
        }
        return "" +
                x +
                " " + y +
                " " + z +
                " " + alpha +
                " " + betta +
                " " + zetta;
    }

    public boolean isUndefined() {
        return undefined;
    }

    public void setUndefined() {
        this.undefined = true;
    }
}
