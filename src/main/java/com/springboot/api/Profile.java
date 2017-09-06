package com.springboot.api;

import java.io.Serializable;
import java.util.Objects;

public class Profile implements Serializable {
    
    private final int id;
    private final String firstName;
    private final String lastName;
    private final Role role;

    public Profile(int id , String firstName, String lastName, Role role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public Profile() {
        this.id = 0;
        this.firstName = "";
        this.lastName = "";
        this.role = Role.NOT_SET;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Role getRole() {
        return this.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.firstName, this.lastName, this.role);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Profile other = (Profile) obj;
        return Objects.equals(this.id, other.id) &&
                Objects.equals(this.firstName, other.firstName) &&
                Objects.equals(this.lastName, other.lastName) &&
                Objects.equals(this.role, other.role);
    }

    @Override
    public String toString() {
        return "Profile{id=" + this.id + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", role=" + this.role + '}';
    }
    
}
