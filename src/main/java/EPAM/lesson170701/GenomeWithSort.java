package EPAM.lesson170701;

import EPAM.lesson170629.hw.SequenceGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GenomeWithSort {
    private static final int GENOME_SIZE = 300;//300000;
    private static final int WORD_SIZE = 2;

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
        SequenceGenerator.printOut();

        List<Word> list = populateList(data);
        int count = getStats(list, data);

        System.out.println(count);
        System.out.println("Resulting time in milliseconds: " + SequenceGenerator.calcTime());
    }

    private static int getStats(List<Word> list, byte[] data) {
        Word curWord = list.get(0);
        int count = 0;
        boolean counted = false;

        for (int i = 1; i < list.size(); i++) {
            Word word = list.get(i);

            if (word.compareTo(curWord) != 0) {
                curWord = word;
                counted = false;
            } else {
                if (!counted) {
                    count++;
                    printWord(data, word);
                }
                counted = true;
            }
        }
        return count;
    }

    private static void printWord(byte[] data, Word word) {
        byte[] wordBytes = Arrays.copyOfRange(data, word.offset, word.offset + WORD_SIZE);

        for (byte letter : wordBytes) {
            System.out.print((char) letter);
        }
        System.out.println();
    }

    private static List<Word> populateList(byte[] data) {
        // заносим в список все слова длины WORD_SIZE
        List<Word> list = new ArrayList<>();
        for (int i = 0; i < data.length - WORD_SIZE + 1; i++) {
            list.add(new Word(data, i));
        }

        Collections.sort(list);
        return list;
    }
}

// добавить счетчик +
// сделать вариант с HashTable (HashSet) +
// подсчитать скорость работы +
