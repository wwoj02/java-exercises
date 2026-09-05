package com.amigoscode._8_testing._9_mocking;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.*;

/**
 * Exercise: Mockito Argument Matchers
 * <p>
 * Practice using Mockito's argument matchers for flexible stubbing and verification.
 * Matchers let you specify patterns for arguments rather than exact values.
 */
@DisplayName("Mockito Argument Matchers Tests")
@ExtendWith(MockitoExtension.class)
class MatchersTest {

    @Mock
    private PaymentService paymentService;

    @Mock
    private OrderRepository orderRepository;

    @InjectMocks
    private OrderService orderService;

    // TODO: 1 - Use any() matcher with when().thenReturn().
    //  Stub paymentService.charge to return true for ANY String and ANY double:
    //  when(paymentService.charge(any(), anyDouble())).thenReturn(true);
    //  Place an order and assert it completes successfully.
    @Test
    void TODO1() {
        when(paymentService.charge(anyString(), anyDouble())).thenReturn(true);

        Order order = new Order("ORD-1", "CUST-1", 20.99);
        var actual = orderService.placeOrder(order);

        assertThat(actual.getStatus()).isEqualTo("COMPLETED");
    }


    // TODO: 2 - Use anyString() matcher.
    //  Stub paymentService.charge to return true when called with
    //  anyString() for customer ID and eq(99.99) for amount.
    //  Place an order with amount 99.99 and verify it works.
    //  Place another order with a different customer ID but same amount and verify.
    @Test
    void TODO2() {
        given(paymentService.charge(anyString(), eq(99.99))).willReturn(true);
        Order order1 = new Order("ORD-1", "CUST-1", 99.99);
        Order order2 = new Order("ORD-2", "CUST-2", 99.99);

        var actual1 = orderService.placeOrder(order1);
        var actual2 = orderService.placeOrder(order2);

        then(paymentService).should().charge("CUST-1", 99.99);
        then(paymentService).should().charge("CUST-2", 99.99);

        assertThat(actual1.getStatus()).isEqualTo("COMPLETED");
        assertThat(actual2.getStatus()).isEqualTo("COMPLETED");
    }


    // TODO: 3 - Use eq() for exact match combined with other matchers.
    //  Stub paymentService.charge to return true for eq("VIP-CUSTOMER") and anyDouble().
    //  Create an order with customerId "VIP-CUSTOMER" and place it.
    //  Assert the order status is "COMPLETED".
    //  Important: When using any matcher in a call, ALL arguments must use matchers.

    @Test
    void TODO3() {
        given(paymentService.charge(eq("VIP-CUSTOMER"), anyDouble())).willReturn(true);
        Order order = new Order("ORD-1", "VIP-CUSTOMER", 10.99);

        var actual = orderService.placeOrder(order);

        then(paymentService).should().charge(eq("VIP-CUSTOMER"), anyDouble());
        assertThat(actual.getStatus()).isEqualTo("COMPLETED");

    }


    // TODO: 4 - Use argThat() with a custom matcher.
    //  Stub paymentService.charge to return true when the amount is greater than 0:
    //  when(paymentService.charge(anyString(), argThat(amount -> amount > 0)))
    //      .thenReturn(true);
    //  Place an order with a positive amount and verify success.

    @Test
    void TODO4() {
        given(paymentService.charge(
                anyString(),
                doubleThat(amount -> amount > 0))).willReturn(true);

        Order order = new Order("ORD-1", "CUST-1", 19.99);
        orderService.placeOrder(order);

        then(paymentService).should().charge("CUST-1", 19.99);
    }


    // TODO: 5 - Combine matchers in verify().
    //  Place an order, then verify the interactions using matchers:
    //  verify(paymentService).charge(eq("CUST-1"), argThat(amount -> amount > 50));
    //  verify(orderRepository).save(argThat(order ->
    //      order.getStatus().equals("COMPLETED")));
    @Test
    void TODO5() {
        given(paymentService.charge(
                anyString(),
                doubleThat(amount -> amount > 0))).willReturn(true);


        Order order = new Order("ORD-1", "CUST-1", 59.99);
        orderService.placeOrder(order);

        verify(paymentService).charge(eq("CUST-1"), doubleThat(amount -> amount > 50));
        verify(orderRepository).save(argThat(order1 -> order1.getStatus().equals("COMPLETED")));
    }


    // TODO: 6 - Use argument matchers with when() for different return values.
    //  Stub charge to return true for amounts <= 1000 and false for amounts > 1000:
    //  when(paymentService.charge(anyString(), doubleThat(a -> a <= 1000)))
    //      .thenReturn(true);
    //  when(paymentService.charge(anyString(), doubleThat(a -> a > 1000)))
    //      .thenReturn(false);
    //  Test placing an order with amount 500 (should succeed).
    //  Test placing an order with amount 1500 (should throw RuntimeException).
    @Test
    void TODO6() {
        given(paymentService.charge(anyString(), doubleThat(a -> a <= 1000))).willReturn(true);
        given(paymentService.charge(anyString(), doubleThat(a -> a > 1000))).willReturn(false);

        Order order1 = new Order("ORD-1", "CUST-1", 500);
        Order order2 = new Order("ORD-2", "CUST-2", 1500);
        var actual1 = orderService.placeOrder(order1);

        assertThat(actual1.getStatus()).isEqualTo("COMPLETED");
        assertThrows(
                RuntimeException.class,
                () -> orderService.placeOrder(order2));
    }
}
