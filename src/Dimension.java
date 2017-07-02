import java.io.IOException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nikita on 12.02.2017.
 */
public class Dimension {
    /*
    Правила написания размерности: ключом служит величина, значением - приставка степени
    Величина указывается в базовым формате СИ
    Работа с более сложными видами единиц in progress
    */
    private HashMap<String,String> dimOfNumenator;
    private HashMap<String,String> dimOfDenominator;

    private HashMap<String,Integer> translationTable;
    private HashMap<String,String> exceptionTable;

    public HashMap<String, String> getDimOfNumenator() {
        return dimOfNumenator;
    }

    public void setDimOfNumenator(HashMap<String, String> dimOfNumenator) {
        this.dimOfNumenator = dimOfNumenator;
    }

    public HashMap<String, String> getDimOfDenominator() {
        return dimOfDenominator;
    }

    public void setDimOfDenominator(HashMap<String, String> dimOfDenominator) {
        this.dimOfDenominator = dimOfDenominator;
    }

    public HashMap<String, Integer> getTranslationTable() {
        return translationTable;
    }

    public void setTranslationTable(HashMap<String, Integer> translation) {
        this.translationTable = translation;
    }

    public int getOrder(String key) {
        if (translationTable.containsKey(key)) {
            return translationTable.get(key);
        }
        else{
            return 0;
        }
    }

    public HashMap<String, String> getExceptionTable() {
        return exceptionTable;
    }

    public void setExceptionTable(HashMap<String, String> exceptionTable) {
        this.exceptionTable = exceptionTable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dimension dimension = (Dimension) o;

        if (dimOfNumenator != null ? !dimOfNumenator.equals(dimension.dimOfNumenator) : dimension.dimOfNumenator != null)
            return false;
        if (dimOfDenominator != null ? !dimOfDenominator.equals(dimension.dimOfDenominator) : dimension.dimOfDenominator != null)
            return false;
        if (translationTable != null ? !translationTable.equals(dimension.translationTable) : dimension.translationTable != null)
            return false;
        return exceptionTable != null ? exceptionTable.equals(dimension.exceptionTable) : dimension.exceptionTable == null;

    }

    @Override
    public int hashCode() {
        int result = dimOfNumenator != null ? dimOfNumenator.hashCode() : 0;
        result = 31 * result + (dimOfDenominator != null ? dimOfDenominator.hashCode() : 0);
        result = 31 * result + (translationTable != null ? translationTable.hashCode() : 0);
        result = 31 * result + (exceptionTable != null ? exceptionTable.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        String result = "";
        for (Map.Entry entry: dimOfNumenator.entrySet()) {
            result += entry.getValue().toString() + entry.getKey().toString()+" ";
        }
        result = result + "/";
        for (Map.Entry entry: dimOfDenominator.entrySet()) {
            result += entry.getValue().toString() + entry.getKey().toString()+" ";
        }
        return result;
    }
    public int toBase(){
        int result = 0;
        for (Map.Entry entry: dimOfNumenator.entrySet()){
            result += getOrder(entry.getValue().toString());
            dimOfNumenator.put(entry.getKey().toString(),"");
        }
        for (Map.Entry entry: dimOfDenominator.entrySet()){
            result -= getOrder(entry.getValue().toString());
            dimOfDenominator.put(entry.getKey().toString(),"");
        }
        return result;
    }
    public void fromString(String a){
        String[] parts = a.split("/");
        String [] numenator = parts[1].trim().split(" ");
        String [] denominator = parts[2].trim().split(" ");
        for (int i=0;i<numenator.length; i++){
            for (Map.Entry entry: translationTable.entrySet()) {
                if (!(numenator[i].split(entry.getKey().toString()).length ==0)) {
                    dimOfNumenator.put(entry.getKey().toString(),numenator[i]);
                }
            }
        }
        for (int i=0;i<denominator.length; i++){
            for (Map.Entry entry: translationTable.entrySet()) {
                if (!(denominator[i].split(entry.getKey().toString()).length == 0)) {
                    dimOfNumenator.put(entry.getKey().toString(),denominator[i]);
                }
            }
        }
    }
}
