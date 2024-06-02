package br.minsait.leonardonps.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

    @FindBy(xpath = "//span[@class='heading-counter']")
    public WebElement LBL_contadorProdutos;

    @FindBy(xpath = "//div[@class='product-container']")
    public List<WebElement> container_Produtos;

    @FindBy(xpath = "//a[@class='product-name'][@title='Blouse']")
    public WebElement LBL_produto_Blouse;

    @FindBy(xpath = "//p[@class=\"alert alert-warning\"]")
    public WebElement LBL_mensagemAvisoPesquisa;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

}
