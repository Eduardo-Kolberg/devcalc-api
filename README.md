# Calculator API

![CI Pipeline](https://github.com/SEU_USUARIO/SEU_REPOSITORIO/actions/workflows/ci.yml/badge.svg)

## Objetivo
O objetivo dessa API é apenas educacional para a realização de trabalho de faculdade. Trata-se de uma API simples com endpoints relacionados a calculos matemáticos.

## Endpoints Disponíveis
- `GET /add?a=10&b=5` → retorna `15`
- `GET /subtract?a=10&b=5` → retorna `5`
- `GET /multiply?a=10&b=5` → retorna `50`
- `GET /divide?a=10&b=5` → retorna `2`

## Tecnologias Utilizadas
- Java 17+
- Spring Boot
- Maven

## Como Executar Localmente

1. Clone o projeto:
   ```bash
   git clone https://github.com/seuusuario/calculator-api.git
   cd calculator-api

## Erros encontrados no Pipeline
Em relação ao erro, eu tive um antes com o lint, usei o lint do Maven e ele apontou 46 violações e por isso o pipeline falhou, para descobrir o que tinha falhado eu utilizei os logs, onde há bastante informação sobre o que foi executado e, para resolver, para não ter que alterar todo o código, utilizei outra ferramenta de lint. 

## Parágrafo sobre as execuções, manuais e push
Em relação a execução do pipelin quando há um push para o main é claro o valor que ele agrega ao projeto uma vez que é uma forma de verificar se o código do programa está bom com o lint, se o comportamento está correto com os testes e se o mesmo está compilando e dando build. Em relação a execução manual, ela é útil para verificarmos como está a saúde do projeto bem como para situações onde o pipeline falha por motivos terceiros (server fora do ar, timeout etc).
