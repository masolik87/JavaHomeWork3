// Создать новый список, добавить несколько строк и вывести коллекцию на экран.
// Итерация всех элементов списка цветов и добавления к каждому символа '!'.
// Вставить элемент в список в первой позиции.
// Извлечь элемент (по указанному индексу) из заданного списка.
// Обновить определенный элемент списка по заданному индексу.
// Удалить третий элемент из списка.
// Поиск элемента в списке по строке.
// Создать новый список и добавить в него несколько елементов первого списка.
// Удалить из первого списка все элементы отсутствующие во втором списке.
// *Сортировка списка.

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class HomeWork3 {
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList();
        colorList.add("White");
        colorList.add("Red");
        colorList.add("Yellow");
        colorList.add("Green");
        colorList.add("Blue");
        System.out.println(colorList + "\tСоздали новый список, добавили несколько строк и вывели коллекцию на экран.");
        ListIterator<String> newList = colorList.listIterator();
        while (newList.hasNext()) {
            newList.set(newList.next().concat("!"));
        }
        System.out.println(colorList +"\tИтерация всех элементов списка цветов и добавления к каждому символа '!'");
        colorList.add(0, "Black");
        System.out.println(colorList +"\tДобавили элемент в список в первой позиции.");
        System.out.println(colorList.get(1) +"\t Извлечение элемента по индексу");
        colorList.set(5, "Pink");
        System.out.println(colorList +"\tОбновили элемент по заданному индекску.");
        colorList.remove(2);
        System.out.println(colorList +"\tУдалили третий элемент из списка.");
        if (colorList.contains("Green!"))
            System.out.println("Yes" +"\tПоиск элемента в списке по строке.");
            else
            System.out.println("No" +"\tПоиск элемента в списке по строке.");
        ArrayList<String> listNew = new ArrayList<>();
        listNew.add(colorList.get(0));
        listNew.add(colorList.get(2));
        listNew.add(colorList.get(4));
        System.out.println(colorList);
        System.out.println(listNew +"\tСоздали новый список и добавили несколько элементов первого.");
        colorList.removeAll(listNew);
        System.out.println(colorList +"\tУдалили из первого списка все элементы отсутствующие во втором списке.");
        Collections.sort(colorList);
        System.out.println(colorList +"\tСортировка списка");
    }
}

