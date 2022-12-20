// На вход приходят два ArrayList<Integer> напишите метод, который проверяет два массива на равенство.
// Нужно реализовать алгоритм, не использовать метод equals.

//boolean equal(Integer[] arr1, Integer[] arr2) {
//    if (arr1.length != arr2.length){
//        return false; // если длины разные, то массивы разные
//        }
//    Map <Integer, Integer> map = new HashMap <Integer, Integer>(); // Создаем карту и будем добавлять счетчики первого массива строк,
//            //                                                          удаляя счетчики второго массива строк
//    for (Integer num : arr1) {              // Проходим по 1 массиву
//        if (!map.containsKey(num)) {        // если элемент отсутствует
//            map.put(num, 1);                // добавляем элемент
//            }
//        else {
//            map.put(num, map.get(num) + 1); // увеличиваем счетчик на 1
//            }
//        }
//    for (Integer num : arr2) {              // Проходим по 2 массиву
//        if (!map.containsKey(num)) {        // если элемент отсутствует
//            return false;                   // значит массивы не одинаковы
//            }
//        else {
//            map.put(num, map.get(num) - 1); // уменьшаем счетчик элементов
//            }
//        }
//    for (Integer count : map.values()) {
//        if (count.intValue() != 0){
//            return false;   // при одинаковом количестве элементов счетчик равен 0,
//            }                // если нет колличество разное
//        }
//        return true;
//    }

//        На вход методу приходят два ArrayList<Integer> и целое число num.
//        Проверьте, что число num встречается в обоих массивах одинаковое кол-во раз.

//boolean equal(Integer[] arr1, Integer[] arr2, Int num) {
//     Map <Integer, Integer> map = new HashMap <Integer, Integer>(); // Создаем карту и будем добавлять счетчики первого массива строк,
//                                                                     // удаляя счетчики второго массива строк
//    for (Integer key : arr1) {              // Проходим по 1 массиву
//        if (!map.containsKey(key)) {        // если элемент отсутствует
//            map.put(key, 1);                // добавляем элемент
//            }
//        else {
//            map.put(key, map.get(key) + 1); // увеличиваем счетчик на 1
//            }
//        }
//    for (Integer key : arr2) {              // Проходим по 2 массиву
//        if (map.containsKey(key)) {        // если элемент отсутствует
//            map.put(key, map.get(key) - 1); // уменьшаем счетчик элементов
//            }
//        else {
//            return false;
//        }
//    }
//    for (Integer count : map.keySet()) {
//        if (count.intValue() == num ){
//            Integer znachenie = map.getValue(count);
//            if(znachenie != 0){           // при одинаковом количестве элементов счетчик равен 0,
//                return false;       // если нет колличество разное
//            }
//        }                // если нет колличество разное
//    }
//    return true;
//}

//_____________________________________________________________
//        На вход приходит ArrayList<Integer>. Отсортируйте в нем только четные числа. Пример: [10, 4, 5, 6, 7, 2, 2, 9] -> [2, 2, 5, 4, 7, 6, 10, 9]
//        На вход приходт ArrayList<Integer> удалите из него четные числа (на итератор)

//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<Integer> array1 = new ArrayList<Integer>();
//        array1.add(new Integer(10));
//        array1.add(new Integer(4));
//        array1.add(new Integer(5));
//        array1.add(new Integer(6));
//        array1.add(new Integer(7));
//        array1.add(new Integer(2));
//        array1.add(new Integer(2));
//        array1.add(new Integer(9));             // задаем массив
//        System.out.println(array1);
//        int count = 0;                                  // переменная позиции массива
//        for (Integer i : array1) {
//            int minCount = count;                       // переменная позиции минимального члена массива
//            if((array1.get(count) % 2) == 0) {          // если член массива четное число, то начинаем искать минимальное значение
//                int min = array1.get(count);            // переменная минимального членм массива
//                for (int j = count + 1; j < 8; j++) {   // проходим массив
//                    if (((array1.get(j) % 2) == 0) && (min > array1.get(j))) {  // если чило массива четное и меньше минимального,
//                        minCount = j;                                           // то запоминаем его позицию и
//                        min = array1.get(j);                                    // и сохраняем его значение в переменной минимум
//                    }
//
//                }
//                array1.set(minCount, array1.get(count));                        // заменяем местами текущее число массива
//                array1.set(count, min);                                         // с минимальным значением
//            }
//            count++;
//        }
//        System.out.println(array1);
//
//    }
//}
//
//_________________________________________________________
//На вход приходт ArrayList<Integer> удалите из него четные числа (на итератор)

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        array1.add(new Integer(10));
        array1.add(new Integer(4));
        array1.add(new Integer(5));
        array1.add(new Integer(6));
        array1.add(new Integer(7));
        array1.add(new Integer(2));
        array1.add(new Integer(2));
        array1.add(new Integer(9));             // задаем массив
        System.out.println(array1);
        int count = 0;
        int razmer = array1.size();                     // переменная размера массива
        while ((razmer > 0) && (count < razmer)){       // цикл до тех пор пока не удалим все четные числа
            if((array1.get(count) % 2) == 0) {          // если член массива четное число,
                array1.remove(count);                   // удаляем значение
                razmer--;                               // уменьшаем размер массива
                count = 0;                              // начинамем проход с начала массива
            }
            else {
                count++;
            }
        }
        System.out.println(array1);

    }
}