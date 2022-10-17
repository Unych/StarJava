package com.startjava.Lesson_2_3.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setName("Барсик");
        wolfOne.setGender('М');
        wolfOne.setColor("Белый");
        wolfOne.setAge(8);
        wolfOne.setWight(96.6);
        System.out.println("Имя волка " + wolfOne.getName() + "\nВозраст " + wolfOne.getAge()
                + "\nПол " + wolfOne.getGender() + "\nЦвет волка " + wolfOne.getColor() + "\nВес " + 
                wolfOne.getColor());

    }
}