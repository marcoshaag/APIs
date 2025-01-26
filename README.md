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
