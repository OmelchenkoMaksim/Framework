package common;

import java.nio.charset.StandardCharsets;
import java.util.Random;

public class RandomUtils {

    public static String generateRandom() {
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        return new String(array, StandardCharsets.UTF_8);
    }
}
