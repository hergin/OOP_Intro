package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void calculateArea() {
        Square someSquare = new Square(5);
        assertEquals(25, someSquare.calculateArea());
    }
}