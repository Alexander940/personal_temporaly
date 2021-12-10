package org.example.javaTest.practicaTDD;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FizzBuzzShould {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void fizz_when_is_divisible_by_3() {
        assertThat(fizzBuzz.fizzBuzz(3), is("Fizz"));
    }

    @Test
    public void buzz_when_is_divisible_by_5() {
        assertThat(fizzBuzz.fizzBuzz(5), is("Buzz"));
    }

    @Test
    public void fizzbuzz_when_is_divisible_by_3_and_5() {
        assertThat(fizzBuzz.fizzBuzz(15), is("FizzBuzz"));
    }

    @Test
    public void number_when_is_not_divisible_by_3_and_5() {
        assertThat(fizzBuzz.fizzBuzz(19), is("19"));
    }
}