public class WhatToDo {
    public static void main(String[] args) {
        boolean weather = false;
        boolean isNight = true;

        if(weather && !isNight){
            System.out.println("Гулять");
    }
        if(!weather && !isNight){
            System.out.println("Читать");
        }
        if (isNight){
            System.out.println("Спать");
        }


    }
}
