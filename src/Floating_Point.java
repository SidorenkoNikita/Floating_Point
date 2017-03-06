import java.io.IOException;

/**
 * Created by Nikita on 12.02.2017.
 */
public class Floating_Point {
    public byte octothorpe;
    public int integerPart;
    public int realPart;
    public Dimension dim;
    @Override
    public String toString(){
        return "" + this.integerPart+"."+this.realPart;
    }
    public void sum(Floating_Point a) throws IOException{
        if ((dim.equals(a.dim))&&(dim.checkForDimension(this))&&(a.dim.checkForDimension(a))) {
            if ((octothorpe * integerPart + a.octothorpe * a.integerPart)- dim.dimOfIntegerPart <= 0) {
                integerPart = octothorpe * integerPart + a.octothorpe * a.integerPart;
            }
            realPart = a.realPart;
        }
        else {
            IOException e = new IOException();
            throw e;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Floating_Point that = (Floating_Point) o;

        if (octothorpe != that.octothorpe) return false;
        if (integerPart != that.integerPart) return false;
        if (realPart != that.realPart) return false;
        return dim.equals(that.dim);

    }

    @Override
    public int hashCode() {
        int result = (int) octothorpe;
        result = 31 * result + integerPart;
        result = 31 * result + realPart;
        result = 31 * result + dim.hashCode();
        return result;
    }

    public byte getOctothorpe() {
        return octothorpe;
    }

    public void setOctothorpe(byte octothorpe) {
        this.octothorpe = octothorpe;
    }

    public int getIntegerPart() {
        return integerPart;
    }

    public void setIntegerPart(int integerPart) {
        this.integerPart = integerPart;
    }

    public int getRealPart() {
        return realPart;
    }

    public void setRealPart(int realPart) {
        this.realPart = realPart;
    }

    public Dimension getDim() {
        return dim;
    }

    public void setDim(Dimension dim) {
        this.dim = dim;
    }

    public void subtraction(Floating_Point a){
        integerPart = integerPart + a.integerPart;
    }
}
