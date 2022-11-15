package org.example;

import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Тестирование: BasketTest")
class BasketTest {
    String[] products = new String[]{"Яблоко", "Помидор", "Апельсин", "Груша"};
    int[] prices = new int[]{30, 50, 70, 40};
    Basket basket = new Basket(products, prices);

    @BeforeEach
    void added() {
        Basket basket1 = new Basket(new String[]{"Яблоко", "Помидор", "Апельсин", "Груша"}, new int[]{30, 50, 70, 40});
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Тестирование не существующего значения в номере товара")
    void addToCartErrorArrayIndexOutOfBoundsException() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> basket.addToCart(6, 2));
        System.out.println("Тест выполнился.");
    }

    @Test
    @DisplayName("Тестирование отрицательного значения в количестве товара")
    void addToCartErrorAIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> basket.addToCart(2, -3));
        System.out.println("Тест выполнился.");
    }

    @Test
    @DisplayName("Тестирование отрицательного значения в количестве товара, с верным количеством")
    void addToCartErrorAIllegalArgumentException1() {
        assertThrows(IllegalArgumentException.class, () -> basket.addToCart(2, 3));
        System.out.println("Тест выполнился.");
    }

}