#language:pt

@Manter_Carrinho

Funcionalidade: Manter Carrinho
  Como usuário do sistema
  Eu quero Listar, Inserir ou Excluir produtos do carrinho

Cenario: Inserir Produto no carrinho - Pagina principal
  Dado que o usuario escolha um produto na pagina principal
  Quando clica em "add to cart"
  Entao o sistema inclui o produto no carrinho
