# language: pt
@EsqueciMinhaSenha @ExecucaoCompleta 
Funcionalidade: Esqueci minha senha


@EsqueciMinhaSenha 
Cenario: Clicar em "Enviar email" com o campo email vazio
    Dado clico no link: "Esqueceu a senha?"
    E clico no botão: "Enviar email"
    Então valido erro ao deixar campo email nulo


@EsqueciMinhaSenha
Cenario: Clicar em "Enviar email" com o campo email inválido
    Dado clico no link: "Esqueceu a senha?"
    E informo o E-mail inválido: "leonardo.rodrigues"
    E clico no botão: "Enviar email"
    Então valido erro ao deixar campo email inválido


@EsqueciMinhaSenha 
Cenario: Clicar em "Enviar email" com o campo email válido
    Dado clico no link: "Esqueceu a senha?"
    E informo o E-mail válido: "leonardo.rodrigues@soluti.com.br"
    E clico no botão: "Enviar email"
    Então valido mensagem de successo ao informar email válido: "Enviamos um e-mail para você!"

    
@EsqueciMinhaSenha
Cenario: Clicar em "Reenviar confirmação" na tela de sucesso de envio de redefinição de senha
    Dado clico no link: "Esqueceu a senha?"
    E informo o E-mail válido: "leonardo.rodrigues@soluti.com.br"
    E clico no botão: "Enviar email"
    E clico no botão: "Reenviar confirmação"
    Então valido mensagem de successo ao reenviar confirmação: "Enviamos outro e-mail para você!"


@EsqueciMinhaSenha
Cenario: Clicar em "Alterar e-mail" na tela de sucesso de envio de redefinição de senha
    Dado clico no link: "Esqueceu a senha?"
    E informo o E-mail válido: "leonardo.rodrigues@soluti.com.br"
    E clico no botão: "Enviar email"
    E clico no link: "Alterar e-mail"
    Então valido campo email vazio na tela de redefinição de senha


# @EsqueciMinhaSenha
# Cenario: Clicar em "Redefinir senha" no email de recuperação da senha
# Dado criar conta com a ferramenta Mail7
# E faço o logoff do perfil
# E clico no link: "Esqueceu a senha?"
# E informo o email do Mail7
# E clico no botão: "Enviar email"
# E abrir Mail7 em outra guia
# E acesso o email criado no Mail7
# E clico no botão ir para o inbox
# E acesso o inbox do Mail7: "Leonardo Raupp Rodrigues, esqueceu sua senha?"
# E clico no botão inbox para validar: "Redefinir senha"
# Então valido a tela de Redefinição de senha

@EsqueciMinhaSenha @AmbienteTesting
Cenario: Clicar em "Redefinir senha" no email de recuperação da senha(MailCatcher)
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
    E faço o logoff do perfil
    E clico no link: "Esqueceu a senha?"
    E informo o email do Mail7
    E clico no botão: "Enviar email"
    E acesso o inbox do Mail Catcher: "Leonardo Raupp Rodrigues, esqueceu sua senha?"
    E clico no botão do inbox MailCatcher: "Redefinir senha"
    E abro o Mail Catcher
    E acesso a mensagem de redefinição da senha no inbox do MailCatcher: "Leonardo Raupp Rodrigues, esqueceu sua senha?"
    Então valido a tela de Redefinição de senha


# @EsqueciMinhaSenha
# Cenario: Preencher o campo senha com dados válidos na tela de Redefinição de senha
# Dado criar conta com a ferramenta Mail7
# E faço o logoff do perfil
# E clico no link: "Esqueceu a senha?"
# E informo o email do Mail7
# E clico no botão: "Enviar email"
# E valido mensagem de successo ao informar email válido: "Enviamos um e-mail para você!"
# E abrir Mail7 em outra guia
# E acesso o email criado no Mail7
# E clico no botão ir para o inbox
# E acesso o inbox do Mail7: "Leonardo Raupp Rodrigues, esqueceu sua senha?"
# E clico no botão inbox para validar: "Redefinir senha"
# E informo senha: "TestingCompany123"
# E clico no botão: "Cadastrar"
# Então valido senha alterada com sucesso

