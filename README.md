# Pesquisar Clima

Um serviço simples para pesquisar o clima de qualquer lugar do mundo, utilizando APIs externas, desenvolvido em **Java** com o **Spring Boot**.

## 🛠️ Tecnologias Utilizadas

- **Java**
- **Spring Boot**: Framework para simplificar o desenvolvimento da aplicação.
- **RestTemplate**: Para realizar chamadas HTTP às APIs.
- **Maven**: Gerenciador de dependências.
- **API Externa (ex.: OpenWeatherMap)**: Para obter informações climáticas em tempo real.

## 🚀 Pré Requisitos para Rodar o Projeto

- **Java 17** ou superior instalado.
- **Maven** instalado para gerenciar as dependências.

## 📄 Endpoint Disponível

### 🌤️ Consultar Clima por Cidade

Consulta informações climáticas de uma cidade com base no nome.

#### **URL**:
`GET /api/clima/pesquisar?cidade={nomeCidade}`

- **Parâmetro**: `cidade` (Nome da cidade a ser consultada, por exemplo, "Florianópolis" ou "Berlim").

#### **Exemplo de Uso**:

```bash
http://localhost:8080/api/clima/pesquisar?cidade=São Paulo

```
