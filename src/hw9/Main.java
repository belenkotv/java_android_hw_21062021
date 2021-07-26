package hw9;

public class Main {
    static int Size = 4;

    public static void main(String[] args) {

        String[][] arr = {
                {"39", "136", "98", "6","89"},
                {"92", "73", "7", "68"},
                {"76", "27", "98", "657"},
                {"90", "3", "72", "123u"}
        };
        try {
            System.out.println(sum(arr));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            System.out.println(e.getRow() + " " + e.getCol());
            System.out.println(arr[e.getRow()][e.getCol()]);
        }
        System.out.println("end");


    }

    static int sum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != Size) {
            throw new MyArraySizeException("format is out of Size");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != Size) {
                throw new MyArraySizeException("format is out of Size");
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("format " + i + " " + j, i, j);
                }
            }

        }
        return sum;
    }
}
