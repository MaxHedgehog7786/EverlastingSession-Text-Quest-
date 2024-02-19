package com.example.textquest;

public class winScenary {
    String[] s = new String[]{"Вдруг что-то произошло... Все стало размываться и исчезать из виду...","Передо мной появились часы, которые показывали 3:42. Похоже, все это был лишь сон, а экзамен ждет меня впереди...","stop"};
    int i = -1;
    public String next(){
        i++;
        return s[i];
    }
}
