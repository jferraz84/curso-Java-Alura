package mod6AluraJavaUtil.utils;

import java.util.ArrayList;
import java.util.List;

public class TesteClassesWrappers {
    public static void main(String[] args) {

        Integer idadeRef = Integer.valueOf(29);  // AUTOBOXING
        System.out.println(idadeRef.intValue()); // UNBOXING

        Double dRef = Double.valueOf(3.2);       // AUTOBOXING
        System.out.println(dRef.doubleValue());  // UNBOXING

        Boolean bRef = Boolean.FALSE;  // FALSE= é uma constante, e sempre vai estar em letra maiúscula
        System.out.println(bRef.booleanValue());

        Number refNumero = Float.valueOf(29.9f);

        List<Number> lista = new ArrayList<>();
        lista.add(10);
        lista.add(32.6);

    }
}
