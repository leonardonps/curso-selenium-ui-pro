package br.minsait.leonardonps.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.minsait.leonardonps.pages.MenuSuperiorPage;
import br.minsait.leonardonps.pages.SearchPage;

public class RealizarBuscaMenuSuperior extends BaseTest {
    
    protected static MenuSuperiorPage menuSuperiorPage;
    protected static SearchPage searchPage;

    @Before
    public void instanciarPages() {
        menuSuperiorPage = new MenuSuperiorPage(driver);
        searchPage = new SearchPage(driver);
    }

    @Test
    public void deveBuscarUmProdutoPelaBarraDePesquisa() throws InterruptedException {
        menuSuperiorPage.buscarProduto("Blouse");
        
        assertEquals("1 result has been found.", searchPage.LBL_contadorProdutos.getText());
        assertEquals(1, searchPage.container_Produtos.size());
        assertEquals("Blouse", searchPage.LBL_produto_Blouse.getText());    }

    @Test
    public void deveExibirMensagemPedindoParaInserirUmaPalavraNaBarraDePesquisa() throws InterruptedException{
        menuSuperiorPage.buscarProduto("");

        assertEquals("0 results have been found.", searchPage.LBL_contadorProdutos.getText());
        assertEquals("Please enter a search keyword", searchPage.LBL_mensagemAvisoPesquisa.getText());
    }

    @Test
    public void deveExibirMensagemInformandoQueNenhumResultadoFoiEncontrado() throws InterruptedException {
        String produtoNaoEncontrado = "teste";

        menuSuperiorPage.buscarProduto(produtoNaoEncontrado);
        
        assertEquals("0 results have been found.", searchPage.LBL_contadorProdutos.getText());
        assertEquals("No results were found for your search \"" + produtoNaoEncontrado +"\"", searchPage.LBL_mensagemAvisoPesquisa.getText());
    }

}
