package d3dCom;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
BasePage BPage = new BasePage();
  @Before
  public void SetUpBrowser() {
BPage.OpenBrowser();
  }

@After
public void QuitBrowser(){
BPage.CloseBrowser();
}
}
