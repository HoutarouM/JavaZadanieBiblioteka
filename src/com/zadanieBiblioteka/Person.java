package com.zadanieBiblioteka;

public abstract class Person {
    private String name;
    private String lastname;
    private String dateOfBirth;

    public Person() {
    }

    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public Person(String name, String lastname, String dateOfBirth) {
        this.name = name;
        this.lastname = lastname;

        if (DateValidator.validate(dateOfBirth) == true) {
            this.dateOfBirth = dateOfBirth;
        } else {
            throw new RuntimeException("Date must be dd.mm.YYYY");
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "name= " + name + '\n' +
                "lastname= " + lastname + '\n' +
                "dateOfBirth= " + dateOfBirth;
    }
}
