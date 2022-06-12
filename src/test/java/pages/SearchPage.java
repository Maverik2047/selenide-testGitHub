package pages;

import com.codeborne.selenide.Selenide;
import components.ResultComponents;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchPage extends ResultComponents {

    public SearchPage openPage() {
        Selenide.open("https://github.com");
        return this;
    }

    public SearchPage selenideSearch() {
        $(".form-control").setValue("Selenide").pressEnter();
        return this;
    }
public SearchPage openSelenideProject(){
    $$(".repo-list").first().$("a").click();
    return this;
}
public SearchPage openWiki(){
    $("#wiki-tab").click();
    $(".Box-row.wiki-more-pages-link").$(byText("Show 2 more pages…")).click();
    return this;
}
public SearchPage openSoftAssertions(){
    Selenide.open("selenide/selenide/wiki/SoftAssertions");
    return this;
}

}
