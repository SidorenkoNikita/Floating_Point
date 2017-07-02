import java.io.IOException;
import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Created by 1081_1 on 14.03.17.
 */
public class Floating_PointTest {
    @org.junit.Test
    public void sum() {
        Floating_Point b = new Floating_Point();
        Floating_Point c = new Floating_Point();
        Floating_Point d = new Floating_Point();
        Floating_Point e = new Floating_Point();
        Dimension a = new Dimension();
        Dimension aa = new Dimension();
        HashMap<String, String> dna = new HashMap<>();
        HashMap<String, String> dda = new HashMap<>();
        HashMap<String, Integer> tta = new HashMap<>();
        HashMap<String, String> eta = new HashMap<>();
        HashMap<String, String> dnaa = new HashMap<>();
        HashMap<String, String> ddaa = new HashMap<>();
        HashMap<String, Integer> ttaa = new HashMap<>();
        HashMap<String, String> etaa = new HashMap<>();
        dna.put("грамм", "кило");
        dda.put("", "метр");
        tta.put("кило", 3);
        dnaa.put("грамм", "кило");
        ddaa.put("", "метр");
        ttaa.put("кило", 3);
        a.setTranslationTable(tta);
        a.setExceptionTable(eta);
        a.setDimOfNumenator(dna);
        a.setDimOfDenominator(ddaa);
        aa.setTranslationTable(ttaa);
        aa.setExceptionTable(etaa);
        aa.setDimOfNumenator(dnaa);
        aa.setDimOfDenominator(ddaa);
        b.setDim(a);
        d.setDim(aa);
        b.setNumber(2.1);
        d.setNumber(0.0);
        try {
            b.sum(c);
        }
        catch (Exception k) {
        }
        try {
            b.sum(d);
        }
        catch (Exception j) {
        }
        try {
            d.sum(b);
        } catch (Exception l) {
        }
        assertEquals(true, d.getDim().equals(b.getDim()));
        assertEquals(true, b.equals(d));

    }
    @org.junit.Test
    public void sub() {
        Floating_Point b = new Floating_Point();
        Floating_Point c = new Floating_Point();
        Floating_Point d = new Floating_Point();
        Floating_Point e = new Floating_Point();
        Dimension a = new Dimension();
        Dimension aa = new Dimension();
        HashMap<String, String> dna = new HashMap<>();
        HashMap<String, String> dda = new HashMap<>();
        HashMap<String, Integer> tta = new HashMap<>();
        HashMap<String, String> eta = new HashMap<>();
        HashMap<String, String> dnaa = new HashMap<>();
        HashMap<String, String> ddaa = new HashMap<>();
        HashMap<String, Integer> ttaa = new HashMap<>();
        HashMap<String, String> etaa = new HashMap<>();
        dna.put("грамм", "кило");
        dda.put("", "метр");
        tta.put("кило", 3);
        dnaa.put("грамм", "кило");
        ddaa.put("", "метр");
        ttaa.put("кило", 3);
        a.setTranslationTable(tta);
        a.setExceptionTable(eta);
        a.setDimOfNumenator(dna);
        a.setDimOfDenominator(ddaa);
        aa.setTranslationTable(ttaa);
        aa.setExceptionTable(etaa);
        aa.setDimOfNumenator(dnaa);
        aa.setDimOfDenominator(ddaa);
        b.setDim(a);
        d.setDim(aa);
        b.setNumber(2.1);
        d.setNumber(0.0);
        try {
            b.sub(c);
        }
        catch (Exception k) {
        }
        try {
            b.sub(d);
        }
        catch (Exception j) {
        }
        try {
            d.sub(b);
        } catch (Exception l) {
        }
        d.setNumber(-d.getNumber());
        assertEquals(true, d.getDim().equals(b.getDim()));
        assertEquals(true, b.equals(d));

    }
    @org.junit.Test
    public void multi() {
        Floating_Point b = new Floating_Point();
        Floating_Point c = new Floating_Point();
        Floating_Point d = new Floating_Point();
        Floating_Point e = new Floating_Point();
        Dimension a = new Dimension();
        Dimension aa = new Dimension();
        HashMap<String, String> dna = new HashMap<>();
        HashMap<String, String> dda = new HashMap<>();
        HashMap<String, Integer> tta = new HashMap<>();
        HashMap<String, String> eta = new HashMap<>();
        HashMap<String, String> dnaa = new HashMap<>();
        HashMap<String, String> ddaa = new HashMap<>();
        HashMap<String, Integer> ttaa = new HashMap<>();
        HashMap<String, String> etaa = new HashMap<>();
        dna.put("грамм", "кило");
        dda.put("", "метр");
        tta.put("кило", 3);
        dnaa.put("грамм", "кило");
        ddaa.put("", "метр");
        ttaa.put("кило", 3);
        a.setTranslationTable(tta);
        a.setExceptionTable(eta);
        a.setDimOfNumenator(dna);
        a.setDimOfDenominator(ddaa);
        aa.setTranslationTable(ttaa);
        aa.setExceptionTable(etaa);
        aa.setDimOfNumenator(dnaa);
        aa.setDimOfDenominator(ddaa);
        b.setDim(a);
        d.setDim(aa);
        b.setNumber(2.1);
        d.setNumber(1.0);
        try {
            b.multi(c);
        }
        catch (Exception k) {
        }
        try {
            b.multi(d);
        }
        catch (Exception j) {
        }
        try {
            d.multi(b);
        } catch (Exception l) {
        }
        d.setNumber(-d.getNumber());
        assertEquals(true, d.getDim().equals(b.getDim()));
        assertEquals(true, b.equals(d));

    }
    @org.junit.Test
    public void div() {
        Floating_Point b = new Floating_Point();
        Floating_Point c = new Floating_Point();
        Floating_Point d = new Floating_Point();
        Floating_Point e = new Floating_Point();
        Dimension a = new Dimension();
        Dimension aa = new Dimension();
        HashMap<String, String> dna = new HashMap<>();
        HashMap<String, String> dda = new HashMap<>();
        HashMap<String, Integer> tta = new HashMap<>();
        HashMap<String, String> eta = new HashMap<>();
        HashMap<String, String> dnaa = new HashMap<>();
        HashMap<String, String> ddaa = new HashMap<>();
        HashMap<String, Integer> ttaa = new HashMap<>();
        HashMap<String, String> etaa = new HashMap<>();
        dna.put("грамм", "кило");
        dda.put("", "метр");
        tta.put("кило", 3);
        dnaa.put("грамм", "кило");
        ddaa.put("", "метр");
        ttaa.put("кило", 3);
        a.setTranslationTable(tta);
        a.setExceptionTable(eta);
        a.setDimOfNumenator(dna);
        a.setDimOfDenominator(ddaa);
        aa.setTranslationTable(ttaa);
        aa.setExceptionTable(etaa);
        aa.setDimOfNumenator(dnaa);
        aa.setDimOfDenominator(ddaa);
        b.setDim(a);
        d.setDim(aa);
        b.setNumber(2.1);
        d.setNumber(1.0);
        try {
            b.div(c);
        }
        catch (Exception k) {
        }
        try {
            b.div(d);
        }
        catch (Exception j) {
        }
        d.setNumber(4.41);
        try {
            d.multi(b);
        } catch (Exception l) {
        }
        d.setNumber(-d.getNumber());
        assertEquals(true, d.getDim().equals(b.getDim()));
        assertEquals(true, b.equals(d));

    }

}