# 📍 Consulta de Endereço via CEP

Este serviço permite buscar informações sobre um endereço a partir do **CEP**, utilizando a API do **ViaCEP**.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **RestTemplate** (para chamadas HTTP à API do ViaCEP)
- **Maven** (gerenciamento de dependências)
- **API externa**: [ViaCEP](https://viacep.com.br/)

---

## 🚀 Como Rodar o Projeto

### 📌 Pré-requisitos:
- **Java 17+** e **Maven** instalados na máquina.

## 📄 Endpoint Disponível

### 🔍 Buscar Endereço por CEP
Consulta informações detalhadas sobre um **CEP**.

**URL:**
```http
GET /cep/{cep}
```

**Exemplo de Uso:**
```
http://localhost:8080/cep/01001000
```

**Resposta Esperada:**
```json
{
  "cep": "01001-000",
  "logradouro": "Praça da Sé",
  "complemento": "lado ímpar",
  "bairro": "Sé",
  "localidade": "São Paulo",
  "uf": "SP"
}
```

---

## 📌 Observações
- Apenas CEPs válidos do Brasil podem ser consultados.
