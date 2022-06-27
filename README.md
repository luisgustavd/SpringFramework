# SpringFramework
Aplicações em Spring Framework e Java 

## Webservice utlizando Spring Framework e Thymeleaf || Materialize.css

#### Detalhes:
Este projeto simula um sistema de cadastro de empregos com as seguintes funcionalidades: 
- listagem
- cadastro

#### Stack:
Utilizou-se:
- Java 17
- Spring Framework para o MVC
- Thymeleaf para renderização das páginas
- Materialize.css para customização das páginas

#### Executando:
Apenas faça a Build do projeto, e dê Run na main. Em seguida:
1. Acesse a aplicação com a seguinte URL: http:localhost:8080/
2. Cadastre um novo emprego; se bem-sucedido, será redirecionado à listagem
3. Depois disso, acesse o banco de dados em: http:localhost:8080/h2-console
4. Nesta aba, sete o campo "JDBC URL" com "jdbc:h2:mem:test_job"
5. Clique em "Testar Conexão" e com sucesso, clique em "Conectar"
6. Isso permitirá acessar todos os registros salvos em memória na aplicação
