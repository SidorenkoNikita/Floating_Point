import java.io.IOException;

/**
 * Created by Nikita on 12.02.2017.
 */
public class Dimension {
    public int dimOfRealPart;
    public int dimOfIntegerPart;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dimension dimension = (Dimension) o;

        if (dimOfRealPart != dimension.dimOfRealPart) return false;
        return dimOfIntegerPart == dimension.dimOfIntegerPart;

    }

    @Override
    public int hashCode() {
        int result = dimOfRealPart;
        result = 31 * result + dimOfIntegerPart;
        return result;
    }

    public int getDimOfRealPart() {
        return dimOfRealPart;
    }

    public int getDimOfIntegerPart() {
        return dimOfIntegerPart;
    }

    public void setDimOfIntegerPart(int dimOfIntegerPart) {
        this.dimOfIntegerPart = dimOfIntegerPart;
    }

    public void setDimOfRealPart(int dimOfRealPart) {
        this.dimOfRealPart = dimOfRealPart;
    }

    @Override
    public String toString() {
        return "Dimension{" +
                "dimOfRealPart=" + dimOfRealPart +
                ", dimOfIntegerPart=" + dimOfIntegerPart +
                '}';
    }

    public boolean checkForDimension(Floating_Point dimm) throws IOException{
        String x = dimm.toString().substring(dimm.toString().indexOf("."));
        if (((x.length() - dimOfRealPart) == 0)&&(dimm.toString().length()-1 - dimOfIntegerPart - dimOfRealPart == 0)) {
            return true;
        }
        else {
            return false;
        }
    }
}
