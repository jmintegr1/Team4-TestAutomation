package TestHomepage;

import Help.UiHelp;
import Homepage.UiMenuBar;
import Homepage.UiYourAccountMenuTab;
import LandingPage.UiLandingPage;
import ReportProblem.UiReportProblem;
import SupportInbox.UiSupportInbox;
import methods.CommonMethods;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Bilal on 19-01-2017.
 */
public class TestYourAccountMenu extends CommonMethods{
    public UiYourAccountMenuTab getYourAccountMenu(){
        signIn();
        UiMenuBar uiMenuBar = PageFactory.initElements(getDriver(),UiMenuBar.class);
        uiMenuBar.getYourAccountMenuTab();
        return PageFactory.initElements(getDriver(), UiYourAccountMenuTab.class);
    }
    @Test(priority = 1)
    public void testCreatePage(){
        getYourAccountMenu().getCreatePage(getDriver()).assertPage();
    }
    @Test(priority = 2)
    public void testManagePages(){
        getYourAccountMenu().getManagePages(getDriver()).assertPage();
    }
    @Test(priority = 3)
    public void testCreateGroup() throws InterruptedException {
        getYourAccountMenu().getCreateGroup(getDriver()).assertPage();
    }
    @Test(priority = 4)
    public void testNewGroups(){
        getYourAccountMenu().getNewGroups(getDriver()).assertPage();
    }
    @Test(priority = 5)
    public void testCreateAds(){
        getYourAccountMenu().getCreateAds(getDriver()).assertPage();
    }
    @Test(priority = 6)
    public void testManageAds(){
        getYourAccountMenu().getManageAds(getDriver()).assertPage();
    }
    @Test(priority = 7)
    public void testActivityLog(){
        getYourAccountMenu().getActivityLog(getDriver()).assertPage();
    }
    @Test(priority = 8)
    public void testNewsFeedPreferences() throws InterruptedException {
        getYourAccountMenu().getNewsFeedPreferences(getDriver()).assertPage();
    }
    @Test(priority = 9)
    public void testSettings(){
        getYourAccountMenu().getSettings(getDriver()).assertPage();
    }
    @Test(priority = 10)
    public void testLogout(){
        getYourAccountMenu().getLogout(getDriver()).assertPage();
    }
    @Test(priority = 11)
    public void testHelp(){
        getYourAccountMenu().getHelp(getDriver()).assertPage();
    }
    @Test(priority = 12)
    public void testSupportInbox(){
        getYourAccountMenu().getSupportInbox(getDriver()).assertPage();
    }
    @Test(priority = 13)
    public void testReportProblem() throws InterruptedException {
        getYourAccountMenu().getReportProblem(getDriver()).assertPage();
    }

}
