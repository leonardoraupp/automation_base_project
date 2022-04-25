# language: pt
@Dashboard @ExecucaoCompleta
Funcionalidade: Acesso ao Dashboard

Contexto:
Dado acesso o sistema com usuario: "padrao"

@Dashboard
Cenario: Validação adicionar documento ao clicar
    Dado clico no botão: "Buscar em"
    Então anexo um documento para assinar em Dashboard: "pdf"

@Dashboard
Cenario: Validação adicionar documento ao arrastar
    Dado arrasto um documento para upload
    Então verifico documento na Dropzone
    
