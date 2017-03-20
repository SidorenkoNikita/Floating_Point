import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;

import static java.lang.Math.abs;
import static  java.lang.Math.pow;

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

    public boolean checkForLenght() {
        String mantis = this.toString().substring(0, this.toString().indexOf("E")-1);
        String exp = this.toString().substring(this.toString().indexOf("E")+1);
        if (!(mantis.length() - this.dim.dimOfMantis <= 0) || !(exp.length() - this.dim.dimOfExp <= 0)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean checkForLenghtOfExp() {
        String mantis = this.toString().substring(0, this.toString().indexOf("E"));
        String exp = this.toString().substring(this.toString().indexOf("E"));
        if (!(mantis.length() - this.dim.dimOfMantis <= 0) || !(exp.length() - this.dim.dimOfExp <= 0)) {
            return false;
        } else {
            return true;
        }
    }

    public void sum(Floating_Point b) throws IOException {
        if ((this.dim.checkForDim(b)) && (this.checkForLenght()) && (b.checkForLenght())) {
            if (this.Exp <= b.Exp) {
                this.mantis = (int)(this.mantis + b.mantis * pow (10,(b.Exp - this.Exp)));
            } else {
                this.mantis = (int)(this.mantis * pow  (10,this.Exp - b.Exp) + b.mantis);
                this.Exp = this.Exp - b.Exp;
            }
            if (!this.checkForLenght()) {
                IOException e = new IOException();
                throw e;
            }
        } else {
            IOException e = new IOException();
            throw e;
        }
    }

    public void sub(Floating_Point b) throws IOException {
        if ((this.dim.checkForDim(b)) && (this.checkForLenght()) && (b.checkForLenght())) {
            if (this.Exp <= b.Exp) {
                this.mantis = (int)(this.mantis  - b.mantis*  pow (10,b.Exp - this.Exp));
                this.Exp = b.Exp;
            } else {
                this.mantis = (int)(this.mantis *pow (10,b.Exp - this.Exp) - b.mantis) ;
            }
            if (!this.checkForLenght()) {
                IOException e = new IOException();
                throw e;
            }
        } else {
            IOException e = new IOException();
            throw e;
        }
    }
    public void div(Floating_Point b) throws IOException{
        if ((this.dim.checkForDim(b)) && (this.checkForLenght()) && (b.checkForLenght())) {
            double addmantis = this.mantis / b.mantis;
            int addExp = this.Exp - b.Exp;
            while (abs(addmantis) < 1) {
                addmantis = addmantis * 10;
                addExp = addExp - 1;
            }
            this.mantis = (int)addmantis;
            this.Exp = addExp;
            if (!this.checkForLenght()){
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
        if ((this.dim.checkForDim(b)) && (this.checkForLenght()) && (b.checkForLenght())) {
            double addmantis = this.mantis * b.mantis;
            int addExp = this.Exp + b.Exp;
            this.mantis = (int)addmantis;
            this.Exp = addExp;
            if (!this.checkForLenght()){
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
