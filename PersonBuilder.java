package com.company.People;

public class PersonBuilder {

    protected String name;
    protected String surname;
    protected int age;
    protected String address;


    public PersonBuilder setName(final String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(final String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if(this.name == null || this.surname == null){
            throw new IllegalStateException();
        }
        return new Person(this);
    }
}