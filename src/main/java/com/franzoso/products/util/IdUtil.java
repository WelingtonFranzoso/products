package com.franzoso.products.util;

import java.util.UUID;

public class IdUtil {

    private IdUtil() {}

    public static String uuid() {
        return UUID.randomUUID().toString().toLowerCase().replace("-", "");
    }
}
