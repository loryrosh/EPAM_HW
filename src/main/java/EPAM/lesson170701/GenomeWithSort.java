package EPAM.lesson170701;

import EPAM.lesson170629.hw.SequenceGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GenomeWithSort {
    private static final int GENOME_SIZE = 30; //300000;
    private static final int WORD_SIZE = 5;

    static class Word implements Comparable<Word> {
        byte[] data; // ссылка на данные
        int offset; // позиция, где находится нужный фрагмент

        public Word(byte[] data, int offset) {
            this.data = data;
            this.offset = offset;
        }

        @Override
        public int compareTo(Word otherWord) {
            for (int i = 0; i < WORD_SIZE; i++) {
                int diff = data[offset + i] - data[otherWord.offset + i];
                if (diff != 0) {
                    return diff;
                }
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        byte[] data = SequenceGenerator.generate(GENOME_SIZE);

        List<Word> list = new ArrayList<>();

        // если передаем массив байт, будет дублирование - потребуется излишнее кол-во памяти
        /*
        for (int i = 0; i < data.length - WORD_SIZE; i++) {
            list.add(new String());
        }
        */

        // заносим в список все слова длины WORD_SIZE
        for (int i = 0; i < data.length - WORD_SIZE; i++) {
            list.add(new Word(data, i));
        }

        Collections.sort(list);
        for (Word word : list) {
            byte[] wordBytes = Arrays.copyOfRange(data, word.offset, word.offset + WORD_SIZE);
            //System.out.println(Arrays.toString(wordBytes));

            for (byte letter : wordBytes) {
                System.out.print((char) letter);
            }
            System.out.println();
        }
    }
}

// добавить счетчик
// сделать вариант с HashTable (HashSet)
// подсчитать скорость работы