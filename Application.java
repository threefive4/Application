package ua.lviv.lgs;

public class Application {
    public static void main(String[] args) {

//        int a = 2;
//        long b = 3;
//        System.out.println("var a = "+a);
//        System.out.println("var b = "+b);

        // приклад 1 : додавання та виднимання зминних
//        int d = 1;
//        int e = 2;
//        int res1 = d + e;
//        int res2 = d - e;
//        int res3 = d * e;
//        int res4 = d / e;
//        System.out.println("res1 = " +res1);
//        System.out.println("res2 = " +res2);
//        System.out.println("res3 = " +res3);
//        System.out.println("res4 = " +res4);

        //приклад 2 : Який буде результат виведення на экран?(инкемент/дикремент)
//        int a = 0;
//        int b = a++;
//        int c = a++;
//        System.out.println("риклад 2 = "+a + " " + b + " " + c + " ");

        //приклад 3 : операции з присвоэнням
//        int f = 1;
//        int g = 2;
//        int h = 3;
//
//        f+=5;// f = f + 5 => 1+5 = 6
//        g*=4;// g = g * 4 => g = 2*4 = 8
//        h+=f*g;//h =h + f*g => 3+6*8 = 51
//        h%=6;// h = h % 6 => 51%6 = 3
//        System.out.println("f = " + f);
//        System.out.println("g = " + g);
//        System.out.println("h = " + h);

        //приклад 4 : тернарний оператори
//        int a = 2;
//        int r = a < 0? -3 : 2;//тернарний оператор
//        System.out.println("r = "+r);

        //приклад 5 : логични оператори
//        boolean j = true;
//        boolean k = false;
//        boolean l = j | k;//або 1 + 0 = 1 => true
//        boolean m = j & k;//и 1* 0 + 0 =>  false
//        boolean n = (!j & k) | (j & !k); //! - не (0 * 0) + (1 * 1) = 0 + 1 = 1 => true
//        boolean o = !j;// 0 => false
//        System.out.println("j = " + j);
//        System.out.println("k = " + k);
//        System.out.println("l = " + l);
//        System.out.println("m = " + m);
//        System.out.println("n = " + n);
//        System.out.println("o = " + o);

        //приклад 6 : операции ривности
//        int t = 5;
//        int u = 21;
//        String result = (t < u) ? "yes": "no";
//        String result2 = (t == u) ? "yes": "no";
//        String result3 = (t >= u) ? "yes": "no";
//        System.out.println("result = " + result);
//        System.out.println("result2 = " + result2);
//        System.out.println("result3 = " + result3);

        //приклад 7 : Конструнция if-else
//        int a1 = 2;
//        int b1 = 3;
////        if (a1 > b1) {
////            System.out.println("a1 < b1");
////        } else {
////            System.out.println("a1 < b1");
////        }
//        //приклад 8  if -else-if
//        if(a1 * a1 == b1){
//            System.out.println("1");
//        }else if (a1 * a1 < b1){
//            System.out.println("2");
//        }else{
//            System.out.println("3");
//        }

        //приклад 9 : конструкция switch
//        int k1 = 4;
//
//        switch (k1) {
//            case 1 : case 3 : case 4 :
//                System.out.println("1, 3, 4"); break;
//
//            case 2:
//                System.out.println("2");
//                default :
//                    System.out.println("default");
//        }

        //приклад 10 : цикл for
//        for(int i = 0; i<10; i++){
//            System.out.println("i = " + i);
//        }

        //приклад 11 : цикл while
//        int i = 0;
////        while (i < 10){
////            System.out.println("j = " +i);
////            i++;
////        }
//
//        do {
//            System.out.println("do i = " + i);
//            i++;
//        }
//        while (i < 10);


        //приклад 12 : массиви
//        int array1 [] = new int[10];
//        double [] array2 = new double[10];
//        double array3 [] = {1.1, 2.2, 3.3, 4.4, 5.5};
//
//        for (int i = 0; i < array1.length; i++){
//            array1[i] = i;
//            array2[i] = i*i;
//        }
//
//        for (int i = 0; i < array1.length; i++) {
//            System.out.print(array1[i] + " => ");
//            System.out.println(array2[i]);
//        }
//            for (int i = 0; i < array3.length; i++){
//            System.out.print(array3[i] + " => ");
//            System.out.println(array3[i]);
//        }

        //приклад 13 : Обгортки примитивив wrappers primitives
//        Byte a1 = 2;
//        Short a2 = 2;
//        Integer a = 2;
//        Long a4 = 2l;
//
//        int a5 = a1;//розпакування
//        a3 = a5;
//
//        Double b = 2.2;
//        Float b1 = 3.3F;

        System.out.println("Byte = " + Byte.MAX_VALUE);

    }
}
