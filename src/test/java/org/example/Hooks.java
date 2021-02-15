package org.example;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Util
{
    BrowserManager browserManager = new BrowserManager();

    @Before
    public void openBrowser()
    {
        browserManager.setBrowser();
    }

    @After
    public void closeBrowser()
    {
        // browserManager.closeBrowser();
    }

}
