import java.io.IOException;

/**
 * Created by Nikita on 12.02.2017.
 */
public class Dimension {
    public int dimOfExp;
    public int dimOfMantis;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dimension dimension = (Dimension) o;

        if (dimOfExp != dimension.dimOfExp) return false;
        return dimOfMantis == dimension.dimOfMantis;

    }

    @Override
    public int hashCode() {
        int result = dimOfExp;
        result = 31 * result + dimOfMantis;
        return result;
    }

    @Override
    public String toString() {
        return "Dimension{" +
                "dimOfExp=" + dimOfExp +
                ", dimOfMantis=" + dimOfMantis +
                '}';
    }

    public int getDimOfExp() {
        return dimOfExp;
    }

    public void setDimOfExp(int dimOfExp) {
        this.dimOfExp = dimOfExp;
    }

    public int getDimOfMantis() {
        return dimOfMantis;
    }

    public void setDimOfMantis(int dimOfMantis) {
        this.dimOfMantis = dimOfMantis;
    }

    public boolean checkForDim(Floating_Point b){
        if(b.dim.equals(this)) {
            return  true;
        }
        else {
            return false;
        }
    }

}
