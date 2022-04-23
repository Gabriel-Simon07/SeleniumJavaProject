package br.com.alura.leilao.leiloes;

import br.com.alura.leilao.login.LoginPage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

        String hoje = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String nome = "Leilão do dia" + hoje;
        String valor = "500.00";

        this.leiloesPage = cadastraLeilaoPage.cadastrarLeilao(nome, valor, hoje);
        Assert.assertTrue(leiloesPage.isLeilaoCadastrado(nome, valor, hoje));
    }
}
