package academy.devdojo.maratonajava.javacore.Pwrappers.test;

import java.util.List;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 100;
        char charP = 'W';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L; //autoboxing - transformar primitivo em wrapper
        Float floatW = 10F;
        Double doubleW = 100.00;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; //unboxing - transformar wraper em primitivo
        Integer intW2 = Integer.parseInt("1");

        List<Integer> list;
    }
}
