package lesson_4;


public class MainClassString {
    public static void main(String[] args) {
        String testString = " Test_. String, Test1, Part2 ";
        String testString2 = new String(" Test_. String, Test1, Part2 ");
        String testString3 = " Test_. String, Test1, Part2 ";
// 111 TestString
// 222 Test
        System.out.println(testString);
        System.out.println(testString3);
        testString = "Changed text. Test";
        System.out.println(testString);
        System.out.println(testString3);
        String var = "Changed text. Test";

        System.out.println("------");
        System.out.println(testString3.toUpperCase());
        System.out.println(testString3.toLowerCase());
        System.out.println(testString3);

        String str = "test";
        String str2 = new String("test");
        if (str == str2) {
            System.out.println("Equals " + str2);
        } else {
            System.out.println("Not equals " + str2);
        }
        if (str.equals(str2)) {
            System.out.println("Equals " + str2);
        } else {
            System.out.println("Not equals " + str2);
        }
        boolean eq = "Test".equals("test");
        System.out.println(eq);
        "Test".equalsIgnoreCase("test");
        "Test".toLowerCase().equalsIgnoreCase("test");

        String ourString = "  Test test  ".trim();
        System.out.println(ourString);
        String[] words = ourString.split(" ");
        System.out.println("Number of words " + words.length);
        System.out.println("Number of words " + "  Test test  ".trim().split(" ").length);
        System.out.println("   Space text   ".replace(" ", ""));

        String varString = "  test, ,test1\",test2 ";

        String[] wordsMassive =
                varString.trim().replace(" ", "").replace("\"", "").split(",");
        for (int i = 0; i < wordsMassive.length; i++) {
            if (wordsMassive[i].length() != 0)
            {
                System.out.println(wordsMassive[i]);
            }
        }







    }
}
