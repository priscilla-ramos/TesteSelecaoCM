#language:pt

@Pesquisar_Produto

Funcionalidade: Pesquisar Produto
  Como usuário do sistema
  Eu quero pesquisar um produto

@Pesquisar_Produto_Existente	
Cenario: Pesquisar produto existente
	 Dado que o usuario digite a palavra "dress" para pesquisar
	 Quando clicar no botao search
	 Entao o sistema lista todos os produtos que possuam a palavra pesquisada

@Pesquisar_Produto_Inexistente	
Cenario: Pesquisar produto inexistente
	 Dado que o usuario digite a palavra "blusa" para pesquisar
	 Quando clicar no botao search
	 Entao o sistema exibe mensagem que nao existe resultado para a palavra pesquisada