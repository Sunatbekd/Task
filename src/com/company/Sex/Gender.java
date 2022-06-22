package com.company.Sex;

public enum Gender {
    MALE("male"),
    FEMALE("female");

    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public static Gender getGenderByValue(String value) {
            if (MALE.getGender().equalsIgnoreCase(value)) {
                return MALE;
            } else {
                return FEMALE;
            }
    }
}
