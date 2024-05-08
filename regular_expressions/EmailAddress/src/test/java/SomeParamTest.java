import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class SomeParamTest {

    @ParameterizedTest(name = "{0} -- isValidEmail({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testValid1 : bobo.smith@gmail.com : true",
            "testValid2 : anna@example.ru : true",
            "testValid3 : kat9%yy+@subdomain.topleveldomain : true",
            "testValid4 : user@example.com : true",
//            "testValid5 : user123@my-domain.net : true",
//            "testValid6 : jane.doe@sub.example.co : true",
            "testMissingDomain : user@.com : false",
            "testMissingUsername : @example.com : false",
            "testMissingToLevelDomain : user@example : false",
            "testMissingUsernameAndDomain : user@.example.com : false",
            "testMissingDomainSeparator : user@com : false",
            "testEmptyDomainAndExtraDot : user@.com. : false",
            "testCommaInsteadOfDot : user@example,com : false",
            "testSpaceInDomain : user@exam ple.com : false",
            "testTrailingDotInDomain : user@example.com. : false",
    }, delimiter = ':')
    public void test(String name, String param, boolean expected) {
        boolean result = Email.isValid(param);

        assertEquals(expected, result);
    }
}
