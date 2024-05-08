import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @Test
    public void testGetNumberOfAccessibleFields() {
        // Test a class with accessible public fields
        assertEquals(3, FieldGetter.getNumberOfAccessibleFields(MyClass.class),
                "MyClass should have 3 accessible public fields");

        // Test a class with inherited accessible public fields
        assertEquals(3, FieldGetter.getNumberOfAccessibleFields(ChildClass.class),
                "ChildClass should have 3 accessible public fields");

        // Test a class with private fields (should return 0)
        assertEquals(0, FieldGetter.getNumberOfAccessibleFields(PrivateFieldClass.class),
                "PrivateFieldClass should have 0 accessible public fields");
    }

    // Define test classes
    static class MyClass {
        public int field1;
        public String field2;
        public List<Double> field3;
    }

    static class ParentClass {
        public int parentField;
    }

    static class ChildClass extends ParentClass {
        public String childField;
        public List<Float> otherField;
    }

    static class PrivateFieldClass {
        private int privateField;
    }
}
