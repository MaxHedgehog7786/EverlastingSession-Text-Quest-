package com.example.textquest;

public class scenaryPhase2 {
    String[] phrase = new String[]{"Вот я уже сижу в аудитории и решаю билет. Ну, вроде готов.\n-Можно сдать?","-Конечно можно! Проходите!\nО черт, это Крапов, мне пизд...","-Итак, вопрос №1: cколько информационных входов имеет дешифратор?","stop"};
    int i = -1;
    public String nextPhrase() {
        i++;
        return phrase[i];
    }
}
