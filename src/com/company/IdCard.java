package com.company;

public class IdCard {
  private int number;
  private String dateExpire;

  public IdCard(int number) {
    this.number = number;
  }
  public IdCard(int number, String dateExpire) {
    this.number = number;
    this.dateExpire = dateExpire;
  }

  public int getNumber() {
    return number;
  }

  public String getDateExpire() {
    return dateExpire;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public void setDateExpire(String dateExpire) {
    this.dateExpire = dateExpire;
  }

  public void getValidDate(){
    System.out.println("The certificate is valid until" + dateExpire);
  }

  @Override
  public String toString() {
    return "IdCard{" +
            "number=" + number +
            ", The certificate is valid until='" + dateExpire + '\'' +
            '}';
  }
}