package com.itacademy.hometask9;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {

// 2 task
        FuncInterface<Integer> multiple = (x) -> x * x;
        System.out.println("Amount:\n" + multiple.doSmth(2) + "\n");

// 3 task
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(20);
        arrayList.add(3);
        arrayList.add(41);
        List<Integer> integerStream = arrayList.stream()
                .map(a -> a + 1)
                .filter(a -> a % 2 == 0)
                .sorted()
                .collect(Collectors.toList());

        arrayList.forEach(System.out::println);

        long integerStream2 = arrayList.stream().count();
        System.out.println("Count:\n" + integerStream2);

// 1 task
        File file = new File("text");
        File file2 = new File("text2");

        Map<String, Integer> hashMap = new HashMap<>();

        FileReader fileReader = new FileReader(file);
        Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                line = line.replaceAll("[^a-zA-Z0-9]", " ").toLowerCase();
                String[] words = line.split(" ");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        hashMap.put(word, hashMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        scanner.close();

        String fileWriter = "";
        for (Map.Entry<String, Integer> word : hashMap.entrySet()){
            fileWriter += word.getKey() + " : " + word.getValue() + "\n";
        }
        FileUtils.write(new File(String.valueOf(file2)), fileWriter);
    }
}
