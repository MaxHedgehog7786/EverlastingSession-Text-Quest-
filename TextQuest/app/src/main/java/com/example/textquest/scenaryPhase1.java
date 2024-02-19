package com.example.textquest;

public class scenaryPhase1 {
    String[] phrases = new String[]{"-Сегодня ещё и информатика... Господи, хоть бы не попался Крапов!", "-А может *** с ним? Останусь дома, а весной пойду на пересдачу. Все равно сегодня не сдам...","stop"};
    int i = -1;
    public String nextPhrase() {
        i++;
        return phrases[i];
    }
}
