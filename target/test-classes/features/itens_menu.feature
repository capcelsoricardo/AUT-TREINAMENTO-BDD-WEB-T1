#language: pt

Funcionalidade: Itens do Menu

Contexto:
		Dado que eu esteja na tela de login
    Quando faço login com o usuário "admin" e senha "admin"
    Então sou autenticado com sucesso
    
    @Sprint3 @Menu
    Cenário: Validar os itens apresentados no menu Catalog
    	Dado que eu esteja na tela Home
    	Quando acesso o menu Catalog
    	Então são apresentados os itens "Catalogs", "Categories", "Base Product", "All Products", "Product Bundles", "Add-on Products", "Product Groups", "Product Options", "Cart Rules", "Manage Inventory" e "Locations"