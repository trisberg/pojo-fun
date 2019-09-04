package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlatformEvent {

    private String first;

    private String last;

    public String getFirst() {
        return first;
    }

    @JsonProperty("LastName")
    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    @Override
    public String toString() {
        return "PlatformEvent [first=" + first + ", last=" + last + "]";
    }
}
