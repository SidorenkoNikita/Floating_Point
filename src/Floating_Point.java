import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;

import static java.lang.Math.abs;

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
        return "" + mantis + "E" + Exp;
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

    public Dimension getDim() {
        return dim;
    }

    public void setDim(Dimension dim) {
        this.dim = dim;
    }

    public boolean checkForLenght(Floating_Point a) {
        String mantis = a.toString().substring(0, a.toString().indexOf("E"));
        String exp = a.toString().substring(a.toString().indexOf("E"));
        if (!(mantis.length() - a.dim.dimOfMantis <= 0) || !(exp.length() - a.dim.dimOfExp <= 0)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean checkForLenghtOfExp(Floating_Point a) {
        String mantis = a.toString().substring(0, a.toString().indexOf("E"));
        String exp = a.toString().substring(a.toString().indexOf("E"));
        if (!(mantis.length() - a.dim.dimOfMantis <= 0) || !(exp.length() - a.dim.dimOfExp <= 0)) {
            return false;
        } else {
            return true;
        }
    }

    public void sum(Floating_Point b) throws IOException {
        if ((this.dim.checkForDim(b)) && (checkForLenght(this)) && (checkForLenght(b))) {
            if (this.Exp <= b.Exp) {
                this.mantis = this.mantis * 10 ^ (b.Exp - this.Exp) + b.mantis;
                this.Exp = b.Exp;
            } else {
                this.mantis = this.mantis + b.mantis * 10 ^ (this.Exp - b.Exp);
            }
            if (!checkForLenght(this)) {
                IOException e = new IOException();
                throw e;
            }
        } else {
            IOException e = new IOException();
            throw e;
        }
    }

    public void sub(Floating_Point b) throws IOException {
        if ((this.dim.checkForDim(b)) && (checkForLenght(this)) && (checkForLenght(b))) {
            if (this.Exp <= b.Exp) {
                this.mantis = this.mantis * 10 ^ (b.Exp - this.Exp) - b.mantis;
                this.Exp = b.Exp;
            } else {
                this.mantis = this.mantis - b.mantis * 10 ^ (this.Exp - b.Exp);
            }
            if (!checkForLenght(this)) {
                IOException e = new IOException();
                throw e;
            }
        } else {
            IOException e = new IOException();
            throw e;
        }
    }
    public void div(Floating_Point b) throws IOException{
        if ((this.dim.checkForDim(b)) && (checkForLenght(this)) && (checkForLenght(b))) {
            double addmantis = this.mantis / b.mantis;
            int addExp = this.Exp - b.Exp;
            while (abs(addmantis) < 1) {
                addmantis = addmantis * 10;
                addExp = addExp - 1;
            }
            this.mantis = (int)addmantis;
            this.Exp = addExp;
            if (!checkForLenght(this)){
                IOException e = new IOException();
                throw e;
            }
        }
        else {
            IOException e = new IOException();
            throw e;
        }
    }
    public void multi (Floating_Point b) throws IOException{
        if ((this.dim.checkForDim(b)) && (checkForLenght(this)) && (checkForLenght(b))) {
            double addmantis = this.mantis * b.mantis;
            int addExp = this.Exp + b.Exp;
            this.mantis = (int)addmantis;
            this.Exp = addExp;
            if (!checkForLenght(this)){
                IOException e = new IOException();
                throw e;
            }
        }
        else {
            IOException e = new IOException();
            throw e;
        }
    }
}
