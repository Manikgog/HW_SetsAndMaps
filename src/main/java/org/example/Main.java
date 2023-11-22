package org.example;

import java.util.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(7, 1, 1, 2, 3, 4, 4, 5, 5, 6));
        String jack = "Вот дом, Который построил Джек. А это пшеница, Которая в темном чулане хранится В доме, Который построил\n" +
                "Джек. А это веселая птица-синица, Которая часто ворует пшеницу, Которая в тёмном чулане хранится В доме,\n" +
                "Который построил Джек.";
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));

        printOdd(nums);
        printEvenAcending(nums);
        printUniqueWords(jack);
        printNumbersOfCopy(strings);
    }

    /*
    Задание 1
    Напишите код, с помощью которого можно напечатать только нечетные числа в консоль.
    Код должен работать с любой последовательностью и объемом списка чисел.
    */
    public static void printOdd(List<Integer> nums){
        List<Integer> oddNumbs = new ArrayList<>();
        for (Integer item : nums) {
            if(item%2 != 0){
                oddNumbs.add(item);
            }
        }
        System.out.println(oddNumbs);
    }

    /*
    Задание 2
    Напишите код, с помощью которого можно напечатать только четные числа без повторений в
    порядке возрастания. Код должен работать с любой последовательностью и объемом списка чисел.
    */
    public static void printEvenAcending(List<Integer> nums){
        Set<Integer> ascendingNums = new HashSet<>();
        for (Integer item :
             nums) {
            if(item%2 == 0){
                ascendingNums.add(item);
            }
        }
        System.out.println(ascendingNums);
    }

    /*
    Напишите код, который выводит в консоль все уникальные слова из списка слов,
    в котором могут встречаться дубли. Код должен работать с любой последовательностью
    и объемом списка слов.
    */
    public static void printUniqueWords(String str){
        List<String> wordsList = convertToWords(str);
        Set<String> uniqueWords = new HashSet<>(wordsList);
        System.out.println(uniqueWords);
    }

    /*
    Задание 4
    Напишите код, который выводит в консоль количество дублей для каждого уникального слова.
    Код должен работать с любой последовательностью и объемом списка слов.
    */
    public static void printNumbersOfCopy(List<String> strList){
        int count = 0;
        Set<String> setList = new HashSet<>(strList);
        for(String item : setList){
            for(String word : strList){
                if(item.equals(word)){
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
        }
    }

    public static List<String> convertToWords(String str){
        Pattern pat = Pattern.compile("[ ,.\n]");
        String[] words = pat.split(str);
        List<String> wordsList = new ArrayList<>();
        for(int i = 0; i < words.length; i++) {
            if(!words[i].equals("")){
                wordsList.add(words[i]);
            }
        }
        return wordsList;
    }




}