@EsqueciMinhaSenha @AmbienteTesting
Cenario: Preencher o campo senha com dados válidos na tela de Redefinição de senha(MailCatcher)
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
    E faço o logoff do perfil
    E clico no link: "Esqueceu a senha?"
    E informo o email do Mail7
    E clico no botão: "Enviar email"
    E valido mensagem de successo ao informar email válido: "Enviamos um e-mail para você!"
    E abro o Mail Catcher
    E acesso o inbox do Mail Catcher: "Leonardo Raupp Rodrigues, esqueceu sua senha?"
    E clico no botão do inbox MailCatcher: "Redefinir senha"
    E informo senha: "TestingCompany123"
    E clico no botão: "Cadastrar"
    Então valido senha alterada com sucesso


# @EsqueciMinhaSenha
# Cenario:  Validar o campo senha sem o mínimo de 6 caracteres na tela de Redefinição de senha
# Dado criar conta com a ferramenta Mail7
# E faço o logoff do perfil
# E clico no link: "Esqueceu a senha?"
# E informo o email do Mail7
# E clico no botão: "Enviar email"
# E valido mensagem de successo ao informar email válido: "Enviamos um e-mail para você!"
# E abrir Mail7 em outra guia
# E acesso o email criado no Mail7
# E clico no botão ir para o inbox
# E acesso o inbox do Mail7: "Leonardo Raupp Rodrigues, esqueceu sua senha?"
# E clico no botão inbox para validar: "Redefinir senha"
# E informo senha: "Tc1"
# E clico no botão: "Cadastrar"
# Então valido botão Cadastrar desabilitado

@EsqueciMinhaSenha @AmbienteTesting
Cenario: Validar o campo senha sem o mínimo de 6 caracteres na tela de Redefinição de senha(MailCatcher)
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
    E faço o logoff do perfil
    E clico no link: "Esqueceu a senha?"
    E informo o email do Mail7
    E clico no botão: "Enviar email"
    E valido mensagem de successo ao informar email válido: "Enviamos um e-mail para você!"
    E abro o Mail Catcher
    E acesso o inbox do Mail Catcher: "Leonardo Raupp Rodrigues, esqueceu sua senha?"
    E clico no botão do inbox MailCatcher: "Redefinir senha"
    E informo senha: "Tc1"
    E clico no botão: "Cadastrar"
    Então valido botão Cadastrar desabilitado


# @EsqueciMinhaSenha
# Cenario: Validar o campo senha sem uma letra maiúscula na tela de Redefinição de senha
# Dado criar conta com a ferramenta Mail7
# E faço o logoff do perfil
# E clico no link: "Esqueceu a senha?"
# E informo o email do Mail7
# E clico no botão: "Enviar email"
# E valido mensagem de successo ao informar email válido: "Enviamos um e-mail para você!"
# E abrir Mail7 em outra guia
# E acesso o email criado no Mail7
# E clico no botão ir para o inbox
# E acesso o inbox do Mail7: "Leonardo Raupp Rodrigues, esqueceu sua senha?"
# E clico no botão inbox para validar: "Redefinir senha"
# E informo senha: "testing123"
# E clico no botão: "Cadastrar"
# Então valido botão Cadastrar desabilitado

@EsqueciMinhaSenha @AmbienteTesting
Cenario: Validar o campo senha sem uma letra maiúscula na tela de Redefinição de senha(MailCatcher)
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
    E faço o logoff do perfil
    E clico no link: "Esqueceu a senha?"
    E informo o email do Mail7
    E clico no botão: "Enviar email"
    E valido mensagem de successo ao informar email válido: "Enviamos um e-mail para você!"
    E abro o Mail Catcher
    E acesso o inbox do Mail Catcher: "Leonardo Raupp Rodrigues, esqueceu sua senha?"
    E clico no botão do inbox MailCatcher: "Redefinir senha"
    E informo senha: "testing123"
    E clico no botão: "Cadastrar"
    Então valido botão Cadastrar desabilitado


