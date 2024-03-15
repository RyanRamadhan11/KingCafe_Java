package com.enigma.kingcaffe_java.constant;

import java.util.Optional;

public enum EOrderType {
    EAT_IN("EAT_IN"),
    ONLINE("ONLINE"),
    TAKE_AWAY("TAKE_AWAY");

    private final String displayValue;

    EOrderType(String displayValue) {
        this.displayValue = displayValue;
    }

    // Metode untuk mendapatkan nilai representatif dari enum
    public String getDisplayValue() {
        return displayValue;
    }

    // Metode fromString untuk mengonversi nilai String menjadi EOrderType
    public static Optional<EOrderType> fromString(String value) {
        for (EOrderType type : EOrderType.values()) {
            if (type.name().equalsIgnoreCase(value)) {
                return Optional.of(type);
            }
        }
        return Optional.empty();
    }
}
