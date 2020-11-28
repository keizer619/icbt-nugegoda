package com.example.java;

public class person {
    private String firstname;
    private String lastname;

    public person() {
        //Default Constructor

        this.firstname = "";
        this.lastname = "";

    }

    public person(String firstname, String lastname) {
        //Overloading Constructor Constructor

        this.firstname = "";
        this.lastname = "";

    }


    public String getFirstname(){
        return this.firstname;
    }

    public void setFirsname(String firstname){
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}
