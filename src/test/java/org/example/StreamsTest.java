package org.example;

import org.example.model.StudentCSV;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class StreamsTest {

    @Test
    void expectSortedArray() {
        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] unsorted = new int[]{9, 1, 8, 2, 7, 3, 6, 4, 5};
        int[] sorted = Arrays.stream(unsorted).sorted().toArray();
        assertArrayEquals(expected, sorted);
    }

    @Test
    void expectSumOfNumbers() {
        int expected = 10;
        int[] numbers = new int[]{1, 2, 3, 4};
        int actual = Arrays.stream(numbers).reduce(0, Integer::sum);
        assertEquals(expected, actual);
    }

    @Test
    void expectProductOfNumbers() {
        int expected = 24;
        int[] numbers = new int[]{1, 2, 3, 4};
        int actual = Arrays.stream(numbers).reduce(1, (subtotal, element) -> subtotal * element);
        assertEquals(expected, actual);
    }

    @Test
    void expectRemovedTitle() throws IOException {
        List<String> fileContent = Files.lines(Path.of("src/main/resources/students.csv")).toList();
        List<String[]> studentStrings = fileContent.subList(1, fileContent.size() - 1).stream().map(student -> student.split(",")).toList();
        Set<StudentCSV> studentList = new HashSet<>();
        for (String[] stringArray : studentStrings) {
            if (stringArray.length > 1) {
                studentList.add(new StudentCSV(Integer.parseInt(stringArray[0]), stringArray[1], Integer.parseInt(stringArray[0]), Integer.parseInt(stringArray[0])));
            }
        }
        Set<StudentCSV> expect = new HashSet<>(Set.of(
                new StudentCSV(5, "Jan", 5, 5),
                new StudentCSV(10, "Frank", 10, 10),
                new StudentCSV(1, "Stefan", 1, 1),
                new StudentCSV(2, "Marleene", 2, 2)
        ));
        assertEquals(expect, studentList);
    }
}
