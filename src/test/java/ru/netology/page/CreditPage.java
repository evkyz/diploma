package ru.netology.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import ru.netology.data.DataHelper;

import static com.codeborne.selenide.Selenide.$x;

public class CreditPage {
    private SelenideElement heading = $x("//h3[@class=\"heading heading_size_m heading_theme_alfa-on-white\"]");
    private SelenideElement numberCard = $x("//input[@placeholder=\"0000 0000 0000 0000\"]");
    private SelenideElement month = $x("//span[text()='Месяц']");
    private SelenideElement year = $x("//span[text()='Год']");
    private SelenideElement name = $x("//span[text()='Владелец']");
    private SelenideElement code = $x("//input[@placeholder=\"999\"]");
    private SelenideElement button = $x("//span[@class=\"spin spin_size_m spin_theme_alfa-on-white\"]");

    public CreditPage() {
        heading.shouldBe(Condition.visible);
    }

    public void InfoCard(DataHelper.InfoCard infoCard) {
        numberCard.setValue(infoCard.getNumber());
        month.setValue(infoCard.getMonth());
        year.setValue(infoCard.getYear());
        name.setValue(infoCard.getName());
        code.setValue(infoCard.getCode());
        button.click();
    }
}