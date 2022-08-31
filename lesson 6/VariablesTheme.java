public class VariablesTheme {

    public static void main(String[] args) {
      byte yadro = 2;
      short ozu = 16;
      int tip = 64;
      long video = 5600;
      float sborka = 10.1f;
      double model_platy = 161216.34;
      char name_system = 'L';
      boolean safety = true;
    System.out.println ("Задача №1\n");
    System.out.println ("Кол-во ядер = " + yadro);
    System.out.println ("Кол-во ОЗУ = " + ozu);
    System.out.println ("Разрядность процессора = " + tip);
    System.out.println ("Модель видеокарты = " + video);
    System.out.println ("Номер сборки ОС = " + sborka);
    System.out.println ("Модель платы = " + model_platy);
    System.out.println ("Символ производителя = " + name_system);
    System.out.println ("Безопасность включена = " + safety);
    System.out.println ();

    int pen = 100;
    int book = 200;
    double dick = 0.11;
    int sum = pen + book;
    double sum_disk = sum * dick;
    double sum_tovar_disk = sum - sum_disk;
    System.out.println ("Задача №2\n");
    System.out.println ("Cумма скидки = " + sum_disk);
    System.out.println ("Общая стоимость товара со скидкой = " + sum_tovar_disk);
    System.out.println ();

    System.out.println ("Задача №3\n");
    System.out.println ("   J    a  v     v  a    ");
    System.out.println ("   J   a a  v   v  a a  ");
    System.out.println ("J  J  aaaaa  V V  aaaaa  ");
    System.out.println (" JJ  a     a  V  a     a ");
    System.out.println ();

    byte bite = 127;
    short shorts = 32_767;
    int interger = 2_147_483_647;
    long longs = 1_222_334_455;
    System.out.println ("Задача №4\n");
    System.out.println ("Первоначальное byte = " + bite);
    bite ++;
    System.out.println ("значение после инкремента byte = " + bite);
    bite --;
    System.out.println ("значение после декремента byte = " + bite);
    System.out.println ();
    System.out.println ("Первоначальное short = " + shorts);
    shorts ++;
    System.out.println ("значение после инкремента short = " + shorts);
    shorts --;
    System.out.println ("значение после декремента short = " + shorts);
    System.out.println ();
    System.out.println ("Первоначальное int = " + interger);
    interger ++;
    System.out.println ("значение после инкремента int = " + interger);
    interger --;
    System.out.println ("значение после декремента int = " + interger);
    System.out.println ();
    System.out.println ("Первоначальное long = " + longs);
    longs ++;
    System.out.println ("значение после инкремента long = " + longs);
    longs --;
    System.out.println ("значение после декремента long = " + longs);
    System.out.println ();

    int znach1 = 2;
    int znach2 = 5;
    System.out.println ("Задача №5\n");
    System.out.println ("Исходные значение переменных= " + znach1 + "," + znach2);
    int znach3 = znach1;
    znach1 = znach2;
    znach2 = znach3;
    System.out.println ("перестановка значений с помощью третьей переменной= " + znach1 + "," + znach2);
    znach1 = znach1 + znach2 - znach2;
    System.out.println ("перестановка значений с помощью арифметиеской операций= " + znach1 + "," + znach2);
    znach1 = znach1 ^ znach2;
    znach1 = znach2 ^ znach1;
    System.out.println ("перестановка значений с помощью побитовой операции ^ = " + znach1 + "," + znach2);
    System.out.println ();

    char simvol1 = 35;
    char simvol2 = 38;
    char simvol3 = 64;
    char simvol4 = 94;
    char simvol5 = 95; 
    int sivol1_pre = (char)simvol1;
    int sivol2_pre = (char)simvol2;
    int sivol3_pre = (char)simvol3;
    int sivol4_pre = (char)simvol4;
    int sivol5_pre = (char)simvol5;
    System.out.println ("Задача №6\n");
    System.out.println (sivol1_pre + " - " + (char) simvol1);
    System.out.println (sivol2_pre + " - " + (char) simvol2);
    System.out.println (sivol3_pre + " - " + (char) simvol3);
    System.out.println (sivol4_pre + " - " + (char) simvol4);
    System.out.println (sivol5_pre + " - " + (char) simvol5);
    System.out.println ();

    int n = 123;
    int x = n / 100;
    int y = n / 10;
    int z = n % 10;
    System.out.println ("Задача №7\n");
    System.out.println ("Число N содержит: " + x + " сотен");
    System.out.println ("Число N содержит: " + y + " десятков");
    System.out.println ("Число N содержит: " + z + " единиц");
    System.out.println ();

    char nul = 0;
    char cherta = 47;
    char cherta2 = 92;
    char niz = 95;
    char skobka_left = 40;
    char skobka_right = 41;
    System.out.println ("Задача №8\n");
    System.out.println (nul + "" + nul + "" + nul + "" + nul + "" + cherta + "" + cherta2 + nul + 
      "" + nul + "" + nul + "" + nul);
    System.out.println (nul + "" + nul + "" + nul + "" + cherta + "" + nul + "" + nul + "" + cherta2
     + nul + "" + nul + "" + nul);
    System.out.println (nul + "" + nul + "" + cherta + "" + niz + "" + skobka_left + ""
     + nul + "" + skobka_right + "" + cherta2 + "" + nul + "" + nul);
    System.out.println (nul + "" + cherta + ""+ nul + "" + nul + "" + nul + "" + nul + "" + nul + ""
     + nul + "" + cherta2 + "" + nul);
System.out.println (cherta + ""+ niz + "" + niz + "" + niz + "" + niz + "" + cherta + ""
     + cherta2 + "" + niz + "" + niz + "" + cherta2);
    System.out.println ();

    int num = 345;
    int summa = (num % 10) + (num / 10 % 10) + (num / 100);
    int proizv = (num % 10) * (num / 10 % 10) * (num / 100);
    System.out.println ("Задача №9\n");
    System.out.println ("сумма цифр числа N = " + summa);
    System.out.println ("произведение цифр числа N =" + proizv);
    System.out.println ();


    long second = 86399;
    long hour = second / 3600;
    long min = second / 60 % 60;
    long sec = second / 1 % 60;
    System.out.println ("Задача №10\n");
    System.out.println(hour + ":" + min + ":" + sec);










    }
}
