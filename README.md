<h1 align="center">🎦 DSMovie</h1>

## Sobre o projeto
DSMovie é uma aplicação web responsiva desenvolvida com Java e Spring no backend e React no frontend. O aplicativo foi desenvolvido no evento **Semana Spring React** promovido pela [DevSuperior](https://devsuperior.com "Site da DevSuperior") - Escola de Programação.

A aplicação consiste em uma página com uma lista paginada de filmes e outra com um formulário para avaliação de um filme. Na lista paginada cada filme contém uma nota de avaliação que é calculada pela média das notas atribuídas pelos usuários. Já na página de avaliação contém campos para o usuário informar seu email e a nota que pretende atribuir ao filme selecionado.

Link da aplicação em produção: https://dsmovie-dennis.netlify.app/ 

## Layout web
![Listagem](https://github.com/dennisferreira1/assets/blob/main/dsmovie/img/desktop-listagem.png)

![Avaliação](https://github.com/dennisferreira1/assets/blob/main/dsmovie/img/desktop-avaliacao.png)

## Layout mobile
![Listagem](https://github.com/dennisferreira1/assets/blob/main/dsmovie/img/mobile-listagem.png)

![Avaliação](https://github.com/dennisferreira1/assets/blob/main/dsmovie/img/mobile-avaliacao.png)

## Recursos
- Listar filmes
- Avaliar filme

## Modelo conceitual
![Modelo Conceitual](https://github.com/dennisferreira1/assets/blob/main/dsmovie/img/modelo-conceitual.png)

## Competências / Técnicas
### Backend
- Criar e configurar o projeto com Spring
- Configurar o  banco de dados
- Mapeamento ORM
- Desenvolvimento em camadas
- REST API
- Configurar perfis de projeto
### Frontend
- Criar e configurar o projeto com React
- Componentes
- Props
- Estado
- Rotas
- Navegação
### Integração frontend e backend
- Axios

## Tecnologias e ferramentas utilizadas
- Java
- Spring
- HTML
- CSS
- JS
- TypeScript
- ReactJS
- Bootstrap
- Maven
- Postgresql
- H2
- PgAdmin
- Flyway
- Git / GitHub


## Implantação em produção
- Backend: [Heroku](https://www.heroku.com/home)
- Frontend: [Netlify](https://www.netlify.com/)

## Como executar o projeto

### Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/dennisferreira1/projeto-dsmovie

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

### Front end web
Pré-requisitos: npm / yarn

```bash
# clonar repositório
git clone https://github.com/dennisferreira1/projeto-dsmovie

# entrar na pasta do projeto front end web
cd front-web

# instalar dependências
yarn install

# executar o projeto
yarn start
```

## Agradecimentos
Ao Professor Nélio e a DevSuperior - Escola de Programação 
[![DevSuperior no Instagram](https://raw.githubusercontent.com/devsuperior/bds-assets/main/ds/ig-icon.png)](https://instagram.com/devsuperior.ig) 
[![DevSuperior no Youtube](https://raw.githubusercontent.com/devsuperior/bds-assets/main/ds/yt-icon.png)](https://youtube.com/devsuperior)

