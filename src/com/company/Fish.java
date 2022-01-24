package com.company;

public class Fish extends Pet {

    public String say(String something) {
        String talkFish = "hello " + something;
        return talkFish;
    }

    int currentDepth = 0;

    public int dive(int howDeep) {
        currentDepth = currentDepth + howDeep;
        if (currentDepth > 100) {
            System.out.println("Я маленькая рыбка " +
                    " и не могу плавать глубже 100 метров");
            currentDepth = currentDepth - howDeep;
        }else{
            System.out.println("Погружаюсь ещё на " + howDeep +
                    " метров");
            System.out.println("Я на глубине " + currentDepth +
                    " метров");
        }
//        System.out.println("Ныряю на глубину" + howDeep + "футов");
//        System.out.println("Я на глубине " + currentDepth + "футов ниже уровня моря");
        return currentDepth;

    }

}

