# language: pt
@criarconta @ExecucaoCompleta
Funcionalidade: Criar Conta



@CriarConta
Cenario: Validar clicar no botão Criar conta
Dado clico no botão criar conta
Então valido acesso à tela de cadastro

# @CriarConta 
# Cenario: Criar uma conta com a ferramenta Mail7
# Dado abrir Mail7 em outra guia
# E informo um nome para um email temporário: "leonardoraupp"
# E clico no botão ir para o inbox
# E copio o email do Mail7
# E saio do site Mail7
# E clico no botão criar conta
# E informo nome completo: "Leonardo Raupp Rodrigues"
# E informo o email do Mail7
# E informo celular: "51 9"
# E informo senha: "Testing123"
# E aceito os termos
# E clico no botão: "Cadastrar"
# E aguardo o carregamento
# E aguardo a mensagem de cadastro realizado
# E saio do Assine Online
# E acesso o inbox do Mail7: "Bem-vindo(a) ao Assine.Online! Confirme seu email"
# E clico no botão inbox para validar: "Confirmar"
# Então verifico usuario logado


@CriarConta @AmbienteTesting
Cenario: Criar uma conta com a ferramenta Mail7(MailCatcher)
Dado abrir Mail7 em outra guia
E informo um nome para um email temporário: "leonardoraupp"
E clico no botão ir para o inbox
E copio o email do Mail7
E saio do site Mail7
E clico no botão criar conta
E informo nome completo: "Leonardo Raupp Rodrigues"
E informo o email do Mail7
E informo celular: "51 9"
E informo senha: "Testing123"
E aceito os termos
E clico no botão: "Cadastrar"
E aguardo a mensagem de cadastro realizado
E saio do Assine Online
E abro o Mail Catcher
E acesso o inbox do Mail Catcher: "Bem-vindo(a) ao Assine.Online! Confirme seu email"
E clico no botão do inbox MailCatcher: "Confirmar"
E aguardo o carregamento
Então verifico usuario logado

# @CriarConta
# Cenario: Criar uma conta com um email válido
# Dado clico no botão criar conta
# E informo nome completo: "Leonardo Raupp Rodrigues"
# E informo o E-mail válido: "leonardoraupprodrigues23115614@mail7.io"
# E informo celular: "51 9"
# E informo senha: "Testing123"
# E aceito os termos
# E clico no botão: "Cadastrar"
# Então valido mensagem de cadastro: "Cadastro realizado com sucesso!"

 
@CriarConta 
Cenario: Criar uma conta com um email inválido
Dado clico no botão criar conta
E informo nome completo: "Leonardo Raupp Rodrigues"
E informo o E-mail inválido: "leonardo.rodriguestestingcompany."
E informo celular: "51 9"
E informo senha: "Testing123"
E aceito os termos
E clico no botão: "Cadastrar"
Então valido email inválido


@CriarConta
Cenario: Criar uma conta e reenviar email de confirmação
Dado abrir Mail7 em outra guia
E informo um nome para um email temporário: "leonardoraupp"
E clico no botão ir para o inbox
E copio o email do Mail7
E saio do site Mail7
E clico no botão criar conta
E informo nome completo: "Leonardo Raupp Rodrigues"
E informo o email do Mail7
E informo celular: "51 9"
E informo senha: "Testing123"
E aceito os termos
E clico no botão: "Cadastrar"
E aguardo o carregamento
E clico no botão reenviar confirmação
Então valido email enviado com sucesso


# @CriarConta
# Cenario: Criar uma conta e confirmar email de confirmação
# Dado abrir Mail7 em outra guia
# E informo um nome para um email temporário: "leonardoraupp"
# E clico no botão ir para o inbox
# E copio o email do Mail7
# E saio do site Mail7
# E clico no botão criar conta
# E informo nome completo: "Leonardo Raupp Rodrigues"
# E informo o email do Mail7
# E informo celular: "51 9"
# E informo senha: "Testing123"
# E aceito os termos
# E clico no botão: "Cadastrar"
# E aguardo o carregamento
# E aguardo a mensagem de cadastro realizado
# E saio do Assine Online
# E acesso o inbox do Mail7: "Bem-vindo(a) ao Assine.Online! Confirme seu email"
# E clico no botão inbox para validar: "Confirmar"
# Então valido acesso ao Dashboard do Assine Online

@CriarConta @AmbienteTesting
Cenario: Criar uma conta e confirmar email de confirmação(MailCatcher)
Dado abrir Mail7 em outra guia
E informo um nome para um email temporário: "leonardoraupp"
E clico no botão ir para o inbox
E copio o email do Mail7
E saio do site Mail7
E clico no botão criar conta
E informo nome completo: "Leonardo Raupp Rodrigues"
E informo o email do Mail7
E informo celular: "51 9"
E informo senha: "Testing123"
E aceito os termos
E clico no botão: "Cadastrar"
E aguardo a mensagem de cadastro realizado
E saio do Assine Online
E abro o Mail Catcher
E acesso o inbox do Mail Catcher: "Bem-vindo(a) ao Assine.Online! Confirme seu email"
E clico no botão do inbox MailCatcher: "Confirmar"
E aguardo o carregamento
Então valido acesso ao Dashboard do Assine Online


