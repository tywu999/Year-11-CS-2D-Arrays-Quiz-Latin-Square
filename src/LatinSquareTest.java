import static org.junit.jupiter.api.Assertions.*;

class LatinSquareTest {

    private int[][] array2d;
    private int[][] array2d2;
    private int[][] array2d3;
    private int[][] array2d4;
    private int[][] array2d5;
    private int[][] array2d6;
    private int[][] array2d7;
    private int[][] array2d8;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        array2d = new int[][] {
                {1,2,3},
                {3,1,2},
                {2,3,1}
        };

        array2d2 = new int[][] {
                {1,2,3},
                {2,3,1},
                {3,1,2}
        };

        array2d3 = new int[][] {
                {1,2,3,4},
                {2,1,4,3},
                {3,4,1,2},
                {4,3,2,1}
        };

        array2d4 = new int[][] {
                {1,2,3,4,5},
                {2,4,1,5,3},
                {3,5,4,2,1},
                {4,1,5,3,2},
                {5,3,2,1,4}
        };

        array2d5 = new int[][] {
                {1,3,2},
                {2,3,1},
                {2,1,3}
        };

        array2d6 = new int[][] {
                {2,3,1},
                {1,3,2},
                {2,3,1}
        };

        array2d7 = new int[][] {
                {1,2,3,4},
                {2,1,4,1},
                {3,4,2,3},
                {4,3,1,2}
        };

        array2d8 = new int[][] {
                {1,2,3,4,5},
                {2,4,1,5,3},
                {3,5,4,2,1},
                {4,1,5,4,2},
                {5,3,2,1,3}
        };

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        array2d = null;
        array2d2 = null;
        array2d3 = null;
        array2d4 = null;
        array2d5 = null;
        array2d6 = null;
        array2d7 = null;
        array2d8 = null;
    }

    @org.junit.jupiter.api.Test
    void calculateCheckSum1() {
        assertTrue(LatinSquare.calculateCheckSum1(array2d) == 6);
        assertTrue(LatinSquare.calculateCheckSum1(array2d2) == 6);
        assertTrue(LatinSquare.calculateCheckSum1(array2d3) == 10);
        assertTrue(LatinSquare.calculateCheckSum1(array2d4) == 15);
        assertTrue(LatinSquare.calculateCheckSum1(array2d5) == 6);
        assertTrue(LatinSquare.calculateCheckSum1(array2d6) == 6);
        assertTrue(LatinSquare.calculateCheckSum1(array2d7) == 10);
        assertTrue(LatinSquare.calculateCheckSum1(array2d8) == 15);
    }
    @org.junit.jupiter.api.Test
    void calculateCheckSum2() {
        assertTrue(LatinSquare.calculateCheckSum2(array2d) == 6);
        assertTrue(LatinSquare.calculateCheckSum2(array2d2) == 6);
        assertTrue(LatinSquare.calculateCheckSum2(array2d3) == 24);
        assertTrue(LatinSquare.calculateCheckSum2(array2d4) == 120);
        assertTrue(LatinSquare.calculateCheckSum2(array2d5) == 6);
        assertTrue(LatinSquare.calculateCheckSum2(array2d6) == 6);
        assertTrue(LatinSquare.calculateCheckSum2(array2d7) == 24);
        assertTrue(LatinSquare.calculateCheckSum2(array2d8) == 120);
    }

    @org.junit.jupiter.api.Test
    void isLatinRows() {
        assertTrue(LatinSquare.isLatinRows(array2d, LatinSquare.calculateCheckSum1(array2d),
                LatinSquare.calculateCheckSum2(array2d)) == true);
        assertTrue(LatinSquare.isLatinRows(array2d2, LatinSquare.calculateCheckSum1(array2d2),
                LatinSquare.calculateCheckSum2(array2d2)) == true);
        assertTrue(LatinSquare.isLatinRows(array2d3, LatinSquare.calculateCheckSum1(array2d3),
                LatinSquare.calculateCheckSum2(array2d3)) == true);
        assertTrue(LatinSquare.isLatinRows(array2d4, LatinSquare.calculateCheckSum1(array2d4),
                LatinSquare.calculateCheckSum2(array2d4)) == true);
        assertTrue(LatinSquare.isLatinRows(array2d5, LatinSquare.calculateCheckSum1(array2d5),
                LatinSquare.calculateCheckSum2(array2d5)) == true);
        assertTrue(LatinSquare.isLatinRows(array2d6, LatinSquare.calculateCheckSum1(array2d6),
                LatinSquare.calculateCheckSum2(array2d6)) == true);
        assertTrue(LatinSquare.isLatinRows(array2d7, LatinSquare.calculateCheckSum1(array2d7),
                LatinSquare.calculateCheckSum2(array2d7)) == false);
        assertTrue(LatinSquare.isLatinRows(array2d8, LatinSquare.calculateCheckSum1(array2d8),
                LatinSquare.calculateCheckSum2(array2d8)) == false);
    }

    @org.junit.jupiter.api.Test
    void isLatinColumns() {
        assertTrue(LatinSquare.isLatinColumns(array2d, LatinSquare.calculateCheckSum1(array2d),
                LatinSquare.calculateCheckSum2(array2d)) == true);
        assertTrue(LatinSquare.isLatinColumns(array2d2, LatinSquare.calculateCheckSum1(array2d2),
                LatinSquare.calculateCheckSum2(array2d2)) == true);
        assertTrue(LatinSquare.isLatinColumns(array2d3, LatinSquare.calculateCheckSum1(array2d3),
                LatinSquare.calculateCheckSum2(array2d3)) == true);
        assertTrue(LatinSquare.isLatinColumns(array2d4, LatinSquare.calculateCheckSum1(array2d4),
                LatinSquare.calculateCheckSum2(array2d4)) == true);
        assertTrue(LatinSquare.isLatinColumns(array2d5, LatinSquare.calculateCheckSum1(array2d5),
                LatinSquare.calculateCheckSum2(array2d5)) == false);
        assertTrue(LatinSquare.isLatinColumns(array2d6, LatinSquare.calculateCheckSum1(array2d6),
                LatinSquare.calculateCheckSum2(array2d6)) == false);
        assertTrue(LatinSquare.isLatinColumns(array2d7, LatinSquare.calculateCheckSum1(array2d7),
                LatinSquare.calculateCheckSum2(array2d7)) == true);
        assertTrue(LatinSquare.isLatinColumns(array2d8, LatinSquare.calculateCheckSum1(array2d8),
                LatinSquare.calculateCheckSum2(array2d8)) == false);
    }

    @org.junit.jupiter.api.Test
    void isLatinSquare() {
        assertTrue(LatinSquare.isLatinSquare(array2d) == true);
        assertTrue(LatinSquare.isLatinSquare(array2d2) == true);
        assertTrue(LatinSquare.isLatinSquare(array2d3) == true);
        assertTrue(LatinSquare.isLatinSquare(array2d4) == true);
        assertTrue(LatinSquare.isLatinSquare(array2d5) == false);
        assertTrue(LatinSquare.isLatinSquare(array2d6) == false);
        assertTrue(LatinSquare.isLatinSquare(array2d7) == false);
        assertTrue(LatinSquare.isLatinSquare(array2d8) == false);
    }

}