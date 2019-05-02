# language: pt

	Funcionalidade: Login

	@Sprint1 @Login
  Cenário: Realizar login
    Dado que eu esteja na tela de login
    Quando faço login com o usuário "admin" e senha "admin"
    Então sou autenticado com sucesso
    
  @Sprint2 @Login
  Esquema do Cenário: Tentativa de Login
  	Dado que eu esteja na tela de login
    Quando faço login com o usuário "<usuario>" e senha "<senha>"
    Então é apresenta a mensagem "Invalid username / password combination."
    	
    	Exemplos: 
    		|usuario|senha|
    		|admin  |1235 |    
    		|12334  |admin|
    		|       |admin|
    		|admin  |     |