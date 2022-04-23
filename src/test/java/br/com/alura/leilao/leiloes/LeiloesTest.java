package br.com.alura.leilao.leiloes;

import br.com.alura.leilao.login.LoginPage;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class LeiloesTest {

    private LeiloesPage leiloesPage;

    @BeforeEach
    public void beforeEach() {
        this.leiloesPage = new LeiloesPage();
    }

    @AfterEach
    public void AfterEach() {
        this.leiloesPage.fechar();
    }

    @Test
    public void deveriaCadastrarLeilao() {
        LoginPage loginPage = new LoginPage();
        loginPage.preencheFormulario("fulano", "pass");
        this.leiloesPage = loginPage.efetuaLogin();
        CadastraLeilaoPage cadastraLeilaoPage = this.leiloesPage.carregaFormulario();
    }
}