# @EsqueciMinhaSenha
# Cenario: Validar o campo senha sem uma letra minúscula na tela de Redefinição de senha
# Dado criar conta com a ferramenta Mail7
# E faço o logoff do perfil
# E clico no link: "Esqueceu a senha?"
# E informo o email do Mail7
# E clico no botão: "Enviar email"
# E valido mensagem de successo ao informar email válido: "Enviamos um e-mail para você!"
# E abrir Mail7 em outra guia
# E acesso o email criado no Mail7
# E clico no botão ir para o inbox
# E acesso o inbox do Mail7: "Leonardo Raupp Rodrigues, esqueceu sua senha?"
# E clico no botão inbox para validar: "Redefinir senha"
# E informo senha: "TESTING123"
# E clico no botão: "Cadastrar"
# Então valido botão Cadastrar desabilitado

@EsqueciMinhaSenha @AmbienteTesting
Cenario: Validar o campo senha sem uma letra minúscula na tela de Redefinição de senha(MailCatcher)
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
    E faço o logoff do perfil
    E clico no link: "Esqueceu a senha?"
    E informo o email do Mail7
    E clico no botão: "Enviar email"
    E valido mensagem de successo ao informar email válido: "Enviamos um e-mail para você!"
    E abro o Mail Catcher
    E acesso o inbox do Mail Catcher: "Leonardo Raupp Rodrigues, esqueceu sua senha?"
    E clico no botão do inbox MailCatcher: "Redefinir senha"
    E informo senha: "TESTING123"
    E clico no botão: "Cadastrar"
    Então valido botão Cadastrar desabilitado


# @EsqueciMinhaSenha
# Cenario: Validar o campo senha sem um número na tela de Redefinição de senha
# Dado criar conta com a ferramenta Mail7
# E faço o logoff do perfil
# E clico no link: "Esqueceu a senha?"
# E informo o email do Mail7
# E clico no botão: "Enviar email"
# E valido mensagem de successo ao informar email válido: "Enviamos um e-mail para você!"
# E abrir Mail7 em outra guia
# E acesso o email criado no Mail7
# E clico no botão ir para o inbox
# E acesso o inbox do Mail7: "Leonardo Raupp Rodrigues, esqueceu sua senha?"
# E clico no botão inbox para validar: "Redefinir senha"
# E informo senha: "Testing"
# E clico no botão: "Cadastrar"
# Então valido botão Cadastrar desabilitado

@EsqueciMinhaSenha @AmbienteTesting
Cenario: Validar o campo senha sem um número na tela de Redefinição de senha(MailCatcher)
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
    E faço o logoff do perfil
    E clico no link: "Esqueceu a senha?"
    E informo o email do Mail7
    E clico no botão: "Enviar email"
    E valido mensagem de successo ao informar email válido: "Enviamos um e-mail para você!"
    E abro o Mail Catcher
    E acesso o inbox do Mail Catcher: "Leonardo Raupp Rodrigues, esqueceu sua senha?"
    E clico no botão do inbox MailCatcher: "Redefinir senha"
    E informo senha: "Testing"
    E clico no botão: "Cadastrar"
    Então valido botão Cadastrar desabilitado


@EsqueciMinhaSenha @AmbienteTesting 
Cenario: Clicar em "Fazer login" na tela de redefinição de senha(MailCatcher)
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
    E aguardo o carregamento
    E faço o logoff do perfil
    E clico no link: "Esqueceu a senha?"
    E informo o email do Mail7
    E clico no botão: "Enviar email"
    E valido mensagem de successo ao informar email válido: "Enviamos um e-mail para você!"
    E abro o Mail Catcher
    E acesso o inbox do Mail Catcher: "Leonardo Raupp Rodrigues, esqueceu sua senha?"
    E clico no botão do inbox MailCatcher: "Redefinir senha"
    E clico no link: "Fazer login"
    Então verifico tela login









