import java.util.Random;

public class MathThing {
    int[] array = new int[10];
    int i, min=-10,max=10, diff=max-min;
    Random random = new Random();
    public MathThing(){
        System.out.println("generation by Math.random");
        for (i=0; i<array.length;i++){
            array[i]= ((int)(Math.random() * (11 - (-10)) + (-10))); //[10,10]
        }
        vivod_mass();
        System.out.println("generation by class Random");
        for (i=0; i<array.length;i++){
            array[i]= random.nextInt(diff+1)+min; //[10,10]
        }
        vivod_mass();
        sort_mass();
    }

    public void sort_mass(){                            //выбором
        for (int i = 0; i < array.length; i++) {
        /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является минимальным */
            int min = array[i];
            int min_i = i;
        /*В оставшейся части подмножества ищем элемент,
           который меньше предположенного минимума*/
            for (int j = i+1; j < array.length; j++) {
                //Если находим, запоминаем его индекс
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
        /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
            if (i != min_i) {
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }
        System.out.println("sorted mass");
        vivod_mass();
    }


    public void count_sum(){
        int sum1=0, sum2=0, sum3=0;
        for (i=0; i<array.length;i++){

            sum1=sum1+array[i];
        }
        i=0;
        while (i< array.length){
            sum2=sum2+array[i];
            i++;
        }
        i=0;
        do{
            sum3=sum3+array[i];
            i++;
        }while (i< array.length);
        System.out.println("sum(for)= "+sum1+" sum(while)= "+sum2+" sum(dowhile)= "+sum3);
    }
    public void count_factorial(int n){
        int fact = 0;
        while (n>0){
            fact = fact+n;
            n--;
        }
        System.out.println("factorial= "+fact);
    }
    public void vivod_mass(){                     //вывод эллементов массива ()
        for (i=0; i<array.length;i++){
            System.out.println(i+"= "+array[i]);
        }
    }
}
