package com.example;

public class Civic extends Car {
    private boolean locked;
    private boolean checkEngineLight;
    private int radioLockCode;

    public Civic(String steering, int speed, boolean changingGears, int doors, int wheels, String engine, boolean locked, boolean checkEngineLight, int radioLockCode) {
        super(steering, speed, changingGears, doors, wheels, engine);
        this.locked = locked;
        this.checkEngineLight = checkEngineLight;
        this.radioLockCode = radioLockCode;
    }

    public boolean isLocked() {
        System.out.println(locked);
        return locked;
    }

    public boolean isCheckEngineLight() {
        System.out.println(checkEngineLight);
        return checkEngineLight;
    }

    public int getRadioLockCode() {
        System.out.println(radioLockCode);
        return radioLockCode;
    }
}
