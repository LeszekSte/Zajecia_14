package zadanie_3;

import java.util.Objects;

public class Custumers {
    private int id;
    private String firstName;
    private String lastName;
    private int telNumber;

    public Custumers(int id, String firstName, String lastName, int telNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telNumber = telNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(int telNumber) {
        this.telNumber = telNumber;
    }

    @Override
    public String toString() {
        return "Custumers{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", telNumber=" + telNumber +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Custumers)) return false;
        Custumers custumers = (Custumers) o;
        return getId() == custumers.getId() &&
                getTelNumber() == custumers.getTelNumber() &&
                Objects.equals(getFirstName(), custumers.getFirstName()) &&
                Objects.equals(getLastName(), custumers.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName(), getTelNumber());
    }
}

