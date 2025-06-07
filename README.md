# Calculator API

![CI Pipeline](https://github.com/Eduardo-Kolberg/devcalc-api/actions/workflows/ci.yml/badge.svg)

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

## TP3
Todas as evidencias estão no PDF entregue. 
Etapa 2 - Criei variáveis de escopo do repositório e utilizei elas no arquivo ci.yaml, para executar pode executar manualmente ou mediante a um push.
Etapa 3 - Para essa etapa criei um arquivo novo env-context-demo.yml, ele pode ser executado manualmente nos actions. Para demonstrar os escopos sobrescrevi a váriavel em diferentes escopos mostrando o seu valor nos logs.
Etapa 4 - Para a etapa 4 criei um novo arquivo (pode ser executado manualmente nos actions) create-issue-error.yaml, nele adicionei as permissões necessárias e criei um step com duas partes, uma que verifica a existência de uma variável de ambiente, caso não exista ele bota o valor true no output erro, na parte seguinte ele verifica se o valor do output é true, se for ele faz uma chamada para a API do github para criar um issue.
Etapa 5 - Configurei os dois ambientes, dev e prod, criei as variáveis dentro deles e botei regras no prod, para precisar de review e não deixar o admin "pular" as regras, configurei para precisar um review de mim mesmo. Após modifiquei o arquivo ci.yaml com os dois tipos de deploy.
Etapa 6 - Fiz as modificações e fiz o push para a branch dev, fazendo o trigger do deploy para dev como pode-se ver nas imagens do PDF, após fiz um push para main, onde foi dado trigger no deploy para prod que pausou até ter o review necessário, após o review ele concluiu com sucesso o job, como podemos ver nas imagens.
