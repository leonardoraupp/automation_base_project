# language: pt
@login @ExecucaoCompleta
Funcionalidade: Login

    @EfetuarLogin
    Cenario: Validação exibir tela Login
    Então verifico tela login

    @EfetuarLogin
    Cenario: Validação logar no sistema
        Dado informo o E-mail do usuario: "padrao"
        E informo a Senha do usuario
        E clico no botão Entrar
        Então verifico usuario logado
 
    @EfetuarLogin
    Cenario: Validação clicar em Esqueci minha senha 
        Dado clico no link: "Esqueceu a senha?" 
        Então verifico tela Esqueci minha senha

    @EfetuarLogin
    Cenario: Validação redefinir senha 
        Dado criar uma conta com o MailCatcher 
        E faço o logoff do perfil
        E clico no link: "Esqueceu a senha?"
        E informo o email do Mail7
        E clico no botão: "Enviar email"
        E abro o Mail Catcher
        E acesso o inbox do Mail Catcher: "Leonardo Raupp Rodrigues, esqueceu sua senha?"
        E clico no botão do inbox MailCatcher: "Redefinir senha"
        E informo senha: "TestingCompany123"
        E clico no botão: "Cadastrar"
        Então valido senha alterada com sucesso 

    @EfetuarLogin
    Cenario: Validação Usuário/Senha inválidos na página de Login 
        Dado informo o E-mail inválido: "leonardoraupprodrigues@hotmail.com"
        E informo senha: "testing"
        E clico no botão Entrar
        Então verifico a mensagem de erro de login inválido: "Endereço de e-mail ou senha inválidos!"

    @EfetuarLogin
    Cenario: Validação Usuário/Senha nulos na página de Login 
        Dado informo o E-mail inválido: ""
        E informo senha: ""
        E clico no botão Entrar
        Então verifico a mensagem de erro de login nulo

        
    @EfetuarLogin
    Cenario: Validação valores inválidos na página de Login 
        Dado informo o E-mail inválido: "leonardo.rodrigues@solu.com.br"
        E informo senha: "Testing"
        E clico no botão Entrar
        Então verifico a mensagem de erro de login inválido: "Endereço de e-mail ou senha inválidos!"