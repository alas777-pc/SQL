package ru.netology.page;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class VerificationPage {

    public VerificationPage() {
        $("[data-test-id=code] input").shouldBe(visible);
    }

    public DashboardPage validVerify(String code) {
        $("[data-test-id=code] input").setValue(code);
        $("[data-test-id=action-verify]").click();
        return new DashboardPage();
    }
}