import java.io.IOException;

/**
 * Created by Nikita on 12.02.2017.
 */
public class Floating_Point {
    public int mantis;
    public int Exp;
    public Dimension dim;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Floating_Point that = (Floating_Point) o;

        if (mantis != that.mantis) return false;
        if (Exp != that.Exp) return false;
        return dim != null ? dim.equals(that.dim) : that.dim == null;

    }

    @Override
    public int hashCode() {
        int result = mantis;
        result = 31 * result + Exp;
        result = 31 * result + (dim != null ? dim.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return ""+ mantis + "E" + Exp;
    }

    public int getMantis() {
        return mantis;
    }

    public void setMantis(int mantis) {
        this.mantis = mantis;
    }

    public int getExp() {
        return Exp;
    }

    public void setExp(int exp) {
        Exp = exp;
    }

    public boolean checkForLenght(Floating_Point a){
        String mantis = a.toString().substring(0,a.toString().indexOf("E"));
        String exp = a.toString().substring(a.toString().indexOf("E"));
        if (!(mantis.length() - a.dim.dimOfMantis <= 0) || !(exp.length()- a.dim.dimOfExp <= 0)){
            return false;
        }
        else {
            return  true;
        }
    }
    public boolean checkForLenghtOfExp(Floating_Point a){
        String mantis = a.toString().substring(0,a.toString().indexOf("E"));
        String exp = a.toString().substring(a.toString().indexOf("E"));
        if (!(mantis.length() - a.dim.dimOfMantis <= 0) || !(exp.length()- a.dim.dimOfExp <= 0)){
            return false;
        }
        else {
            return  true;
        }
    }
    public void sum (Floating_Point a, Floating_Point b)throws IOException{
        if((a.dim.checkForDim(b))&&(checkForLenght(a))&&(checkForLenght(b))){
            if (a.Exp - b.Exp <= ){

            }
        }
        else {
            IOException e = new IOException();
            throw e;
        }
    }
}
