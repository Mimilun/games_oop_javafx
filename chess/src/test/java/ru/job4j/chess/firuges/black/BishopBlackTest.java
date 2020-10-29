package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import static org.junit.Assert.*;
import org.junit.Assert;
import ru.job4j.chess.firuges.Figure;

public class BishopBlackTest {

    @Test
    public void Testposition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Assert.assertEquals(bishopBlack.position(), Cell.A1);
    }

    @Test
    public void Testcopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A2);
        Figure bishopBlackNew = bishopBlack.copy(Cell.A4);
        Assert.assertEquals(bishopBlackNew.position(), Cell.A4);
    }


    @Test
    public void TestwayDownRight() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] expected = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Assert.assertArrayEquals(expected, bishopBlack.way(Cell.G5));
    }

    @Test
    public void TestwayUpLeft() {
        BishopBlack bishopBlack = new BishopBlack(Cell.G5);
        Cell[] expected = new Cell[]{Cell.F4, Cell.E3, Cell.D2, Cell.C1};
        Assert.assertArrayEquals(expected, bishopBlack.way(Cell.C1));
    }

    @Test
    public void TestisDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        boolean expected = bishopBlack.isDiagonal(bishopBlack.position(), Cell.G5);
        Assert.assertTrue(expected);
    }

}