public class FizzBuzz {
      public String[] fizzBuzz(int start, int end){
          if(start <= end){
              String[] array = new String[end - start + 1];
              //здесь мы создаем массив и высчитываем длину массива

              for (int i = 0; i < array.length && start <= end; i++){
                  if (start % 15 == 0){
                      //здесь мы делаем проверку деления числа и на 3 и на 5 одновременно
                      array[i] = "FizzBuzz";
                  }else if (start % 3 == 0){
                      array[i] = "Fizz";
                  }else if (start % 5 == 0){
                      array[i] = "Buzz";
                  }else {
                      array[i] = String.valueOf(start);
                      // здесь мы значение int переводим в String
                  }
                  start++;
              }

              return array;
          }

          return new String[0];
      }

}
