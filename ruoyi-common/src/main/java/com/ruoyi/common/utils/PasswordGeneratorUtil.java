package com.ruoyi.common.utils;

import java.security.SecureRandom;

public class PasswordGeneratorUtil {

    // 定义字符池
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_=+[]{}|;:,.<>?";

    // 生成随机密码的方法
    public static String generatePassword(int length, boolean useLowercase, boolean useUppercase, boolean useDigits, boolean useSpecialCharacters) {
        if (length <= 0) {
            throw new IllegalArgumentException("Password length must be greater than zero");
        }

        // 根据选择的选项构建字符池
        StringBuilder characterPool = new StringBuilder();
        if (useLowercase) {
            characterPool.append(LOWERCASE);
        }
        if (useUppercase) {
            characterPool.append(UPPERCASE);
        }
        if (useDigits) {
            characterPool.append(DIGITS);
        }
        if (useSpecialCharacters) {
            characterPool.append(SPECIAL_CHARACTERS);
        }

        if (characterPool.length() == 0) {
            throw new IllegalArgumentException("At least one character set must be selected");
        }

        // 使用SecureRandom生成随机数
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characterPool.length());
            password.append(characterPool.charAt(index));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        // 测试生成密码的方法
        int length = 40;
        boolean useLowercase = true;
        boolean useUppercase = true;
        boolean useDigits = true;
        boolean useSpecialCharacters = true;

        String password = generatePassword(length, useLowercase, useUppercase, useDigits, useSpecialCharacters);
        System.out.println("Generated Password: " + password);
    }
}
