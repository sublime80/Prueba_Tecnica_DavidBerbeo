package starter.login;

import org.openqa.selenium.By;

public class LocatorsForm {
    public static By USERNAME_FIELD = By.name("email");
    public static By PASSWORD_FIELD = By.name("password");
    public static By LOGIN_BUTTON = By.cssSelector("button");
    public static By BLOG_BUTTON = By.xpath("//a[contains(text(),'Blog')]");
    public static By BLOG_BUTTONCATEGORIES = By.xpath("//a[contains(@href, 'https://www.phptravels.net/admin/blog/category')]");
    public static By BLOG_BUTTON_ADD = By.xpath("//div[@id='content']/div[2]/div[2]/div/button]");
    public static By BLOG_FIELD_CATEGORYNAME = By.name("name");


}

