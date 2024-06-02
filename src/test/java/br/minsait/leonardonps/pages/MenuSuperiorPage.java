package br.minsait.leonardonps.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuSuperiorPage extends BasePage {

    @FindBy(xpath = "//input[@id='search_query_top']")
    public WebElement campoTXT_barraPesquisa;

    @FindBy(name = "submit_search")
    public WebElement icone_Busca;

    public MenuSuperiorPage(WebDriver driver) {
        super(driver);
    }
    
    public void buscarProduto(String produto) {
        campoTXT_barraPesquisa.sendKeys(produto);
        icone_Busca.click();
    }

}
