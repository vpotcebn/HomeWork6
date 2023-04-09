package src.main.java;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c;
        boolean d = true;
        boolean e = false;
        //Арифметические операторы
        c = a + b;
        System.out.println("Сложение: " + c);
        c = a - b;
        System.out.println("Вычитание: " + c);
        c = a * b;
        System.out.println("Сложение: " + c);
        c = a / b;
        System.out.println("Вычитание: " + c);
        c = a % b;
        System.out.println("Остаток от деления: " + c);
        c++;
        System.out.println("Инкремент: " + c);
        c--;
        System.out.println("Декремент: " + c);
        //Операторы сравнения
        System.out.println("Равенство: a равно b? " + (a==b));
        System.out.println("Неравенство: a не равно b? " + (a!=b));
        System.out.println("Больше: a больше b? " + (a>b));
        System.out.println("Меньше: a меньше b? " + (a<b));
        System.out.println("Больше либо равно: a больше либо равно b? " + (a>=b));
        System.out.println("Меньше либо равно: a меньше либо равно b? " + (a<=b));
        //Логические операторы
        System.out.println("Логическое И: оба операнда true? " + (d&&e));
        System.out.println("Логическое Или: один из операндов true? " + (d||e));
        System.out.println("Логический оператор НЕ: результат логического И true? " + !(d&&e));
        //Операторы присваивания
        c = a + b;
        System.out.println("c = a + b = " + c );

        c += a ;
        System.out.println("c += a  = " + c );

        c -= a ;
        System.out.println("c -= a = " + c );

        c *= a ;
        System.out.println("c *= a = " + c );

        a = 10;
        c = 15;
        c /= a ;
        System.out.println("c /= a = " + c );

        a = 10;
        c = 15;
        c %= a ;
        System.out.println("c %= a  = " + c );

        c <<= 2 ;
        System.out.println("c <<= 2 = " + c );

        c >>= 2 ;
        System.out.println("c >>= 2 = " + c );

        c >>= 2 ;
        System.out.println("c >>= a = " + c );

        c &= a ;
        System.out.println("c &= 2  = " + c );

        c ^= a ;
        System.out.println("c ^= a   = " + c );

        c |= a ;
        System.out.println("c |= a   = " + c );
        //Тернарный оператор
        a = 10;
        b = (a == 1) ? 20 : 30;
        System.out.println( "Значение b: " +  b );

        b = (a == 10) ? 20 : 30;
        System.out.println( "Значение b: " + b );
        //Переполнение целых чисел
        System.out.println("Byte range: [" + Byte.MIN_VALUE +" , " +  Byte.MAX_VALUE + "]");
        System.out.println("Byte.SIZE  =   " + Byte.SIZE);

        byte f = 120;
        f += 19;
        System.out.println(f);
        //вычисления комбинаций типов данных
        int g = 10;
        double h = 2.0;
        System.out.println("При вычислении комбинаций int и double итоговый результат должен приводится в double: " + (g + h));
        System.out.println((g - h));
        System.out.println((g / h));







    }
}
