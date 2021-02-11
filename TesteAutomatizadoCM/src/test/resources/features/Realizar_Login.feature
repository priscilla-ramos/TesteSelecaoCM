#language:pt

@Realizar_Login
Funcionalidade: Realizar_Login
Como usuário do sistema
Eu quero realizar login na aplicação 

@Realizar_Login_Cadastrar_Usuario
Cenario: Cadastrar Usuario 
	Dado que o usuario queira fazer sign in na aplicacao
	Quando o usuario informa o email "testecasmagalhaes_22@gmail.com" 
	E clica no botao "create an account"
	E informa os dados obrigatorios do cadastro	
	E clica no botao "Register"
	Entao o sistema faz o login automatico e exibe a pagina my account

@Realizar_Login_Com_Usuario_Nao_Cadastrado
Cenario: Login usuario nao Cadastrado
	Dado que o usuario queira fazer sign in na aplicacao	
	Quando informa o login "testecasmagalhaes_23@gmail.com" e insere a senha "12345"
	E clica no botao "Sign in"
	Entao o sistema exibe mensagem que a autenticacao falhou
