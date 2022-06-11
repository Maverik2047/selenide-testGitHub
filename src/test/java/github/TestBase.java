package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.SearchPage;

public class TestBase extends SearchPage {
    SearchPage searchPage = new SearchPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://github.com/";
        Configuration.browserSize = "3840x2160";
        Configuration.holdBrowserOpen = true;
    }
}
