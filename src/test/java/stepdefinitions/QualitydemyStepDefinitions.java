package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.QualitydemyPage;

public class QualitydemyStepDefinitions {
    QualitydemyPage qualitydemyPage = new QualitydemyPage();

    @Then("ilk login linkine click yapar")
    public void ilk_login_linkine_click_yapar() {
        qualitydemyPage.ilkLoginLinki.click();
    }

    @Then("cookies butona tiklar")
    public void cookies_butona_tiklar() {
        qualitydemyPage.cookiesKabulButonu.click();
    }

    @And("{int} saniye")
    public void saniye(int beklenecekSaniye) {

        // cucumber sayi yazildiginda direk parametre olarak kabul eder

        try {
            Thread.sleep(beklenecekSaniye*2000);
        } catch (InterruptedException e) {

        }
    }




    @Then("user email olarak {string} girer")
    public void user_email_olarak_girer(String kullaniciEmail) {
        qualitydemyPage.emailKutusu.sendKeys(kullaniciEmail);
    }
    @Then("password olarak {string} girer")
    public void password_olarak_girer(String kullaniciPassword) {
        qualitydemyPage.passwordKutusu.sendKeys(kullaniciPassword);
    }


    @When("login butonuna basar")
    public void login_butonuna_basar() {
        qualitydemyPage.loginButonu.click();
    }
    @Then("giris yapilamadigini test eder")
    public void giris_yapilamadigini_test_eder() {
        Assert.assertTrue(qualitydemyPage.emailKutusu.isEnabled());
    }

//asdasdasdasmnbasmdasasd
}
