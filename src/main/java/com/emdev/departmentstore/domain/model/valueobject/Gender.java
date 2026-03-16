package com.emdev.departmentstore.domain.model.valueobject;

public enum Gender {
    FEMALE("F"),
    MALE("M"),
    OTHER("O");

    private final String code;

    Gender(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static Gender fromCode(String code) {
        for (Gender gender : values()) {
            if (gender.code.equalsIgnoreCase(code)) {
                return gender;
            }
        }
        throw new IllegalArgumentException("Invalid gender code: " + code);
    }

}
