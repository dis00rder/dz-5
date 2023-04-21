public class stringMethods {

    public static void main(String[] args)
    {
        String str = "I would like to have a dog";


        //Порахуйте загальну кількість голосних (a, e, i, o, u) у рядку.
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("Total no of vowels in string are: " + count);


        ////Розділіть рядок на масив слів за допомогою пробілу як роздільника
        String[] arrOfStr = str.split(" ");

        for (String a : arrOfStr)
            System.out.println(a);


        /////Замініть всі входження слова "dog" на "cat" у рядку.
        String repStr = str.replace("dog",  "cat");

                    System.out.println(repStr);

        /////Витягніть перші три символи першого слова та виведіть їх на консоль.

        String firstStr = str.substring(0,1);

        System.out.println(firstStr);


    }


  }
