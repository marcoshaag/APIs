# API Repository

Este repositório contém APIs para várias funcionalidades, cada uma implementada em uma branch separada. Cada branch representa uma funcionalidade específica da API, com respostas formatadas em JSON.

## Descrição

O repositório é projetado para fornecer APIs para diferentes operações e serviços.

## Estrutura das Branches

Cada branch no repositório contém uma implementação específica da API. Abaixo está a lista das branches e suas funcionalidades:

- **`buscarCep`**: Implementação para buscar informações de um endereço com base em um CEP. Utiliza a API ViaCep para retornar dados de endereço.
- **`pesquisarClima`**: Implementação para buscar informações climáticas com base no nome da cidade.
- **`conversor-moeda`**: Implementação para converter valores entre diferentes moedas. Utiliza APIs de taxas de câmbio para realizar as conversões.

# 📍 Consulta de Endereço via CEP

Este serviço permite buscar informações sobre um endereço a partir do CEP, utilizando a API do ViaCEP.

---

## 🛠️ Tecnologias Utilizadas

- **Java**
- **Spring Boot**: Framework para simplificar o desenvolvimento da aplicação.
- **RestTemplate**: Para realizar chamadas HTTP às APIs.
- **Maven**: Gerenciador de dependências.
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
 ```

---

# Conversor de Moedas

Um serviço simples para converter valores entre diferentes moedas usando APIs externas, desenvolvido em **Java** com o **Spring Boot**.


## 🛠️ Tecnologias Utilizadas

- **Java**
- **Spring Boot**: Framework para simplificar o desenvolvimento da aplicação.
- **RestTemplate**: Para realizar chamadas HTTP às APIs.
- **Maven**: Gerenciador de dependências.
- **APIs de Conversão de Moeda**: Para obter taxas de câmbio em tempo real.

## 🚀 Pré Requisitos para Rodar o Projeto

- **Java 17** ou superior instalado.
- **Maven** instalado para gerenciar as dependências.
- 
## 📄 Exemplos de Uso

### No Navegador

Você pode acessar o serviço diretamente no navegador para realizar a conversão de moedas. Por exemplo, para converter **100 USD** para **EUR**, use a seguinte URL:

http://localhost:8080/converter?moedaOrigem=USD&moedaDestino=EUR&valor=100


Ao enviar a requisição, você obterá a resposta com o valor convertido.

### Exemplo de Resposta:

A resposta da conversão pode ser, por exemplo:

```json
{
  "valorConvertido": 92.34
}

``` 
