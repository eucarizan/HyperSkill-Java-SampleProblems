public class FieldGetter {
    /**
     Get number of accessible public fields for a given class.
     */
    public static int getNumberOfAccessibleFields(Class<?> clazz) {
        return clazz.getFields().length;
    }
}
