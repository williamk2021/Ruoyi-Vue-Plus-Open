package com.ruoyi.common.utils;

import java.util.regex.Pattern;

public class IPv6Util {

    private static final String IPV6_REGEX =
            "^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$";

    public static boolean isIPv6Address(String ipAddress) {
        return Pattern.matches(IPV6_REGEX, ipAddress);
    }

    public static void main(String[] args) {
        String ipAddress1 = "2001:0db8:85a3:0000:0000:8a2e:0370:7334";
        String ipAddress2 = "192.168.1.1"; // IPv4 address

        System.out.println(ipAddress1 + " is IPv6: " + isIPv6Address(ipAddress1));
        System.out.println(ipAddress2 + " is IPv6: " + isIPv6Address(ipAddress2));
    }
}
