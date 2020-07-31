package mod6AluraJavaUtil.utils;

import java.util.Arrays;

public class TesteSortArrays {
    public static void main(String[] args) {

        int[] numeros = new int[]{43, 15, 64, 22, 89};
        System.out.println("Array sem ordenação: {43, 15, 64, 22, 89}");

        Arrays.sort(numeros); //método utilitário sort

        System.out.println("Array ordenado, com método sort: " +Arrays.toString(numeros)); //método utilitário toString

        //Saida : [15, 22, 43, 64, 89]
    }
}
