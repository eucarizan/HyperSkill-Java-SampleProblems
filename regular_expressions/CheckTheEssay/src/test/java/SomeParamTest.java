import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {
    List<String> list = List.of(
            "The    keY    is     ggYYY3564   THE    key IS ffFF23c! ",
            "The    key    IS     ggYiYY3564   The    KEY  is     AAAAAaaaa!!! ",
            "blabla ggYiYY3564 The    key    IS iiiaaaasd!  The    key    IS ffPPP23c! The    key    IS   ffFF23c ",
            "The    keY    is ????? blabla ",
            "blabla The    key    IS     aaaa54 blabla  The    KEY  is     !!fra The    KEY  is aeou# ",
            "blabla The    key    IS     ggg! blabla  The    KEY  is     yyyaa! blabla The    KEY  is FGH ",
            "blabla The    key    IS     ggg blabla  The    KEY  is     eeeeeaa blabla The    KEY  is FGH4673846 ",
            "The    keY    is aaa?????xxx blabla The    key    IS     1154 "
    );

    @Test
    void test1() {
        String result = Solution.findTheKeys(list.get(0)).toString();

        assertEquals("[ggYYY3564]", result);
    }

    @Test
    void test2() {
        String result = Solution.findTheKeys(list.get(1)).toString();

        assertEquals("[AAAAAaaaa!!!]", result);
    }

    @Test
    void test3() {
        String result = Solution.findTheKeys(list.get(2)).toString();

        assertEquals("[ffFF23c]", result);
    }

    @Test
    void test4() {
        String result = Solution.findTheKeys(list.get(3)).toString();

        assertEquals("[?????]", result);
    }

    @Test
    void test5() {
        String result = Solution.findTheKeys(list.get(4)).toString();

        assertEquals("[aeou#]", result);
    }

    @Test
    void test6() {
        String result = Solution.findTheKeys(list.get(5)).toString();

        assertEquals("[FGH]", result);
    }

    @Test
    void test7() {
        String result = Solution.findTheKeys(list.get(6)).toString();

        assertEquals("[ggg, eeeeeaa, FGH4673846]", result);
    }

    @Test
    void test8() {
        String result = Solution.findTheKeys(list.get(7)).toString();

        assertEquals("[1154]", result);
    }
}
