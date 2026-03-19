package com.emdev.departmentstore.domain.model.valueobject;

public enum Gender {
    FEMALE('F'),
    MALE('M'),
    OTHER('O');

    private final char code;

    Gender(char code) {
        this.code = code;
    }

    public char getCode() {
        return code;
    }

    public static Gender fromCode(String code) {
        if (code == null || code.length() != 1) {
            throw new IllegalArgumentException("Invalid gender code: " + code);
        }
        return fromCode(code.charAt(0));
    }

    public static Gender fromCode(char code) {
        for (Gender gender : values()) {
            if (gender.code == code) {
                return gender;
            }
        }
        throw new IllegalArgumentException("Invalid gender code: " + code);
    }

}
