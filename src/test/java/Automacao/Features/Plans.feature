# language: pt
@Plans @ExecucaoCompleta
Funcionalidade: planos e serviços

    Contexto: 
    Dado acesso o sistema com usuario: "padrao"

    
    @ContratacaoPlano
    Cenario: validação de contratação de plano
        Dado acessei o perfil do usuario
        E clico no botão: "Alterar meu plano"
        E escolho o plano: "Standard (Mensal)"
        E informo o CPF-CNPJ com: "44731266092"
        E informo o CEP com: "93612200"
        E informo o Endereço com: "rua dos testes"
        E informo a Cidade com: "novo hamburgo"
        E informo o Estado com: "Rio Grande do Sul"
        E informo o Pais com: "Brasil"
        E informo o Numero do cartão com: "4000000000000010"
        E informo o Mês de vencimento do cartão com: "01"
        E informo o Ano de vencimento do cartão com: "2025"
        E informo o CVV do cartão com: "903"
        E informo o Nome no cartão com: "Tony Stark"
        E clico no botão: "Pagar"
        E confirmo contratação concluida com: "Seu pedido foi concluído com sucesso"
        E vou para a home
        E acessei o perfil do usuario
        Então valido plano contratado

    @CancelamentoPlano
    Cenario: cancelamento de plano
        Dado acessei o perfil do usuario
        E clico no botão: "Cancelar meu plano"
        E confirmo o cancelamento
        Então valido mensagem de cancelamento do plano
        
    @ContratacaoPlano
    Cenario: validação de contratação de um plano e contratando outro logo em seguida
        Dado acessei o perfil do usuario
        E clico no botão: "Alterar meu plano"
        E escolho o plano: "Standard (Mensal)"
        E informo o CPF-CNPJ com: "44731266092"
        E informo o CEP com: "93612200"
        E informo o Endereço com: "rua dos testes"
        E informo a Cidade com: "novo hamburgo"
        E informo o Estado com: "Rio Grande do Sul"
        E informo o Pais com: "Brasil"
        E informo o Numero do cartão com: "4000000000000010"
        E informo o Mês de vencimento do cartão com: "01"
        E informo o Ano de vencimento do cartão com: "2025"
        E informo o CVV do cartão com: "903"
        E informo o Nome no cartão com: "Tony Stark"
        E clico no botão: "Pagar"
        E confirmo contratação concluida com: "Seu pedido foi concluído com sucesso"
        E vou para a home
        E acessei o perfil do usuario
        E clico no botão: "Alterar meu plano"
        E escolho o plano: "Business (Mensal)"
        E informo o CPF-CNPJ com: "44731266092"
        E informo o CEP com: "93612200"
        E informo o Endereço com: "rua dos testes"
        E informo a Cidade com: "novo hamburgo"
        E informo o Estado com: "Rio Grande do Sul"
        E informo o Pais com: "Brasil"
        E informo o Numero do cartão com: "4000000000000010"
        E informo o Mês de vencimento do cartão com: "01"
        E informo o Ano de vencimento do cartão com: "2025"
        E informo o CVV do cartão com: "903"
        E informo o Nome no cartão com: "Tony Stark"
        E clico no botão: "Pagar"
        E confirmo contratação concluida com: "Seu pedido foi concluído com sucesso"
        E vou para a home
        E acessei o perfil do usuario
        Então valido plano contratado

    @CancelamentoPlano
    Cenario: cancelamento de plano
        Dado acessei o perfil do usuario
        E clico no botão: "Cancelar meu plano"
        E confirmo o cancelamento
        Então valido mensagem de cancelamento do plano

    
    @ContratacaoPlanoSemCPF
    Cenario: validação de contratação de plano sem preenhcer o CPF
        Dado acessei o perfil do usuario
        E clico no botão: "Alterar meu plano"
        E escolho o plano: "Standard (Mensal)"
        #E informo o CPF-CNPJ com: "44731266092"
        E informo o CEP com: "93612200"
        E informo o Endereço com: "rua dos testes"
        E informo a Cidade com: "novo hamburgo"
        E informo o Estado com: "Rio Grande do Sul"
        E informo o Pais com: "Brasil"
        E informo o Numero do cartão com: "4000000000000010"
        E informo o Mês de vencimento do cartão com: "01"
        E informo o Ano de vencimento do cartão com: "2025"
        E informo o CVV do cartão com: "903"
        E informo o Nome no cartão com: "Tony Stark"
        Então valida campo: "CPF/CNPJ" não preenchido
        
    @ContratacaoPlanoSemCEP
    Cenario: validação de contratação de plano sem preenhcer o CEP
        Dado acessei o perfil do usuario
        E clico no botão: "Alterar meu plano"
        E escolho o plano: "Standard (Mensal)"
        E informo o CPF-CNPJ com: "44731266092"
        #E informo o CEP com: "93612200"
        E informo o Endereço com: "rua dos testes"
        E informo a Cidade com: "novo hamburgo"
        E informo o Estado com: "Rio Grande do Sul"
        E informo o Pais com: "Brasil"
        E informo o Numero do cartão com: "4000000000000010"
        E informo o Mês de vencimento do cartão com: "01"
        E informo o Ano de vencimento do cartão com: "2025"
        E informo o CVV do cartão com: "903"
        E informo o Nome no cartão com: "Tony Stark"
        Então valida campo: "CEP" não preenchido
        
    @ContratacaoPlanoSemEndereco
    Cenario: validação de contratação de plano sem preenhcer o Endereço
        Dado acessei o perfil do usuario
        E clico no botão: "Alterar meu plano"
        E escolho o plano: "Standard (Mensal)"
        E informo o CPF-CNPJ com: "44731266092"
        E informo o CEP com: "93612200"
        #E informo o Endereço com: "rua dos testes"
        E informo a Cidade com: "novo hamburgo"
        E informo o Estado com: "Rio Grande do Sul"
        E informo o Pais com: "Brasil"
        E informo o Numero do cartão com: "4000000000000010"
        E informo o Mês de vencimento do cartão com: "01"
        E informo o Ano de vencimento do cartão com: "2025"
        E informo o CVV do cartão com: "903"
        E informo o Nome no cartão com: "Tony Stark"
        Então valida campo: "Endereço" não preenchido
        
    @ContratacaoPlanoSemCidade
    Cenario: validação de contratação de plano sem preenhcer a Cidade
        Dado acessei o perfil do usuario
        E clico no botão: "Alterar meu plano"
        E escolho o plano: "Standard (Mensal)"
        E informo o CPF-CNPJ com: "44731266092"
        E informo o CEP com: "93612200"
        E informo o Endereço com: "rua dos testes"
        #E informo a Cidade com: "novo hamburgo"
        E informo o Estado com: "Rio Grande do Sul"
        E informo o Pais com: "Brasil"
        E informo o Numero do cartão com: "4000000000000010"
        E informo o Mês de vencimento do cartão com: "01"
        E informo o Ano de vencimento do cartão com: "2025"
        E informo o CVV do cartão com: "903"
        E informo o Nome no cartão com: "Tony Stark"
        Então valida campo: "Cidade" não preenchido

    @ContratacaoPlanoSemEstado
    Cenario: validação de contratação de plano sem preenhcer o Estado
        Dado acessei o perfil do usuario
        E clico no botão: "Alterar meu plano"
        E escolho o plano: "Standard (Mensal)"
        E informo o CPF-CNPJ com: "44731266092"
        E informo o CEP com: "93612200"
        E informo o Endereço com: "rua dos testes"
        E informo a Cidade com: "novo hamburgo"
        #E informo o Estado com: "Rio Grande do Sul"
        E informo o Pais com: "Brasil"
        E informo o Numero do cartão com: "4000000000000010"
        E informo o Mês de vencimento do cartão com: "01"
        E informo o Ano de vencimento do cartão com: "2025"
        E informo o CVV do cartão com: "903"
        E informo o Nome no cartão com: "Tony Stark"
        Então valida campo: "Estado" não preenchido

    @ContratacaoPlanoSemPais
    Cenario: validação de contratação de plano sem preenhcer o País
        Dado acessei o perfil do usuario
        E clico no botão: "Alterar meu plano"
        E escolho o plano: "Standard (Mensal)"
        E informo o CPF-CNPJ com: "44731266092"
        E informo o CEP com: "93612200"
        E informo o Endereço com: "rua dos testes"
        E informo a Cidade com: "novo hamburgo"
        E informo o Estado com: "Rio Grande do Sul"
        #E informo o Pais com: "Brasil"
        E informo o Numero do cartão com: "4000000000000010"
        E informo o Mês de vencimento do cartão com: "01"
        E informo o Ano de vencimento do cartão com: "2025"
        E informo o CVV do cartão com: "903"
        E informo o Nome no cartão com: "Tony Stark"
        Então valida campo: "País" não preenchido
        
    @ContratacaoPlanoSemNumeroCartao
    Cenario: validação de contratação de plano sem preenhcer o Número do cartão
        Dado acessei o perfil do usuario
        E clico no botão: "Alterar meu plano"
        E escolho o plano: "Standard (Mensal)"
        E informo o CPF-CNPJ com: "44731266092"
        E informo o CEP com: "93612200"
        E informo o Endereço com: "rua dos testes"
        E informo a Cidade com: "novo hamburgo"
        E informo o Estado com: "Rio Grande do Sul"
        E informo o Pais com: "Brasil"
        #E informo o Numero do cartão com: "4000000000000010"
        E informo o Mês de vencimento do cartão com: "01"
        E informo o Ano de vencimento do cartão com: "2025"
        E informo o CVV do cartão com: "903"
        E informo o Nome no cartão com: "Tony Stark"
        Então valida campo: "Número do cartão" não preenchido
        
    @ContratacaoPlanoSemMesVencimento
    Cenario: validação de contratação de plano sem preenhcer o Mês de vencimento do cartão
        Dado acessei o perfil do usuario
        E clico no botão: "Alterar meu plano"
        E escolho o plano: "Standard (Mensal)"
        E informo o CPF-CNPJ com: "44731266092"
        E informo o CEP com: "93612200"
        E informo o Endereço com: "rua dos testes"
        E informo a Cidade com: "novo hamburgo"
        E informo o Estado com: "Rio Grande do Sul"
        E informo o Pais com: "Brasil"
        E informo o Numero do cartão com: "4000000000000010"
        #E informo o Mês de vencimento do cartão com: "01"
        E informo o Ano de vencimento do cartão com: "2025"
        E informo o CVV do cartão com: "903"
        E informo o Nome no cartão com: "Tony Stark"
        Então valida campo: "Mês" não preenchido
        
    @ContratacaoPlanoSemAnoVencimento
    Cenario: validação de contratação de plano sem preenhcer o Ano de vencimento do cartão
        Dado acessei o perfil do usuario
        E clico no botão: "Alterar meu plano"
        E escolho o plano: "Standard (Mensal)"
        E informo o CPF-CNPJ com: "44731266092"
        E informo o CEP com: "93612200"
        E informo o Endereço com: "rua dos testes"
        E informo a Cidade com: "novo hamburgo"
        E informo o Estado com: "Rio Grande do Sul"
        E informo o Pais com: "Brasil"
        E informo o Numero do cartão com: "4000000000000010"
        E informo o Mês de vencimento do cartão com: "01"
        #E informo o Ano de vencimento do cartão com: "2025"
        E informo o CVV do cartão com: "903"
        E informo o Nome no cartão com: "Tony Stark"
        Então valida campo: "Ano" não preenchido
        
    @ContratacaoPlanoSemCVV
    Cenario: validação de contratação de plano sem preenhcer o CVV do cartão
        Dado acessei o perfil do usuario
        E clico no botão: "Alterar meu plano"
        E escolho o plano: "Standard (Mensal)"
        E informo o CPF-CNPJ com: "44731266092"
        E informo o CEP com: "93612200"
        E informo o Endereço com: "rua dos testes"
        E informo a Cidade com: "novo hamburgo"
        E informo o Estado com: "Rio Grande do Sul"
        E informo o Pais com: "Brasil"
        E informo o Numero do cartão com: "4000000000000010"
        E informo o Mês de vencimento do cartão com: "01"
        E informo o Ano de vencimento do cartão com: "2025"
        #E informo o CVV do cartão com: "903"
        E informo o Nome no cartão com: "Tony Stark"
        Então valida campo: "CVV" não preenchido
        
    @ContratacaoPlanoSemNome
    Cenario: validação de contratação de plano sem preenhcer o Nome no cartão
        Dado acessei o perfil do usuario
        E clico no botão: "Alterar meu plano"
        E escolho o plano: "Standard (Mensal)"
        E informo o CPF-CNPJ com: "44731266092"
        E informo o CEP com: "93612200"
        E informo o Endereço com: "rua dos testes"
        E informo a Cidade com: "novo hamburgo"
        E informo o Estado com: "Rio Grande do Sul"
        E informo o Pais com: "Brasil"
        E informo o Numero do cartão com: "4000000000000010"
        E informo o Mês de vencimento do cartão com: "01"
        E informo o Ano de vencimento do cartão com: "2025"
        E informo o CVV do cartão com: "903"
        #E informo o Nome no cartão com: "Tony Stark"
        Então valida campo: "Nome no cartão" não preenchido


    @ContratacaoPlano
    Cenario: validação de contratação de plano
        Dado acessei o perfil do usuario
        E clico no botão: "Alterar meu plano"
        E escolho o plano: "Standard (Mensal)"
        E informo o CPF-CNPJ com: "44731266092"
        E informo o CEP com: "93612200"
        E informo o Endereço com: "rua dos testes"
        E informo a Cidade com: "novo hamburgo"
        E informo o Estado com: "Rio Grande do Sul"
        E informo o Pais com: "Brasil"
        E informo o Numero do cartão com: "4000000000000010"
        E informo o Mês de vencimento do cartão com: "01"
        E informo o Ano de vencimento do cartão com: "2025"
        E informo o CVV do cartão com: "903"
        E informo o Nome no cartão com: "Tony Stark"
        E clico no botão: "Pagar"
        E confirmo contratação concluida com: "Seu pedido foi concluído com sucesso"
        E vou para a home
        E acessei o perfil do usuario
        Então valido plano contratado
