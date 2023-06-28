package lesson_4_HW_3;

public class MainClassString_HW {
    public static void main(String[] args) {
        //Part 2. Створити змінну “ Test_.  String, Test1 ,  Part2  ” і з нею зробити події.
        String testString = " Test_.  String, Test1 ,  Part2  ";
        //1. Прибрати прогалини на початку та в кінці стрінги
        System.out.println(testString.trim());
        //2. З вказаної стрінги залишити лише слово Test
        System.out.println(testString.substring(1, 5));
        //3. Розібрати данну стрінгу по комі. Пройтися по отриманим словам і  зробити перевірку – якщо перший Не порожній символ слова 't' або 'T' вивести повідомлення «Перший символ - «Т»» якщо ні – Вивести перший Непорожній символ слова.
        String task3 = testString.trim().replace(".", ",").replace(" ", "");
        String[] task3splited = task3.split(",");
        for (String s : task3splited) {
            if (s.toLowerCase().startsWith("t")) {
          //if (s.toLowerCase().charAt(0) == 't') {
                System.out.println("First symbol is \"T\"");
            } else {
                System.out.println("First symbol is \"" + s.charAt(0) + "\"");
            }
        }
        //4. Знайти першу букву 's' та замінити її на 'y'
        System.out.println(testString.replaceFirst("s", "y"));
    }
}
