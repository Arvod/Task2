package com.company;

public abstract class Human implements Sleeping {
  protected String name;
  protected String surname;
  protected Sex pol;

  public Human(String name, String surname, Sex pol) {
    this.name = name;
    this.surname = surname;
    this.pol = pol;
  }

  public String getName() {
    return name;
  }
  public String getSurname() {
    return surname;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setSurname(String surname) {
    this.surname = surname;
  }

  public abstract void doSomething();
}