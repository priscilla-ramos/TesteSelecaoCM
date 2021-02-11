#language:pt
@pesquisarproduto

Funcionalidade: Pesquisar Produto
	Como usuário do sistema
	Eu quero pesquisar produtos


Cenario: Pesquisar produto existente
	 Dado que o usuario digite a palavra "dress" para pesquisar
	 Quando clicar no botao search
	 Entao o sistema lista todos os produtos que possuam a palavra pesquisada