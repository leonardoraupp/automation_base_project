
ARQUIVO DE CONFIGURAÇÃO DO TESTE AUTOMATIZADO:

O arquivo se encontra em:
soluti\src\test\java
	conf.json
		{
			"url":"https://dev.assine.online/",
			"plataforma":"Windows",
			"headless":false
		}

	EXPLICANDO:
		url = link da aplicação onde será rodado os testes
		plataforma = plataforma onde esta sendo rodado, é necessário pois os drivers são diferentes
			OPÇÔES:
				Windows
				Linux
		headless = Indica ao teste se você deseja rodar o mesmo por linha de comando.
			OPÇÕES:
				true
				false

===============================================================================================================
EXECUÇÃO DO TESTE:

Para rodar o teste basta executar o comando:
	mvn test

Se desejar rodar apenas um teste ou um conjuto de teste, pode passar como parâmetro a tag da seguinte maneira:
	mvn test -Dcucumber.filter.tags="@tag_do_teste"
	ou
	mvn test -Dcucumber.filter.tags="@tag_do_teste1, @tag_do_teste2, @tag_do_teste3"

Se desejar rodar todos os testes do projeto:
	1. Acesse cada arquivo.feature do projeto.
	2. Após a sentença "# language: pt" dê uma quebra de linha e digite "@test".
	3. Então dê o comando mvn test no terminal para executar todos os testes.

Se desejar rodar todos os testes do projeto sem o comando mvn test:
	1. Acesse cada arquivo.feature do projeto.
	2. Após a sentença "# language: pt" dê uma quebra de linha e digite "@test".
	3. Então acesse "Runner/RunnerTest.java" e aperte o botão Run Java para executar todos os testes.



Para rodar o testes no Docker Compose:
Acessar o documento config.json
Setar a variável docker para "true"


Pasta da automação deve ficar dentro da pasta Documents



===============================================================================================================
INSTALAÇÕES:

Necessario instalar o Java: jdk 1.8
Criar a variavel de ambiente nas variaveis do sistema com nome: 'JAVA_HOME' e o caminho até o arquivo, 
comumente encontrada no caminho: 'C:\Program Files\Java\jdk1.8...' 

fazer o download do Maven https://maven.apache.org/download.cgi;
adicionar a pasta baixada no C:...;
nas variaveis do sistema, adicionar um novo item no path com o caminho C:\maven\bin


===============================================================================================================
RODAR TESTES DE EMAIL MAILCATCHER EM AMBIENTE TESTING:

Necessário acessar o documento SetUp.java e mudar o conteúdo do elemento Base_Url para "urlTesting"

Necessário acessar o documento RunnerTest.java e mudar o conteúdo do elemento  tags, tags = "@test", ficando: tags = "@test or @AmbienteTesting"
