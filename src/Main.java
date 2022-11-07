public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        //Задание 1
         var dog = 8;
         var cat = 3.6;
         var paper = 763789;
        //Проврка.
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Задание 2");
           //Задание 2
            dog = dog + 4;
            cat = cat + 4;
            paper = paper + 4;
            //Проверка.
            System.out.println(dog);
            System.out.println(cat);
            System.out.println(paper);
            System.out.println("Задание 3");
               //Задание 3
               var dog1 = 8.0;
               dog1 = dog1 - 3.5;
               cat = cat - 1.6;
               paper = paper - 7639;
                //Проверка.
                 System.out.println(dog1);
                 System.out.println(cat);
                 System.out.println(paper);
                 System.out.println("Задание 4");
                   //Задание 4
                   var friend = 19;
                   System.out.println(friend);
                   friend = friend + 2;
                   System.out.println(friend);
                   friend = friend / 7;
                   System.out.println(friend);
                   System.out.println("Задание 5");
                     //Задание 5
                     var frog = 3.5;
                     System.out.println(frog);
                     frog = frog * 10;
                     System.out.println(frog);
                     frog = frog / 3.5;
                     System.out.println(frog);
                     frog = frog + 4;
                     System.out.println(frog);
                       //Задание 6
                       System.out.println("Задание 6");
                       var firstBoxerWeight = 78.2;
                       var secondBoxerWeight = 82.7;
                       var totalWeight = firstBoxerWeight + secondBoxerWeight;
                       var weightDifferenceA = secondBoxerWeight - firstBoxerWeight;
                       System.out.println("Общий вес боксеров " + totalWeight + " кг!");
                       System.out.println("Разница в весе боксеров, состовляет " + weightDifferenceA + " кг! ");
                         System.out.println("Задание 7");
                         var weightDifferenceB = totalWeight % firstBoxerWeight;
                         var weightDifferenceC = secondBoxerWeight % firstBoxerWeight;
                         System.out.println("Разница в весе боксеров, состовляет " + weightDifferenceA + " кг! "
                               + "(Вычитание из большего веса меньшего)");
                         System.out.println("Разница в весе боксеров, состовляет " + weightDifferenceB + " кг! "
                               + "(Используя функцию остаток от деления)");
                         System.out.println("Разница в весе боксеров, состовляет " + weightDifferenceC + " кг! "
                               + "(Используя функцию остаток от деления v.2.)");
                            System.out.println("Задание 8");
                            var totalHours = 640;
                            var workingMode = 8;
                            var totalEmployeesOld = totalHours / workingMode;
                            System.out.println("Всего работников в компании -  " + totalEmployeesOld + " человек");
                            var newEmployees = totalEmployeesOld + 94;  // + Новые сотрудники
                            var totalEmployeesNew = workingMode * newEmployees;
                            System.out.println("Если в компании работает " + newEmployees + " человек, то всего "
                                    + totalEmployeesNew + " часов работы может быть поделено между сотрудниками");


    }

}

