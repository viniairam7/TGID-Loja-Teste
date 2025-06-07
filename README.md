# TGID Loja Teste  🇧🇷
Este projeto foi desenvolvido como parte de um teste técnico para a vaga de Estágio Backend Developer na TGID. A proposta simula o funcionamento de uma loja online em Java, com foco na gestão de usuários, produtos e vendas.

# ✅ Solução adotada
O projeto foi estruturado com base em boas práticas de orientação a objetos, tratamento de exceções personalizadas e organização modular de código Java, promovendo legibilidade, coesão e separação de responsabilidades.

# 🗂 Organização de pacotes
A estrutura do projeto é composta por pacotes principais, cada um com responsabilidades bem definidas:
> lojatgid
Contém as entidades principais da loja, como Produto, Usuario, Venda, ItemVenda, etc.
> lojatgid.exceptions
Pacote dedicado ao tratamento de exceções personalizadas, como:
> CpfException, ProdutoException, EstoqueException, SQLException, entre outras.
> test
Contém os testes unitários que verificam o comportamento dos principais componentes da aplicação.

# 📚 Bibliotecas e tecnologias utilizadas
- Java 11+
- JUnit para testes unitários
- Estrutura orientada a objetos
- Conxeão com banco de dados utilizando MySQL


  #  🧱 Arquitetura
A arquitetura adotada segue os princípios básicos de separação de responsabilidades:
Entidades – Representam os objetos de domínio do sistema (ex: Produto, Usuario, Venda)
Lógica de negócios – Métodos encapsulados dentro das próprias entidades ou classes auxiliares
Tratamento de exceções – Customização de erros para melhorar a clareza do fluxo e depuração
Testes – Verificações do comportamento esperado dos componentes, cobrindo cenários positivos e negativos

# 🔧 Escolhas técnicas
🧭 Modularização por responsabilidade
Organizar o projeto em pacotes separados para entidades e exceções favorece a manutenção e leitura do código.
❗ Exceções customizadas
Foram criadas classes específicas para capturar erros como CPF inválido, falta de estoque, problemas com produtos, etc.
✅ Testabilidade
O projeto inclui testes automatizados escritos com JUnit, cobrindo casos de uso importantes como operações de venda, manipulação de estoque e registro de usuários.

# 🚀 Instruções para executar o projeto
Para rodar o projeto localmente, siga os passos abaixo:

1.Clone o repositório:
2.Abra o projeto em sua IDE Java preferida (como IntelliJ IDEA ou Eclipse)
3.Compile e execute a classe principal:
4.Rode os testes (opcional):
5.Execute a classe ItemVendaTestes.java que está no diretório test.

# 🤝 Contribuições
Este projeto foi desenvolvido para fins de avaliação técnica e não está aceitando contribuições externas neste momento.

------------------------------

# TGID Store Test 🇺🇸
This project was developed as part of a technical assessment for the Backend Developer Internship position at TGID. The goal is to simulate the operation of an online store built in Java, with a focus on managing users, products, and sales.

# ✅ Adopted Solution
The project is structured based on best practices in object-oriented programming, custom exception handling, and modular Java code organization, promoting readability, cohesion, and separation of concerns.

# 🗂 Package Organization
The project structure is composed of main packages, each with well-defined responsibilities:
> lojatgid
Contains the main store entities, such as Product, User, Sale, ItemSale, etc.
> lojatgid.exceptions
Package dedicated to handling custom exceptions, such as:
> CpfException, ProductException, StockException, SQLException, among others.
> test
Contains unit tests that verify the behavior of the main components of the application.

# 📚 Libraries and Technologies Used
Java 11+
JUnit for unit testing
Object-oriented design structure
Database connection using MySQL

#  🧱 Architecture
The adopted architecture follows basic principles of responsibility separation:

Entities – Represent the domain objects of the system (e.g., Product, User, Sale)

Business logic – Methods encapsulated within the entities themselves or auxiliary classes

Exception handling – Custom error classes to improve flow clarity and debugging

Testing – Verifications of expected component behavior, covering both positive and negative scenarios

# 🔧 Technical Choices
🧭 Responsibility-based modularization
The project is organized into separate packages for entities and exceptions, which improves code readability and maintainability.
❗ Custom exceptions
Specific classes were created to handle errors such as invalid CPF, out-of-stock products, product issues, and more.
✅ Testability
The project includes automated tests written with JUnit, covering important use cases such as sales operations, stock manipulation, and user registration.
🚀 How to Run the Project
To run the project locally, follow the steps below:

1.Clone the repository:
2.Open the project in your preferred Java IDE (such as IntelliJ IDEA or Eclipse)
3.Compile and run the main class:
4.Run the tests (optional):
5.Execute the ItemVendaTestes.java class located in the test directory.

# 🤝 Contributions
This project was developed for technical evaluation purposes and is not currently accepting external contributions.
