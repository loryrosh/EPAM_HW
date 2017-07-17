package EPAM.lesson170717.music;

import EPAM.lesson170717.music.perc.Bangu;
import EPAM.lesson170717.music.strings.Guitar;
import EPAM.lesson170717.music.strings.Violin;
import EPAM.lesson170717.music.winds.Tuba;

import java.util.Arrays;
import java.util.List;

public class Orchestra {
    public static void main(String[] args) {
        List<Instruments> instrs = Arrays.asList(new Violin(),
                new Guitar(), new Tuba(), new Bangu());

        for (Instruments inst : instrs) {
            System.out.println("Ready to play? " + inst.isReadyToPlay());

            if (!inst.needsTechnicalSupport()) {
                inst.makeSound();
            }
            System.out.println();
        }
    }
}
