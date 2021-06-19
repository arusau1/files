package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.readDocFromPath;
import static utils.Files.readDocxFromPath;

public class DocFileTests {

    @Test
    void docTest() throws IOException {
        String expectedData = "test line";
        String actualData = readDocFromPath("./src/test/resources/files/1.doc").getText();
        assertThat(actualData, containsString(expectedData));
    }

    @Test
    void docsTest() throws IOException {
        String expectedData = "test line";
        String actualData = readDocxFromPath("./src/test/resources/files/1.docx").getText();
        assertThat(actualData, containsString(expectedData));
    }
}
