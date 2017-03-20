import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Created by 1081_1 on 14.03.17.
 */
public class Floating_PointTest {
    @org.junit.Test
    public void checkForLenght() throws Exception {
        Dimension dim = new Dimension();
        dim.setDimOfExp(1);
        dim.setDimOfMantis(2);
        Floating_Point e = new Floating_Point();
        Floating_Point f = new Floating_Point();
        e.setDim(dim);
        e.setExp(1);
        e.setMantis(2);
        f.setDim(dim);
        f.setExp(12);
        f.setMantis(123);
        assertEquals(true, e.checkForLenght());
        assertEquals(false,f.checkForLenght());
    }

    @org.junit.Test
    public void checkForLenghtOfExp() throws Exception {

    }

    @org.junit.Test
    public void sum() throws Exception {
        Dimension dim = new Dimension();
        dim.setDimOfExp(1);
        dim.setDimOfMantis(2);
        Floating_Point e = new Floating_Point();
        Floating_Point f = new Floating_Point();
        Floating_Point b = new Floating_Point();
        Floating_Point a = new Floating_Point();
        a.setDim(dim);
        a.setExp(1);
        a.setMantis(7);
        b.setDim(dim);
        b.setMantis(5);
        b.setExp(1);
        e.setDim(dim);
        e.setExp(1);
        e.setMantis(2);
        f.setDim(dim);
        f.setExp(12);
        f.setMantis(123);
        try {
            e.sum(f);
            assertEquals(true,false);
        }
        catch (IOException c){
            assertEquals(true,true);
        }
        e.sum(b);
        assertEquals(a,e);


    }

    @org.junit.Test
    public void sub() throws Exception {
        Dimension dim = new Dimension();
        dim.setDimOfExp(1);
        dim.setDimOfMantis(2);
        Floating_Point e = new Floating_Point();
        Floating_Point f = new Floating_Point();
        Floating_Point b = new Floating_Point();
        Floating_Point a = new Floating_Point();
        a.setDim(dim);
        a.setExp(1);
        a.setMantis(2);
        b.setDim(dim);
        b.setMantis(5);
        b.setExp(1);
        e.setDim(dim);
        e.setExp(1);
        e.setMantis(2);
        f.setDim(dim);
        f.setExp(12);
        f.setMantis(123);
        try {
            e.sub(f);
            assertEquals(true,false);
        }
        catch (IOException c){
            assertEquals(true,true);
        }
        b.sub(a);
        assertEquals(a,e);



    }

    @org.junit.Test
    public void div() throws Exception {
        Dimension dim = new Dimension();
        dim.setDimOfExp(1);
        dim.setDimOfMantis(2);
        Floating_Point e = new Floating_Point();
        Floating_Point f = new Floating_Point();
        Floating_Point b = new Floating_Point();
        Floating_Point a = new Floating_Point();
        a.setDim(dim);
        a.setExp(1);
        a.setMantis(2);
        b.setDim(dim);
        b.setMantis(6);
        b.setExp(1);
        e.setDim(dim);
        e.setExp(0);
        e.setMantis(3);
        f.setDim(dim);
        f.setExp(12);
        f.setMantis(123);
        try {
            e.div(f);
            assertEquals(true,false);
        }
        catch (IOException c){
            assertEquals(true,true);
        }
        b.div(a);
        assertEquals(b,e);

    }

    @org.junit.Test
    public void multi() throws Exception {
        Dimension dim = new Dimension();
        dim.setDimOfExp(1);
        dim.setDimOfMantis(2);
        Floating_Point e = new Floating_Point();
        Floating_Point f = new Floating_Point();
        Floating_Point b = new Floating_Point();
        Floating_Point a = new Floating_Point();
        a.setDim(dim);
        a.setExp(1);
        a.setMantis(2);
        b.setDim(dim);
        b.setMantis(1);
        b.setExp(1);
        e.setDim(dim);
        e.setExp(2);
        e.setMantis(2);
        f.setDim(dim);
        f.setExp(12);
        f.setMantis(123);
        try {
            e.multi(f);
            assertEquals(true,false);
        }
        catch (IOException c){
            assertEquals(true,true);
        }
        b.multi(a);
        assertEquals(b,e);

    }

}