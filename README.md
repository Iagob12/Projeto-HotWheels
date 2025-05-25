# 🚗💨 HotWheels - Minha Coleção 🏎️🔥

> *Organize sua frota de máquinas em miniatura com velocidade e estilo!*

---

## 🏁 Sobre o Projeto

**HotWheels - Minha Coleção** é um aplicativo mobile, desenvolvido em **React Native**, para todos os entusiastas e colecionadores de Hot Wheels! Com ele, você pode **cadastrar, visualizar, editar e excluir** seus modelos, além de organizar os carrinhos dos seus sonhos em uma **lista de desejos**. A paixão por miniaturas, agora na palma da sua mão!

---

## 🛠️ Funcionalidades Turbinadas

* 📋 **Listagem de modelos cadastrados**: visualize sua coleção com imagem, nome, ano e detalhes importantes.
* ➕ **Cadastro de novos carrinhos**: adicione suas máquinas com campos como:
    * **Modelo**
    * **Ano de fabricação**
    * **Número do carro**
    * **Tipo** (ex: esportivo, clássico, conceito, etc.)
    * **Linha/Coleção**
    * **URL da imagem**
* ✏️ **Edição de dados**: atualize as informações dos seus carros diretamente na tela de detalhes.
* ❌ **Remoção de modelos**: delete carrinhos da sua coleção com um clique.
* 📂 **Visualização detalhada**: explore cada item da sua coleção com todas as informações.
* 📲 **Menu inferior fixo**: navegação rápida entre as principais telas.
* 🔘 **Botão central flutuante**: crie novos itens de forma prática e em destaque.

---

## ⚙️ Tecnologias Utilizadas

### 🚀 Frontend (React Native)

* **React Native**: O motor principal para o desenvolvimento mobile multiplataforma.
* **React Navigation**: Gerenciamento de rotas e navegação fluida entre telas.
* **Expo Vector Icons**: Ícones vetorizados para uma interface visualmente rica.
* **React Native Gesture Handler**: Manipulação de gestos e toques para uma experiência intuitiva.
* **React Native Reanimated**: Animações fluidas e modernas para um visual dinâmico.

### 🌐 Backend (Java + Spring Boot)

* **Java (Spring Boot)**: A API REST robusta que gerencia todos os dados da sua coleção.
* **Hospedagem**: Microsoft Azure
    * [Acesse a API aqui](https://hotwheels-1-dkgkfbcsa7gjedh9.brazilsouth-01.azurewebsites.net)

### 📂 Estrutura de Pastas

```bash
/src
 ┣ /assets           → Logos e imagens estáticas
 ┣ /components       → Componentes reutilizáveis (cards, botões, etc.)
 ┣ /screens          → Telas da aplicação (Home, Detalhes, Cadastro, Wishlist)
 ┣ /routes           → Configuração da navegação
 ┣ /services         → Comunicação com a API
 ┗ App.js            → Arquivo principal da aplicação
```

## 📸 Telas da Aplicação

Confira um tour pelas principais telas do **HotWheels - Minha Coleção**:

* **Tela Inicial (Home)**: Sua garagem virtual, exibindo a listagem dos carros cadastrados e botões de ação para acesso rápido.
* **Tela de Cadastro**: Um formulário prático e intuitivo para você adicionar novos modelos à sua frota.
* **Tela de Detalhes**: Mergulhe fundo nas informações do seu carrinho, com todos os detalhes e opções de edição.
* **Tela de Wishlist**: A vitrine dos seus futuros sonhos! Organize e acompanhe os modelos que você ainda deseja colecionar.
* **Menu Inferior**: Navegação rápida e eficaz entre as principais seções, com ícones para Home, Adicionar e Wishlist.

---

## 🚀 Como Colocar a Coleção para Rodar Localmente

Quer acelerar e testar o app na sua máquina? Siga estes passos simples:

### 1. Clone o repositório:

```bash
git clone (https://github.com/Iagob12/Projeto-HotWheels.git)
```
```bash
cd HotWheels-Minha-Colecao
```

### 2. Instale as dependências:

```bash
npm install
```

### 3. Inicie o projeto com Expo:

```bash
npx expo start
```

### 4. Visualize no seu celular:
Com o projeto rodando, basta escanear o QR Code que aparecerá no seu terminal usando o aplicativo Expo Go no seu smartphone. Prepare-se para ver sua coleção em ação!


###  👨‍💻 Equipe de Desenvolvimento
Este projeto foi acelerado e desenvolvido por:

### Iago - Iagob12
### Pedro - irunael
### Amanda - amandaatts
