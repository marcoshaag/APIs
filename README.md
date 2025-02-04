# 📍 Consulta de Endereço via CEP

Este serviço permite buscar informações sobre um endereço a partir do CEP, utilizando a API do ViaCEP.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17**: Linguagem utilizada para o desenvolvimento da aplicação.
- **Spring Boot**: Framework para construção da API REST.
- **RestTemplate** (se você quiser usar, mas no seu código não está sendo utilizado, seria o método de consumir a API).
- **Maven**: Gerenciamento de dependências.
- **API Externa**: ViaCEP para consulta de endereços.

---

## 🚀 Como Rodar o Projeto

### 📌 Pré-requisitos:
- **Java 17+** e **Maven** instalados na máquina.


4. **Acessar o serviço**:
    A aplicação estará disponível em [http://localhost:8080](http://localhost:8080).

---

## 📄 Endpoint Disponível

### 🔍 Buscar Endereço por CEP

Consulta informações detalhadas sobre um CEP.

#### **URL**:
`GET /api/cep/buscar?cep={cep}`

- **Parâmetro**: `cep` (CEP a ser consultado, formato `12345-678` ou `12345678`).

#### **Exemplo de Uso**:

```bash
http://localhost:8080/api/cep/buscar?cep=01001000
