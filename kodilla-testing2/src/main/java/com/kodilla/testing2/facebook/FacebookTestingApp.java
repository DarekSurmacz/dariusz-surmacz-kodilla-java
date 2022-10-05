package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    private static final String EMAIL = "grzegorz.brzeczyszczykiewicz@gmail.com";
    private static final String FACEBOOK_COOKIES = "//*[@data-cookiebanner=\"accept_only_essential_button\"]";
    private static final String FACEBOOK_CREATE_NEW_ACCOUNT = "//*[@data-testid=\"open-registration-form-button\"]";
    private static final String FACEBOOK_INSERT_FIRSTNAME = "//*[contains(@name, \"firstname\")]";
    private static final String FACEBOOK_INSERT_LASTNAME = "//*[contains(@name, \"lastname\")]";
    private static final String FACEBOOK_INSERT_EMAIL = "//*[contains(@name, \"reg_email_\")]";
    private static final String FACEBOOK_INSERT_REPEAT_EMAIL = "//*[contains(@name, \"reg_email_confirmation_\")]";
    private static final String FACEBOOK_INSERT_PASSWORD = "//*[contains(@name, \"reg_passwd_\")]";
    private static final String FACEBOOK_INSERT_DAY = "//div[contains(@class, \"_58mq _5dbb\")]/div[2]/span/span/select[1]";
    private static final String FACEBOOK_INSERT_MONTH = "//*[contains(@name, \"birthday_month\")]";
    private static final String FACEBOOK_INSERT_YEAR = "//*[contains(@name, \"birthday_year\")]";
    private static final String FACEBOOK_INSERT_SEX = "//*[@name=\"sex\" and @value=\"2\"]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath(FACEBOOK_COOKIES)).click();
        driver.findElement(By.xpath(FACEBOOK_CREATE_NEW_ACCOUNT)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(FACEBOOK_INSERT_FIRSTNAME)).sendKeys("Grzegorz");
        driver.findElement(By.xpath(FACEBOOK_INSERT_LASTNAME)).sendKeys("Brzęczyszczykiewicz");
        driver.findElement(By.xpath(FACEBOOK_INSERT_EMAIL)).sendKeys(EMAIL);
        driver.findElement(By.xpath(FACEBOOK_INSERT_REPEAT_EMAIL)).sendKeys(EMAIL);
        driver.findElement(By.xpath(FACEBOOK_INSERT_PASSWORD)).sendKeys("Chrząszczrzewoszyce_powiat_Łekołody");

        WebElement facebookInsertDay = driver.findElement(By.xpath(FACEBOOK_INSERT_DAY));
        Select daySelect = new Select(facebookInsertDay);
        daySelect.selectByIndex(10);

        WebElement facebookInsertMonth = driver.findElement(By.xpath(FACEBOOK_INSERT_MONTH));
        Select monthSelect = new Select(facebookInsertMonth);
        monthSelect.selectByIndex(0);

        WebElement facebookInsertYear = driver.findElement(By.xpath(FACEBOOK_INSERT_YEAR));
        Select yearSelect = new Select(facebookInsertYear);
        yearSelect.selectByIndex(86);

        driver.findElement(By.xpath(FACEBOOK_INSERT_SEX)).click();
    }
}