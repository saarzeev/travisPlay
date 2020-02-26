import static org.junit.Assert.*;

public class MainTest {

    @org.junit.Test
    public void getX() {
        Main main = new Main();
        assertEquals(10, main.getX());
    }

    @org.junit.Test
    public void getX2() {
        Main main = new Main();
        main.setX(3);
        assertEquals(3, main.getX());
    }
}