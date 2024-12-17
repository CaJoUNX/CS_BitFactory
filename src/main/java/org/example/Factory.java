package org.example;

import java.util.Random;

public class Factory {
    public static boolean RandomBit() {

        int result = 0;
        Random rand = new Random();

        return rand.nextBoolean();



    }
    public static byte RandomByte() {
        int result = 0;

        for (int i = 0; i < 8; i++) {
            boolean buffer = RandomBit();
            if (buffer) {
                result += Math.pow(2, i);
            }

        }
       /* System.out.println(bin);
        int res = Integer.parseInt(bin, 2);

        System.out.println(res);

        result = Byte.parseByte(bin, 2);
        return result;*/
        System.out.println(result);
        return (byte)Math.abs(result);
    }
}
