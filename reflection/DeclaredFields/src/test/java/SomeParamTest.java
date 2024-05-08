import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SomeParamTest {

    @Test
    public void testGetNumberOfFieldsClassDeclares() {
        // Test a class with fields
        assertEquals(3, FieldGetter.getNumberOfFieldsClassDeclares(MyClass.class),
                "MyClass should declare 3 fields");

        // Test a class without fields
        assertEquals(0, FieldGetter.getNumberOfFieldsClassDeclares(EmptyClass.class),
                "EmptyClass should declare 0 fields");

        // Test a class with inherited fields
        assertEquals(2, FieldGetter.getNumberOfFieldsClassDeclares(ChildClass.class));

        // Test a class with private fields
        assertEquals(1, FieldGetter.getNumberOfFieldsClassDeclares(PrivateFieldClass.class),
                "PrivateFieldClass should declare 1 private field");
    }

    @Test
    public void testGetNumberOfFieldsClassDeclaresOnInterface() {
        assertEquals(1, FieldGetter.getNumberOfFieldsClassDeclares(MyInterface.class));
    }

    @Test
    public void testGetNumberOfFieldsClassDeclaresOnPrimitiveType() {
        // Test a primitive type (should return 0)
        assertEquals(0, FieldGetter.getNumberOfFieldsClassDeclares(int.class),
                "Primitive type int should have no fields");
    }

    @Test
    public void testGetNumberOfFieldsClassDeclaresOnArray() {
        // Test an array class (should return 0)
        assertEquals(0, FieldGetter.getNumberOfFieldsClassDeclares(String[].class),
                "Array class String[] should have no fields");
    }

    // Define test classes
    static class MyClass {
        public int field1;
        private String field2;
        protected List<Double> field3;
    }

    static class EmptyClass {
    }

    static class ParentClass {
        public int parentField;
    }

    static class ChildClass extends ParentClass {
        private String childField;
        protected List<Float> otherField;
    }

    static class PrivateFieldClass {
        private int privateField;
    }

    interface MyInterface {
        String constantField = "CONSTANT";
    }

}
