package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField {

//    private int id;
//    private static int nextId = 1;
//    private String value;

    public PositionType(String value) {
        super(value);
//        id = nextId;
//        nextId++;
    }

//    public PositionType(String value) {
//        this();
//        this.value = value;
//    }

    // Custom toString() that returns value
//    @Override
//    public String toString() {
//        return value;
//    }

    // Equals and HashCode Methods -double check if the Equals object is correct

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PositionType positionType = (PositionType) o;
        return getId() == positionType.getId();
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }


    // Getters and Setters:

//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }

}
