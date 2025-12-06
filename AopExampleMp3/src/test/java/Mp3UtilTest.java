import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.test.Mp3Util;

import java.nio.file.Paths;

public class Mp3UtilTest {

    @Test
    void getArtist_shouldBe_KraftClub() {
        String artist = Mp3Util.getArtist(Paths.get("./my.mp3"));
        Assertions.assertEquals("Maaarrrcoooo", artist);
    }
}
