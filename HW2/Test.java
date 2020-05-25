package HW2;

public class Test {
    static int value = 0;

    public static void TestNow(String[][] array) throws MyArraySizeException, MyArrayDataException {


        if (array.length != 4) {
            throw new MyArraySizeException("Размер массива не равен 4");
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    value += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException nfe) {
                    throw new MyArrayDataException("в ячейке "+i + " "+ j+ "лежат неверные данные");
                }
            }
        }
        System.out.println("Сумма чисел = " + value);

    }

}
