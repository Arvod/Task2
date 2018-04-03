package com.company;

import java.util.Arrays;

public class Employee extends Human  {
  private IdCard card;
  private String position;
  private WorkShift workShift;
  private Room[] room;
  private Department department;

  public Employee(String name, String surname, Sex pol, WorkShift workShift, IdCard card, String position, Room[] room, Department department) {
    super(name, surname, pol);
    this.workShift = workShift;
    this.card = card;
    this.position = position;
    this.room = room;
    this.department = department;
  }

  public Employee(String name, String surname, Sex pol, WorkShift workShift, IdCard card, String position) {
    super(name, surname, pol);
    this.workShift = workShift;
    this.card = card;
    this.position = position;
  }

  public IdCard getCard() {
    return card;
  }

  public String getPosition() {
    return position;
  }

  public WorkShift getWorkShift() {
    return workShift;
  }

  public Room[] getRoom() {
    return room;
  }

  public Department getDepartment() {
    return department;
  }

  public void setCard(IdCard card) {
    this.card = card;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public void setWorkShift(WorkShift workShift) {
    this.workShift = workShift;
  }

  public void setRoom(Room[] room) {
    this.room = room;
  }

  public void setRoom(Room room){
    this.room[this.room.length] = room;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  @Override
  public String toString() {
    return "Employee{" +
            "card=" + card.toString() +
            ", position='" + position + '\'' +
            ", workShift=" + workShift +
            ", room=" + Arrays.toString(room) +
            ", department=" + department.toString() +
            ", name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", pol=" + pol +
            '}';
  }

  public void doSomething() {
    System.out.println("To work hard");
  }

  public void TimeToSleep(){
    System.out.println("Do not sleep on " + workShift + " shift, because you're at work");
  }
}
