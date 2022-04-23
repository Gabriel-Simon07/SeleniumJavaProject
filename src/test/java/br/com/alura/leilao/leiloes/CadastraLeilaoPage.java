package br.com.alura.leilao.leiloes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CadastraLeilaoPage {
    private WebDriver browser;

    public CadastraLeilaoPage(WebDriver browser) {
        this.browser = browser;
    }

    public void fechar() {
        this.browser.quit();
    }

    public LeiloesPage cadastrarLeilao(String nome, String valorInicial, String dataAbertura) {
        this.browser.findElement(By.name("nome")).sendKeys(nome);
        this.browser.findElement(By.name("valorInicial")).sendKeys(valorInicial);
        this.browser.findElement(By.name("dataAbertura")).sendKeys(dataAbertura);
        this.browser.findElement(By.id("button-submit")).submit();

        return new LeiloesPage(browser);
    }
}
