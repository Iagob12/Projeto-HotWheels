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
📸 Telas da Aplicação
Tela Inicial (Home): Sua garagem virtual com a listagem dos carros cadastrados e botões de ação.
Tela de Cadastro: Formulário intuitivo para adicionar novos modelos à sua frota.
Tela de Detalhes: Exibição completa das informações do seu carrinho, com opções de edição.
Tela de Wishlist: A vitrine dos seus futuros sonhos, com os modelos que você ainda deseja colecionar.
Menu Inferior: Navegação rápida e eficaz com ícones para Home, Adicionar e Wishlist.
🚀 Como Colocar a Coleção para Rodar Localmente
1. Clone o repositório:
Bash

git clone [https://github.com/seu-usuario/HotWheels-Minha-Colecao.git](https://github.com/seu-usuario/HotWheels-Minha-Colecao.git)
cd HotWheels-Minha-Colecao
2. Instale as dependências:
Bash

npm install
3. Inicie o projeto com Expo:
Bash

npx expo start
4. Visualize no seu celular:
Escaneie o QR Code com o aplicativo Expo Go no seu smartphone para ver a coleção em ação!

👨‍💻 Equipe de Desenvolvimento
Este projeto foi acelerado e desenvolvido por:

Iago
Pedro
Amanda
⚠️ Observações Importantes
Este projeto foi criado com finalidade acadêmica e demonstrativa. Todas as marcas e imagens associadas à Hot Wheels são propriedades da Mattel e foram utilizadas exclusivamente para fins educacionais e sem qualquer intenção comercial.
