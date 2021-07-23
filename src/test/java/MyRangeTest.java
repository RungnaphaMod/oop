import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class MyRangeTest {

    @Test
    public void startNumberWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        int result = myRange.getStart();
        assertEquals(1, result);
    }

    @Test
    @DisplayName("ข้อมูล [1.5] นั้นจะขึ้นต้นด้วย [ (exclude) ผลที่ได้เป็น false")
    public void startWithExclude() {
        MyRange  myRange = new MyRange("(1,5]");
        boolean result = myRange.isStartWithInclude();
        assertFalse(result);
    }

    @Test
    @DisplayName("ข้อมูล [1.5] นั้นจะขึ้นต้นด้วย [ (include) ผลที่ได้เป็น true")
    public void startWithInclude() {
        MyRange  myRange = new MyRange("[1,5]");
        boolean result = myRange.isStartWithInclude();
        assertTrue(result);
    }

    @Test
    public void endNumberWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        int result = myRange.getEnd();
        assertEquals(5, result);
    }

    @Test
    @DisplayName("ข้อมูล [1,5] นั้นจะลงท้ายด้วย ] (include) ผลที่ได้เป็น true")
    public void endWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        boolean result = myRange.isEndWithInclude();
        assertTrue(result);
    }

    @Test
    @DisplayName("ข้อมูล [1,5] นั้นจะลงท้ายด้วย ] (exclude) ผลที่ได้เป็น false")
    public void endWithExclude() {
        MyRange myRange = new MyRange("[1,5)");
        boolean result = myRange.isEndWithInclude();
        assertFalse(result);
    }

    @Test
    public void case01() {
        MyRange myRange = new MyRange("[1,5]");
        String result = myRange.getResult();
        assertEquals("1,2,3,4,5", result);
    }


}
