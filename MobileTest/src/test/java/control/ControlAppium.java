package control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import session.Session;

import java.net.MalformedURLException;

public class ControlAppium {
    protected WebElement control;
    protected By locator;

    public ControlAppium(By locator) {
        this.locator = locator;
    }

    public void find() throws MalformedURLException {
        this.control = Session.getInstance().getDriver().findElement(this.locator);
    }

    public void click() throws MalformedURLException {
        this.find();
        this.control.click();
    }

    public void set(String data) throws MalformedURLException {
        this.find();
        this.control.sendKeys(data);
    }

    public boolean isControlDisplayed() {
        try {
            this.find();
            return this.control.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void clear() throws MalformedURLException {
        this.find();
        this.control.clear();
    }

    public String getText() throws MalformedURLException {
        this.find();
        return this.control.getText();
    }
}
