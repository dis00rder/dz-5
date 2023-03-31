public class Main {

    public static void main(String[] args) {
        ///Надає значення 4 полям типу int.
        int a = 5;
        int b = 5;
        int c = 4;
        int d = 4;

        //2. Сумує їх попарно.
        int i = a+b;
        int j = c+d;

        //3. Виводить результат порівняння сум (true, якщо перша сума більша).
        System.out.println(i > j);
        //another
        String baz = i > j ? "true" : "false";
        System.out.println(baz);
        //3rd variant
        System.out.println(i > j ? "true" : "false");


        //4. Збільшує першу суму на 1.  5. Другу суму зменшує на 2.
        // 6. Виводить результат порівняння (true якщо перша сума більша).
        i++;
        j -=2;
        System.out.println(i > j);

        //7. Виводить true якщо хоча б одна сума кратна 2, інакше - false.

        String rr = i%2 ==0 || j%2==0 ? "true" : "false";

        System.out.println(rr);
    }
}
