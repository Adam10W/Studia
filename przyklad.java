class przyklad {
    public static void main(String[] args) {
        String x = "Hello, World!";
        String y;

        y = "Lorem";

        int integerValue = 6;
        double doubleValue = 3.14;

        enum Colors {
            RED, BLUE, GREEN
        }
        ;
        Colors myFavourtieColors = Colors.BLUE;

        int[] numbers = { 1, 2, 3, 4 };
        String[] words = { "a", "b", "c" };

        if (integerValue > 5) {
            System.out.println(x);
            System.out.println(y);
            System.out.println(myFavourtieColors);

            int firstnumber = numbers[0];

            System.out.println(numbers[1] + firstnumber);
            System.out.println(numbers[2] - numbers[0]);
            System.out.println(numbers[3] / numbers[1]);
            System.out.println(numbers[1] * numbers[3]);

        } else {
            System.out.println(integerValue);
            System.out.println(doubleValue);

            String LastLetter = words[2];

            System.out.println(LastLetter);
        }
    }
}