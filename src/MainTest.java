
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {



    @Test
    void test_antal_fel() {
        count logik = new count();
        int expected = 0;
        expected--;
        logik.antal_fel();
        int actual = count.antal_fel;
        System.out.println("expected "+expected);
        System.out.println("actual "+actual);
        assertEquals( expected, actual);
    }
    @Test
    void test_antal_ratt() {
        count logik = new count();
        int expected = 0;
        expected++;
        logik.antalscore();
        int actual = count.antalscore;
        System.out.println("expected "+expected);
        System.out.println("actual "+actual);
        assertEquals( expected, actual);
    }







    // testa GUi



    // test
}
