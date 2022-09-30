package com.zadanieBiblioteka;

public final class Librarian extends Person {
    private String dateOfEmployment;

    public Librarian(String name, String lastname, String dateOfEmployment) {
        super(name, lastname);

        if (DateValidator.validate(dateOfEmployment) == true) {
            this.dateOfEmployment = dateOfEmployment;
        } else {
            System.out.println("Date must be dd.mm.YYYY");
        }
    }

    public Librarian(String name, String lastname, String dateOfBirth, String dateOfEmployment) {
        super(name, lastname, dateOfBirth);

        if (DateValidator.validate(dateOfEmployment) == true) {
            this.dateOfEmployment = dateOfEmployment;
        } else {
            System.out.println("Date must be dd.mm.YYYY");
        }
    }

    public String getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(String dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    @Override
    public String toString() {
        return "name= " + this.getName() + '\n' +
                "lastname= " + this.getLastname() + '\n' +
                "dateOfBirth= " + this.getDateOfBirth() + '\n' +
                "dateOfEmployment= " + dateOfEmployment;
    }
}
