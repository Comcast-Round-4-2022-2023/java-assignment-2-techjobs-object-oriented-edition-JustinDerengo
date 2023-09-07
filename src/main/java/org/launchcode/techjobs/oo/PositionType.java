package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField{

    public PositionType(String value) {
        super(value);
    }

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PositionType that = (PositionType) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getValue());
    }


    // Getters and Setters:


}