@CriarConta
Cenario: Criar uma conta com um email já cadastrado
Dado clico no botão criar conta
E informo nome completo: "Leonardo Raupp Rodrigues"
E informo o E-mail válido: "leonardo.rodrigues@testingcompany.com.br"
E informo celular: "51 9"
E informo senha: "Testing123"
E aceito os termos
E clico no botão: "Cadastrar"
Então valido email já cadastrado

@CriarConta
Cenario: Criar uma conta com um telefone já cadastrado
Dado abrir Mail7 em outra guia
E informo um nome para um email temporário: "leonardoraupp"
E clico no botão ir para o inbox
E copio o email do Mail7
E saio do site Mail7
E clico no botão criar conta
E informo nome completo: "Leonardo Raupp Rodrigues"
E informo o email do Mail7
E informo telefone já cadastrado: "51 997265069"
E informo senha: "Testing123"
E aceito os termos
E clico no botão: "Cadastrar"
Então valido telefone já cadastrado

@CriarConta
Cenario: Criar uma conta com o campo nome nulo
Dado clico no botão criar conta
E informo o E-mail válido: "leonardo.rodrigues@testingcompany.com.br"
E informo celular: "51 9"
E informo senha: "Testing123"
E aceito os termos
E clico no botão: "Cadastrar"
Então valido a mensagem de erro do campo nome nulo  

@CriarConta
Cenario: Criar uma conta com o campo email nulo
Dado clico no botão criar conta
E informo nome completo: "Leonardo Raupp Rodrigues"
E informo celular: "51 9"
E informo senha: "Testing123"
E aceito os termos
E clico no botão: "Cadastrar"
Então valido a mensagem de erro do campo email nulo

@CriarConta
Cenario: Criar uma conta com o campo senha nulo
Dado clico no botão criar conta
E informo nome completo: "Leonardo Raupp Rodrigues"
E informo o E-mail válido: "leonardo.rodrigues@testingcompany.com.br"
E informo celular: "51 9"
E aceito os termos
E clico no botão: "Cadastrar"
Então valido a mensagem de erro do campo senha nulo  

@CriarConta
Cenario: Criar uma conta com o campo senha sem 6 caracteres
Dado clico no botão criar conta
E informo nome completo: "Leonardo Raupp Rodrigues"
E informo o E-mail válido: "leonardo.rodrigues@testingcompany.com.br"
E informo celular: "51 9"
E informo senha: "Tes0"
E aceito os termos
E clico no botão: "Cadastrar"
Então valido conta não criada  

@CriarConta
Cenario: Criar uma conta com o campo senha sem uma letra minúscula
Dado clico no botão criar conta
E informo nome completo: "Leonardo Raupp Rodrigues"
E informo o E-mail válido: "leonardo.rodrigues@testingcompany.com.br"
E informo celular: "51 9"
E informo senha: "TESTING123"
E aceito os termos
E clico no botão: "Cadastrar"
Então valido conta não criada  

@CriarConta
Cenario: Criar uma conta com o campo senha sem uma letra maiúscula
Dado clico no botão criar conta
E informo nome completo: "Leonardo Raupp Rodrigues"
E informo o E-mail válido: "leonardo.rodrigues@testingcompany.com.br"
E informo celular: "51 9"
E informo senha: "testing123"
E aceito os termos
E clico no botão: "Cadastrar"
Então valido conta não criada  

@CriarConta
Cenario: Criar uma conta com o campo senha sem um número
Dado clico no botão criar conta
E informo nome completo: "Leonardo Raupp Rodrigues"
E informo o E-mail válido: "leonardo.rodrigues@testingcompany.com.br"
E informo celular: "51 9"
E informo senha: "Testing"
E aceito os termos
E clico no botão: "Cadastrar"
Então valido conta não criada  
 
@CriarConta
Cenario: Criar uma conta com dados válidos sem selecionar o campo checkbox
Dado clico no botão criar conta
E informo nome completo: "Leonardo Raupp Rodrigues"
E informo o E-mail válido: "leonardo.rodrigues@testingcompany.com.br"
E informo celular: "51 9"
E informo senha: "Testing123"
E clico no botão: "Cadastrar"
Então valido botão Cadastrar desabilitado

@CriarConta
Cenario: Clicar em termos de uso
Dado clico no botão criar conta
E informo nome completo: "Leonardo Raupp Rodrigues"
E informo o E-mail válido: "leonardo.rodrigues@testingcompany.com.br"
E informo celular: "51 9"
E informo senha: "Testing123"
E clico em termos de uso
Então valido Termos de Uso aberto  

@CriarConta
Cenario: Clicar em Políticas de privacidade
Dado clico no botão criar conta
E informo nome completo: "Leonardo Raupp Rodrigues"
E informo o E-mail válido: "leonardo.rodrigues@testingcompany.com.br"
E informo celular: "51 9"
E informo senha: "Testing123"
E clico em políticas de privacidade
Então valido Políticas de privacidade aberta  

@CriarConta
Cenario: Clicar em Entrar
Dado clico no botão criar conta
E clico no link Entrar
Então valido página Login acessada

