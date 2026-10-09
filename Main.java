public class Main {
    
    public static void main(String[] args) {
        Main program = new Main();

        System.out.println("ЛАБОРАТОРНАЯ РАБОТА №1, ВАРИАНТ 1");

        // Задание 1 Методы
        System.out.println("\n=== Задание 1. Методы ===");

        System.out.println("Дробная часть числа 5.25: " + program.fraction(5.25));
        System.out.println("Сумма двух последних цифр числа 4568: " + program.sumLastNums(4568));
        System.out.println("Преобразование символа '3': " + program.charToNum('3'));
        System.out.println("Число 3 положительное: " + program.isPositive(3));
        System.out.println("Число -5 положительное: " + program.isPositive(-5));
        System.out.println("Число 32 двузначное: " + program.is2Digits(32));
        System.out.println("Число 516 двузначное: " + program.is2Digits(516));

        // Задание 2. Условия
        System.out.println("\n=== Задание 2. Условия ===");

        System.out.println("Модуль числа -3: " + program.abs(-3));
        System.out.println("Деление 5 на 0: " + program.safeDiv(5, 0));
        System.out.println("Деление 8 на 2: " + program.safeDiv(8, 2));
        System.out.println("Проверка числа 5: " + program.is35(5));
        System.out.println("Проверка числа 15: " + program.is35(15));
        System.out.println("Сравнение 5 и 7: " + program.makeDecision(5, 7));
        System.out.println("Наибольшее из чисел 5, 7, 7: " + program.max3(5, 7, 7));

        // Задание 3. Циклы
        System.out.println("\n=== Задание 3. Циклы ===");

        System.out.println("Последовательность до 5: " + program.listNums(5));
        System.out.println("Обратная последовательность до 5: " + program.reverseListNums(5));
        System.out.println("Чётные числа до 9: " + program.chet(9));
        System.out.println("Число 2 в степени 5: " + program.pow(2, 5));
        System.out.println("Количество цифр в числе 12567: " + program.numLen(12567));

        // Задание 4. Массивы
        System.out.println("\n=== Задание 4. Массивы ===");

        int[] numbers = {1, 2, 3, 4, 2, 2, 5};
        int[] signedNumbers = {1, -2, -7, 4, 2, 2, 5};
        int[] baseArray = {1, 2, 3, 4, 5};
        int[] insertedArray = {7, 8, 9};

        System.out.println("Индекс первого числа 2: " + program.findFirst(numbers, 2));
        System.out.println("Индекс последнего числа 2: " + program.findLast(numbers, 2));
        System.out.println("Элемент с наибольшим модулем: " + program.maxAbs(signedNumbers));

        System.out.print("Массив после добавления числа 9: ");
        program.printArray(program.add(baseArray, 9, 3));

        System.out.print("Массив после вставки [7, 8, 9]: ");
        program.printArray(program.add(baseArray, insertedArray, 3));
    }


    public double fraction(double x) {
        return x - (int) x;
    }

    public int sumLastNums(int x) {
        x = abs(x);
        return x % 10 + (x / 10) % 10;
    }

    public int charToNum(char x) {
        return x - '0';
    }

    public boolean isPositive(int x) {
        return x > 0;
    }

    public boolean is2Digits(int x) {
        x = abs(x);
        return x >= 10 && x <= 99;
    }


    public int abs(int x) {
        return x < 0 ? -x : x;
    }

    public double safeDiv(int x, int y) {
        if (y == 0) {
            return 0;
        }
        return (double) x / y;
    }

    public boolean is35(int x) {
        boolean divisibleBy3 = x % 3 == 0;
        boolean divisibleBy5 = x % 5 == 0;

        return (divisibleBy3 || divisibleBy5)
                && !(divisibleBy3 && divisibleBy5);
    }

    public String makeDecision(int x, int y) {
        if (x > y) {
            return x + " > " + y;
        }
        if (x < y) {
            return x + " < " + y;
        }
        return x + " == " + y;
    }

    public int max3(int x, int y, int z) {
        int result = x;

        if (y > result) {
            result = y;
        }
        if (z > result) {
            result = z;
        }

        return result;
    }


    public String listNums(int x) {
        String result = "";

        for (int i = 0; i <= x; i++) {
            result += i + " ";
        }

        return result;
    }

    public String reverseListNums(int x) {
        String result = "";

        for (int i = x; i >= 0; i--) {
            result += i + " ";
        }

        return result;
    }

    public String chet(int x) {
        String result = "";

        for (int i = 0; i <= x; i += 2) {
            result += i + " ";
        }

        return result;
    }

    public int pow(int x, int y) {
        int result = 1;

        for (int i = 0; i < y; i++) {
            result *= x;
        }

        return result;
    }

    public int numLen(long x) {
        if (x == 0) {
            return 1;
        }

        x = x < 0 ? -x : x;
        int length = 0;

        while (x > 0) {
            length++;
            x /= 10;
        }

        return length;
    }


    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }

        return -1;
    }

    public int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }

        return -1;
    }

    public int maxAbs(int[] arr) {
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (abs(arr[i]) > abs(result)) {
                result = arr[i];
            }
        }

        return result;
    }

    public int[] add(int[] arr, int x, int pos) {
        int[] result = new int[arr.length + 1];

        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }

        result[pos] = x;

        for (int i = pos; i < arr.length; i++) {
            result[i + 1] = arr[i];
        }

        return result;
    }

    public int[] add(int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length];

        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }

        for (int i = 0; i < ins.length; i++) {
            result[pos + i] = ins[i];
        }

        for (int i = pos; i < arr.length; i++) {
            result[ins.length + i] = arr[i];
        }

        return result;
    }

    // Вывод

    private void printArray(int[] arr) {
        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}
