package EPAM.lesson170624;

// если делится на 3 - вернуть "Fizz"
// если на 5 - вернуть "Buzz"
// если и на 5 и на 3 - "FizzBuzz"
// иначе - просто порядковое число

// используем подход TDD (просто с помощью метода main)
public class FizzBuzzTest {
    public static void main(String[] args){
        // "строковые литералы" помещаются в пул строк - в данном случае получится один и тот же объект
        System.out.println(SimpleUnit.assertEquals(FizzBuzz.fizzBuzz(3), "Fizz"));
        System.out.println(SimpleUnit.assertEquals(FizzBuzz.fizzBuzz(6), "Fizz"));
        System.out.println(SimpleUnit.assertEquals(FizzBuzz.fizzBuzz(333), "Fizz"));
        System.out.println(SimpleUnit.assertNotEquals(FizzBuzz.fizzBuzz(5), "Fizz"));

        System.out.println(SimpleUnit.assertEquals(FizzBuzz.fizzBuzz(5), "Buzz"));
        System.out.println(SimpleUnit.assertEquals(FizzBuzz.fizzBuzz(25), "Buzz"));
        System.out.println(SimpleUnit.assertEquals(FizzBuzz.fizzBuzz(1000), "Buzz"));
        System.out.println(SimpleUnit.assertNotEquals(FizzBuzz.fizzBuzz(1), "Buzz"));

        System.out.println(SimpleUnit.assertEquals(FizzBuzz.fizzBuzz(15), "FizzBuzz"));
        System.out.println(SimpleUnit.assertEquals(FizzBuzz.fizzBuzz(300), "FizzBuzz"));
        System.out.println(SimpleUnit.assertNotEquals(FizzBuzz.fizzBuzz(10), "FizzBuzz"));

        System.out.println(SimpleUnit.assertEquals(FizzBuzz.fizzBuzz(1), "1"));
        System.out.println(SimpleUnit.assertEquals(FizzBuzz.fizzBuzz(7), "7"));
        System.out.println(SimpleUnit.assertNotEquals(FizzBuzz.fizzBuzz(3), "3"));
        System.out.println(SimpleUnit.assertNotEquals(FizzBuzz.fizzBuzz(5), "5"));
        System.out.println(SimpleUnit.assertNotEquals(FizzBuzz.fizzBuzz(15), "15"));
    }
}
