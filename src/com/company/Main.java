package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            Human director = new Director("Artem", "Kvithchenko", Sex.MALE);
            System.out.println(director);
            director.TimeToSleep();
            IdCard card = new IdCard(123, "2015-12-31");
            System.out.println("The certificate is valid until" + card.getDateExpire());
            Room[] rooms = {new Room(1), new Room(3), new Room(4)};
            Employee[] mas = new Employee[3];
            for (int i = 0; i < mas.length; i++) {
                mas[i] = new Employee("Porter" + i, "Porterov" + i, Sex.MALE, WorkShift.FIRST, new IdCard(1 + i, "2015-12-31"), "Porter", rooms, new Department("Otdel " + (1 + i)));
            }
            for (Employee i : mas) {
                System.out.println(i);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
