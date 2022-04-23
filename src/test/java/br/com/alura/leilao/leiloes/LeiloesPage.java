package br.com.alura.leilao.leiloes;

import org.openqa.selenium.WebDriver;

public class LeiloesPage {
	private static final String URL_LEILOES_CADASTRO_LEILAO = "http://localhost:8080/leiloes/new";
	private WebDriver browser;

	public LeiloesPage() { }
	public LeiloesPage(WebDriver webDriver) {
		this.browser = webDriver;
		browser.navigate().to(URL_LEILOES_CADASTRO_LEILAO);
	}

	public void fechar() {
		this.browser.quit();
	}

	public CadastraLeilaoPage carregaFormulario() {
		this.browser.navigate().to(URL_LEILOES_CADASTRO_LEILAO);
		return new CadastraLeilaoPage(browser);
	}
}
