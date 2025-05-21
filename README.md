## Emprestimos

#### 💡 Qual o objetivo do projeto?
Implementar um serviço que determine quais modalidades de empréstimo uma pessoa tem acesso.
As modalidades de empréstimo que serão analisadas são:

- **Empréstimo pessoal**: Taxa de juros de 4%.
- **Empréstimo consignado**: Taxa de juros de 2%.
- **Empréstimo com garantia**: Taxa de juros de 3%.

As modalidades de empréstimo disponíveis para uma pessoa são baseadas em algumas variáveis específicas, são elas:

- **Idade**
- **Salário**
- **Localização**

Seu serviço recebe uma chamada para determinar quais modalidades de empréstimo uma pessoa tem acesso.

**[POST]** `{{host}}/customer-loans`

```json
{
    "age": 26,
    "cpf": "275.484.389-23",
    "name": "Vuxaywua Zukiagou",
    "income": 7000.00,
    "location": "SP"
}
```

Seu serviço deve retornar uma resposta contendo o nome do cliente e uma lista de empréstimos aos quais ele tem acesso,
com os respectivos tipos e taxas de juros.

```
HTTP/1.1 200 Ok
```

```json
{
    "customer": "Vuxaywua Zukiagou",
    "loans": [
        {
            "type": "PERSONAL",
            "interest_rate": 4
        },
        {
            "type": "GUARANTEED",
            "interest_rate": 3
        },
        {
            "type": "CONSIGNMENT",
            "interest_rate": 2
        }
    ]
}
```
Fonte: https://github.com/backend-br/desafios/blob/master/loans/PROBLEM.md
## Requisitos

- Conceder o empréstimo pessoal se o salário do cliente for igual ou inferior a R$ 3000.
- Conceder o empréstimo pessoal se o salário do cliente estiver entre R$ 3000 e R$ 5000, se o cliente tiver menos de 30
  anos e residir em São Paulo (SP).
- Conceder o empréstimo consignado se o salário do cliente for igual ou superior a R$ 5000.
- Conceder o empréstimo com garantia se o salário do cliente for igual ou inferior a R$ 3000.
- Conceder o empréstimo com garantia se o salário do cliente estiver entre R$ 3000 e R$ 5000, se o cliente tiver
  menos de 30 anos e residir em São Paulo (SP).


#### 🤖 Tecnologias utilizadas:
<ul>
  <li>Spring Web: Cria aplicações web e restful usando padrão MVC com o Apache Tomcat como servidor. </li>
  <li>Junit</li>
  <li>Java 21 </li>
</ul> 
<br>
Postman: Para testar as requisições da API

#### ⚙️ Endpoints do sistema:
<ul>
  <li>Cadastro de Emprestimo e retorno de tipos disponível para o perfil do cliente </li>
</ul>


### 🚨🔧Pré-requisitos 
Os seguintes itens devem estar instalados em seu computador para utilizar essa aplicação:
- Java 211 ou superior (JDK - pode ser encontrado no site da Oracle)
- Ide de sua preferência, nesse caso utilizei a ide intellij idea

### 🖥️🖱️Executando Localmente
Essa é uma api construída usando Spring Boot e Maven, você deverá ter no mínimo o java 21 instalado na sua máquina para realizar testes nela.

Para ter uma cópia desse projeto na sua máquina basta executar a linha de comando abaixo na pasta que o projeto ficará salvo:

```
git clone https://github.com/Rayane420/emprestimo.git
```

### 📭Caso você encontre um bug/ponto de melhoria nessa aplicação

Você poderá enviar seu report aqui: https://github.com/Rayane420/emprestimo/issues
