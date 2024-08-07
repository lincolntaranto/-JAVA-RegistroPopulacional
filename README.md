## Sistema de Registro Populacional em Java

Este projeto em Java implementa um sistema simples para registrar informações de usuários e permitir a consulta desses registros. Os dados são persistidos em um arquivo de texto.

### Funcionalidades:

- **Registro de Usuários:**
    - Coleta informações como nome, sobrenome, idade e endereço.
    - Validação básica para garantir que o nome e sobrenome tenham pelo menos 3 caracteres.
    - Permite confirmar as informações antes de gravar no arquivo.
- **Consulta de Usuários:**
    - Lê e exibe na tela todos os usuários registrados no arquivo.


### Estrutura do código:

- **Classe `App`:**
    - Contém o método `main`, que inicia o programa.
    - Gerencia o loop principal do menu, permitindo registrar ou consultar usuários.
    - Realiza a leitura e escrita no arquivo de dados (`data.txt`).
- **Classe `User`:**
    - Representa um usuário com atributos como `primeiroNome`, `segundoNome`, `idade` e `endereco`.

### Limitações:

- **Persistência:** Utiliza um arquivo de texto simples (`data.txt`) para armazenar os dados, o que pode não ser eficiente para grandes quantidades de dados.
- **Segurança:** Não implementa criptografia ou outras medidas de segurança para proteger os dados do usuário.
- **Funcionalidades:** Oferece apenas funcionalidades básicas de registro e consulta.

### Melhorias futuras:

- Implementar um sistema de banco de dados para persistência de dados mais eficiente.
- Adicionar criptografia para proteger as informações dos usuários.

### Talvez eu adicione:

- Expandir as funcionalidades, como busca por nome, edição de registros, exclusão de usuários, etc.
- Implementar uma interface gráfica de usuário (GUI) para uma melhor experiência do usuário.



