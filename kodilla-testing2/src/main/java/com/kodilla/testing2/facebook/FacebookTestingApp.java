package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String FIELD_NAME = "firstname";
    public static final String FIELD_LASTNAME = "lastname";
    public static final String FIELD_EMAIL = "reg_email__";
    public static final String XPATH_WAIT_EMAIL = "reg_email_confirmation__";
    public static final String FIELD_EMAIL_CONF = "reg_email_confirmation__";
    public static final String FIELD_PASSWORD = "reg_passwd__";

    public static final String XPATH_SELECT_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement nameField = driver.findElement(By.name(FIELD_NAME));
        nameField.sendKeys("Firstname");

        WebElement surnameField = driver.findElement(By.name(FIELD_LASTNAME));
        surnameField.sendKeys("Surname");

        WebElement emailField = driver.findElement(By.name(FIELD_EMAIL));
        emailField.sendKeys("test@test.com");

        while (!driver.findElement(By.name(XPATH_WAIT_EMAIL)).isDisplayed());

        WebElement emailFieldConf = driver.findElement(By.name(FIELD_EMAIL_CONF));
        emailFieldConf.sendKeys("test@test.com");

        WebElement passwordField = driver.findElement(By.name(FIELD_PASSWORD));
        passwordField.sendKeys("password123");

        WebElement selectDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectBoard1 = new Select(selectDay);
        selectBoard1.selectByValue("27");

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectBoard2 = new Select(selectMonth);
        selectBoard2.selectByValue("6");

        WebElement selectYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectBoard3 = new Select(selectYear);
        selectBoard3.selectByValue("2012");
    }
}
