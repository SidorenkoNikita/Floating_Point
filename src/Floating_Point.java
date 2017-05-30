import java.util.ArrayList;

import static java.lang.Math.abs;

import java.lang.String;

/**
 * Created by Nikita on 12.02.2017.
 */
public class Floating_Point {
    private Double number;
    private Dimension dim;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Floating_Point that = (Floating_Point) o;

        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        return dim != null ? dim.equals(that.dim) : that.dim == null;

    }

    @Override
    public int hashCode() {
        int result = number != null ? number.hashCode() : 0;
        result = 31 * result + (dim != null ? dim.hashCode() : 0);
        return result;
    }

    public void sum(Floating_Point a) throws Exception {
        int b = a.dim.toBase();
        int c = this.dim.toBase();
        if (this.dim.equals(a.dim)) {
            this.number = this.number * b + a.number * c;
        } else {
            throw new Exception("Not compatible dimmension");
        }
    }

    public void sub(Floating_Point a) throws Exception {
        int b = a.dim.toBase();
        int c = this.dim.toBase();
        if (this.dim.equals(a.dim)) {
            this.number = this.number * b - a.number * c;
        } else {
            throw new Exception("Not compatible dimmension");
        }
    }

    public void multi(Floating_Point a) throws Exception {
        int b = a.dim.toBase();
        int c = this.dim.toBase();
        if (this.dim.equals(a.dim)){
            this.number = this.number*b*a.number*c;
        }
        else {
            throw new Exception("Not compatible dimmension");
        }
    }

    public void div(Floating_Point a) throws Exception {
        int b = a.dim.toBase();
        int c = this.dim.toBase();
        if (this.dim.equals(a.dim)){
            this.number = this.number*b/(a.number*c);
        }
        else {
            throw new Exception("Not compatible dimmension");
        }
    }

    public String readFromString(String a) {
        String[] parts = a.split(" ", 2);
        this.number = Double.parseDouble(parts[1]);
        this.dim.fromString(parts[2]);
    }
}
