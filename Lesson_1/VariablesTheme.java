public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("Задача №1 Создание переменных и вывод их значений на консоль\n");
        byte core = 2;
        short ram = 16;
        int type = 64;
        long video = 5600;
        float assembling = 10.1f;
        double boardModel = 161216.34;
        char nameSystem = 'L';
        boolean safety = true;
        System.out.println("Кол-во ядер = " + core);
        System.out.println("Кол-во ОЗУ = " + ram);
        System.out.println("Разрядность процессора = " + type);
        System.out.println("Модель видеокарты = " + video);
        System.out.println("Номер сборки ОС = " + assembling);
        System.out.println("Модель платы = " + boardModel);
        System.out.println("Символ производителя = " + nameSystem);
        System.out.println("Безопасность включена = " + safety + "\n");

        System.out.println("Задача №2 Расчет стоимости товара со скидкой\n");
        int penPrice = 100;
        int bookPrice = 200;
        double discount = 0.11;
        int sum = penPrice + bookPrice;
        double discountPrice = sum - (sum * discount);
        System.out.println("Cумма скидки = " + (sum - discountPrice));
        System.out.println("Общая стоимость товара со скидкой = " + discountPrice + "\n");

        System.out.println("Задача №3 Вывод на консоль слова JAVA\n");
        System.out.println("   J    a  v     v  a    ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa  ");
        System.out.println(" JJ  a     a  V  a     a "  + "\n");

        System.out.println("Задача №4 Отображение min и max значений числовых типов данных\n");
        byte byteNum = 127;
        short shortNum  = 32_767;
        int intNum = 2_147_483_647;
        long longNum = 1_222_334_455;
        System.out.println("Первоначальное byte = " + byteNum);
        System.out.println("значение после инкремента byte = " + ++byteNum);
        System.out.println("значение после декремента byte = " + --byteNum + "\n");
        System.out.println("Первоначальное short = " + shortNum);
        System.out.println("значение после инкремента short = " + ++shortNum);
        System.out.println("значение после декремента short = " + --shortNum + "\n");
        System.out.println("Первоначальное int = " + intNum);
        System.out.println("значение после инкремента int = " + ++intNum);
        System.out.println("значение после декремента int = " + --intNum + "\n");
        System.out.println("Первоначальное long = " + longNum);
        System.out.println("значение после инкремента long = " + ++longNum);
        System.out.println("значение после декремента long = " + --longNum + "\n");

        System.out.println("Задача №5 Перестановка значений переменных\n");
        int num1 = 2;
        int num2 = 5;
        System.out.println("Исходные значение переменных = " + num1 + " и " + num2);
        int tmp = num2;
        num2 = num1;
        num1 = tmp;
        System.out.println("перестановка значений с помощью третьей переменной = " + num1 + " и " 
                + num2);
        num1 = num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println ("перестановка значений с помощью арифметических операций = " + num1 + " и " 
                + num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("перестановка значений с помощью побитовой операции ^ = " + num1 + " и "
                + num2  + "\n");

        System.out.println("Задача №6 Вывод символов и их кодов\n");
        char symbol1 = '#';
        char symbol2 = '&';
        char symbol3 = '@';
        char symbol4 = '^';
        char symbol5 = '_'; 
        System.out.println((int) symbol1 + " - " + symbol1);
        System.out.println((int) symbol2 + " - " + symbol2);
        System.out.println((int) symbol3 + " - " + symbol3);
        System.out.println((int) symbol4 + " - " + symbol4);
        System.out.println((int) symbol5 + " - " + symbol5 + "\n");

        System.out.println("Задача №7 Отображение количества сотен, десятков и единиц числа\n");
        int num = 123;
        int x = num / 100;
        int y = (num / 10) % 10;
        int z = num % 10;
        System.out.println("Число 123 содержит: " + x + " сотен");
        System.out.println("Число 123 содержит: " + y + " десятка");
        System.out.println("Число 123 содержит: " + z + " единиц"  + "\n");

        System.out.println("Задача №8 Вывод на консоль ASCII-арт Дюка\n");
        char space = ' ';
        char slash = '/';
        char backslash = '\\';
        char lower = '_';
        char bracket1 = '(';
        char bracket2 = ')';
        System.out.println("" + space + space + space + space + slash + backslash + space + space +
                space + space);
        System.out.println("" + space + space + space + slash + space + space + backslash 
                + space + space + space);
        System.out.println("" + space + space + slash + lower + bracket1
                + space + bracket2 + backslash + space + space);
        System.out.println("" + space + slash + space + space + space + space + space
                + space + backslash + space);
        System.out.println("" + slash + lower + lower + lower + lower + slash
                + backslash + lower + lower + backslash  + "\n");

        System.out.println("Задача №9 Произведение и сумма цифр числа\n");
        int srcNum  = 345;
        int unitsSrcNum = srcNum % 10;
        int dozenSrcNum  = (srcNum / 10) % 10;
        int hundredsSrcNum  = srcNum / 100;
        int sumDigits = unitsSrcNum + dozenSrcNum + hundredsSrcNum;
        System.out.println("сумма цифр числа 345 = " + sumDigits);
        System.out.println("произведение цифр числа 345 = " + unitsSrcNum * dozenSrcNum * hundredsSrcNum + "\n");

        System.out.println("Задача №10 Преобразование секунд\n");
        long seconds = 86399;
        long hour = seconds / 3600;
        long min = seconds / 60 % 60;
        long sec = seconds % 60;
        System.out.println(hour + ":" + min + ":" + sec);

    }
}
