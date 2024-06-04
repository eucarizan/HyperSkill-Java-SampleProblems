import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import dev.nj.solutions.SetSpellCheck;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings("unused")
public class SetSpellCheckTest {

    public static final String[] OUT = {
        "[aab, aba, c, aaa]",
        "[urrsuaq, uPqrurZP, scZXZscd, ZZaaXZ, ZZdYq]",
        "[sXaXurP, dcas, rPqbquq, bqcbaP, drPbasXX, qrqZXYu, XubuqZu, Ycuc, srZ, dqXacPq, auXZYYusc, aqXarYYZ, uYa, urYPdabqZb, sdauc, c, suPbb, dPXqsruPcP, XPXsqaXarP, ZP, cuYP, squbauasr, cqd, YruqXs, qPs, Zuc, baPbduZ, aqPYXruaYd, Y, u, sdrXuXsqr, Z, scZasPcP, Zbuq, rY, dPaXcsXqcZ, XcPubXZcu, PZc, sqPabrX, q, auPu, sarPsusqas, PuPXXZbrP, dPaYZrubcY, YZZuZq]",
        "[ZP, rsP, d, Zrs, dPZsb, aYYrb, XYcrcXcr, budZXqqrcP, PY, uPsZabaXP, YXb, Z, qdd, a, Psbqrcrqbu, bbb, PYYuXddYY, ac, uruPdcZsZ, XYdPs, sPPYqbr, YqcXd, daYYdr, sXsds, uZsPXXscs, dPsq, drqXbXbXdu, csPq, rZ, Yd, ra, PYacY, Ys, bcd, YXbqcbZP, scPaZuPsZZ, qXZcadurs, uYaYccPb]",
        "[dZaXZYb, budqrudPb, dPaYu, qaarYaqXY, c]",
        "[ZXsXPuYsPY, ddqc, Y, ZXPq, crqbsZsbq, qrddPuZ, sXquqds, ruZ]",
        "[rbX, uYasZusd, aruYuaZs, bdaZYaXbu, rZsbbZZbY, PPZYbr, abPsurrYYY, ZdccXZ, ssasYucur, bqY, rrc, caY, cqrYa, YuPPZscbZd, XaaPYaXu, rsrcubs, YcdcX, raruuPbs, quaZ, bXudXPub, YPXcscYsdX, qYusZYXPZ, YuXdXXXZY, uZqcbdad, u, cqP, ZZr, XPdcqPXqs, aXZuZPsb, qZqXYZuZrs, PsPaqaqXsa, sY, ZbYbYsP, rq, ss, a, XZZdPrZZZ, YZc, qccadYars, qccYd, qd, Xqb, bd]",
        "[acdZZXXu, PYb, ucrs, adccrZ, raqcr, adYbPXcPcc, q, qPbbZrsY, sr, ZXrd, ccaaqcXXZ, ddPPXdsruX, YYbPPb, bcYXP, dcs, qZXXPrZd, XubaYbd, YuZacPrq, sYus, Pac, dqc, bYPZXbZraa, Xsrq, XZZuudX, ccPXq, u]",
        "[dcsbsPZ, quuXPZXb, bYubZ, dqcs, ZadbdqruZ, ddd, aYYYYdasX, r, qasXddaPsc, caYuPbua, YsYZssdss, uYbrXdqP, cZaaP, YqP, srqsbY, ucYurqP, PsbaYs, as, Y, XPcPZbuY, urquYdaP, saYYZPrPbX, cYZXsXXudq, dcqbsYYu, rqrqYd, bZsrYsPsbs, dsPuYbua, aXauca, qaucu, srcYa, XdcZrdb, ccZcda, q, cu, Zquau, ub, arPXY, ddXPrPY]",
        "[cPcc, d, r, a, qZP, cuaXsdP, rYdr, Zqr, Pda, q, rdqda, caq, dbbX, YqbP, cudbYPq, dYaarc, brqqu, qaXa, rPsrccrY, cqrbqYrqa, cYPYracYbu, Z, dsqr, uucbPcdr, X, qrdZqq, qPYsqPsa, qZr, ac, ZdPZ]",
        "[qbdbuqcdbZ, ZYqda, qXbPXq, srXcdsb, bbcPbaudX, uY, Zq, qqPsbcqsa, ZbPa, bdqZYs, d, Xcuc, cYar, aXu, Xsb, usaX, rcZuYYadP, PqrbPPa, auusqqaX, bXZbs, rXrc, sYXdsqudba, ccaXdZ, PYXYcbrcYP, ruqZXZ, YaYcauc, ccPbudZ, scuXs, Zara, qXua, ZP, ZXcXba, YccrPYc, YqYXb]"
    };

    @ParameterizedTest(name = "{0} -- getErroneous()")
    @DisplayName("getErroneous test")
    @CsvSource(value = {
            "test1 : a, bb, cCc : a, bb, aab, aba, ccc, c, bb, aaa : [aab, aba, c, aaa]",
    }, delimiter = ':')
    public void test(String name, String input, String wordsStr, String expected) {
        List<String> dictionary = Arrays.stream(input.split(", ")).toList();
        Set<String> words = new LinkedHashSet<>();
        Set<String> temp = Arrays.stream(wordsStr.split(", ")).collect(Collectors.toCollection(LinkedHashSet::new));

        SetSpellCheck.getErroneous(dictionary, words, temp);

        assertEquals(expected, words.toString());
    }

    @Test
    public void testFromFile() throws IOException {
        try (Stream<Path> paths = Files.walk(Paths.get("src/main/resources"))) {
            AtomicInteger i = new AtomicInteger();
            paths.filter(Files::isRegularFile).forEach(e -> {
//                System.out.println("file: " + e.getFileName());
                try (Scanner sc = new Scanner(e)) {
                    int dictionarySize = Integer.parseInt(sc.nextLine());
                    List<String> dictionary = sc.tokens()
                            .limit(dictionarySize)
                            .toList();
                    Set<String> words = new LinkedHashSet<>();
                    Set<String> temp = new LinkedHashSet<>();
                    sc.nextLine();
                    sc.nextLine();
                    while (sc.hasNextLine()) {
                        temp.addAll(Arrays.stream(sc.nextLine().split(" "))
                                .collect(Collectors.toCollection(LinkedHashSet::new)));
                    }
                    SetSpellCheck.getErroneous(dictionary, words, temp);
                    assertEquals(words.toString(), OUT[i.get()]);
                    i.getAndIncrement();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });
        }
    }
}
