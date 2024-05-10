import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import dev.nj.solutions.StudentInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class StudentInfoTest {

    @ParameterizedTest(name = "{0} -- printStudentInfo({1}, {2}, {3}) == {4}")
    @DisplayName("print student info test")
    @CsvSource(value = {
            "test1 ; John ; 20 ; 12345 ; Name: John, Age: 20, Student ID: 12345",
    }, delimiter = ';')
    public void test(String name, String studentName, int age, int studentID, String expected) {
        var result = StudentInfo.printStudentInfo(studentName, age, studentID).replace("\n", ", ");

        assertEquals(expected, result);
    }
}
