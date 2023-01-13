package org.arkham.examples.configure.mdb1.model;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.stream.Stream;

/**
 * @author Ing. Jose Antonio Hernandez
 * @version 1.0
 */
public enum Category {

    DAIRY("dairy"),

    DRINKS("drinks"),

    GROCERY("grocer"),

    CANNED_FOOD("canned food");

    public final String label;

    Category(String label) {
        this.label = label;
    }

    /**
     * Look up Element2 instances by the label field. This implementation iterates through
     * the values() list to find the label.
     * @param label The label to look up
     * @return The Category instance with the label, or null if not found.
     */
    public static Category valueOfLabel(String label) {
        for (Category e2 : values()) {
            if (e2.label.equals(label)) {
                return e2;
            }
        }
        return null;
    }

    /**
     * Override the toString() method to return the label instead of the declared name.
     * @return
     */
    @Override
    public String toString() {
        return this.label;
    }
}
