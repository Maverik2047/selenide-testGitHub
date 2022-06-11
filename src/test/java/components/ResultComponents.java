package components;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class ResultComponents {
public void checkResult(String value){
    $(".application-main").shouldHave(Condition.text(value));
}
}
