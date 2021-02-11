# Teste de Seleção CM

Para executar o projeto de testes automatizados é necessário seguir alguns passos:

•	Instalar Java Development Kit (JDK): www.oracle.com/us/technologies/java/

	  o Criar a variável JAVA_HOME e apontar para o caminho de instalação do JDK.
	  o Incluir na variável PATH: %JAVA_HOME%\bin
	  
•	Instalar o MAVEN:  https://maven.apache.org/download.cgi

	  o Configurar a variável de ambiente PATH, apontando para o caminho de instalação do Maven. 
	    Ex: C:\Java\Maven\apache-maven-3.2.5\bin
•	Instalar o Chrome: https://www.google.com/intl/pt-BR/chrome/

•	Instalar o ChromeDriver: https://chromedriver.chromium.org/downloads

      o Verifique a versão do seu navegador Chrome e instale o ChromeDriver correspondente.
      o Configurar a variável de ambiente PATH, apontando para o caminho de extração do zip. 
        Ex: C:\DriverSelenium\ChromeDriver\
	  
•	Dentro do diretório raiz do projeto executar: mvn test




