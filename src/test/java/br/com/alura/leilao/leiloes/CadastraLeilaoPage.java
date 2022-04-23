package br.com.alura.leilao.leiloes;

import org.openqa.selenium.WebDriver;

public class CadastraLeilaoPage {
    private WebDriver browser;

    public CadastraLeilaoPage(WebDriver browser) {
        this.browser = browser;
    }

    public void fechar() {
        this.browser.quit();
    }
}
