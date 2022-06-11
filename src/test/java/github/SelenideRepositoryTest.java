package github;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SelenideRepositoryTest extends TestBase{

    @Test
    void findSelenidePageInGithub() {
//        Откройте страницу Selenide в Github
//        Перейдите в раздел Wiki проекта
//        Убедитесь, что в списке страниц(Pages) есть страница SoftAssertions
//        Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5

        Selenide.open("https://github.com");
        $(".form-control").setValue("Selenide").pressEnter();
        $$(".repo-list").first().$("a").click();
        $("#wiki-tab").click();




    }

}
