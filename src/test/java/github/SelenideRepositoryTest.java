package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

public class SelenideRepositoryTest extends TestBase {

    @Test
    void findSoftAssertions() {
//        Откройте страницу Selenide в Github
//        Перейдите в раздел Wiki проекта
//        Убедитесь, что в списке страниц(Pages) есть страница SoftAssertions
//        Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5

        searchPage.openPage()
                .selenideSearch()
                .openSelenideProject()
                .openWiki()
                .checkResult("SoftAssertions");


    }

    @Test
    void softAssertionsShouldHaveJUnit5Example() {
        Selenide.open("selenide/selenide/wiki/SoftAssertions");
        $(".repository-content").shouldHave(Condition.text("3. Using JUnit5 extend test class:"));


    }

}
