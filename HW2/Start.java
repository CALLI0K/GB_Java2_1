package HW2;

public class Start {


    public static void main(String[] args) throws MyArrayDataException, MyArraySizeException {
        String[][] array = new String[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = String.valueOf(i + j);
            }
        }
//        array[1][1] = "мяч";

        Test.TestNow(array);

    }
}
