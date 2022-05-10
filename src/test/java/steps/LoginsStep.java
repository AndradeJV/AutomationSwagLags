package steps;

import cucumber.api.java.pt.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.LoginPage;
import runners.RunnerCucumberTests;


public class LoginsStep extends RunnerCucumberTests {
    LoginPage loginPage = new LoginPage(driver);


    @Dado("^que eu tenha acessado a plataforma$")
    public void que_eu_tenha_acessado_a_plataforma() throws Throwable {
        String textValidation = driver.findElement(By.cssSelector("div.login_password > h4")).getText();

        Assert.assertEquals("Objeto não encontrado", textValidation, "Password for all users:");
    }

    @Quando("^eu preencher os dados de usuário existentes$")
    public void eu_preencher_os_dados_de_usuário_existentes() throws Throwable {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @Quando("^tentar acessar com os dados corretos$")
    public void tentar_acessar_com_os_dados_corretos() throws Throwable {
        driver.findElement(By.id("login-button")).click();
    }

    @Entao("^eu devo me logar sem problemas na plataforma$")
    public void eu_devo_me_logar_sem_problemas_na_plataforma() throws Throwable {

    }

    @Quando("^eu preencher somente a senha$")
    public void eu_preencher_somente_a_senha() throws Throwable {

    }

    @Quando("^tentar acessar a plataforma sem inserir um usuário$")
    public void tentar_acessar_a_plataforma_sem_inserir_um_usuário() throws Throwable {

    }

    @Entao("^eu devo ver uma mensagem de usuário requerido em tela$")
    public void eu_devo_ver_uma_mensagem_de_usuário_requerido_em_tela() throws Throwable {

    }

    @Quando("^eu preencher o usuário$")
    public void eu_preencher_o_usuário() throws Throwable {

    }

    @Quando("^tentar me logar sem digitar a senha$")
    public void tentar_me_logar_sem_digitar_a_senha() throws Throwable {

    }

    @Entao("^eu devo ver uma mensagem de senha requerida em tela$")
    public void eu_devo_ver_uma_mensagem_de_senha_requerida_em_tela() throws Throwable {

    }

    @Quando("^eu tentar entrar na plataforma sem inserir dados$")
    public void eu_tentar_entrar_na_plataforma_sem_inserir_dados() throws Throwable {

    }
}
