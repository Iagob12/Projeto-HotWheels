🚗 HotWheels - Minha Coleção
Aplicativo mobile desenvolvido em React Native para gerenciamento de coleções de carrinhos Hot Wheels, permitindo visualização, cadastro, edição e exclusão de modelos, além de uma área dedicada à lista de desejos.

📱 Funcionalidades
📋 Listagem de modelos cadastrados com imagem, nome, ano e outras informações;

➕ Cadastro de novos carrinhos com os seguintes campos:

Modelo

Ano de fabricação

Número do carro

Tipo (ex: esportivo, clássico, conceito, etc.)

Linha/Coleção

URL da imagem

✏️ Edição de dados diretamente na tela de detalhes;

❌ Remoção de modelos com um clique;

❤️ Wishlist para organização dos modelos desejados;

📂 Visualização detalhada de cada item da coleção;

📲 Menu inferior fixo para navegação entre as principais telas;

🔘 Botão central flutuante para criação de novos itens com destaque.

🧪 Tecnologias Utilizadas
🔧 Frontend
React Native – Framework principal para desenvolvimento mobile multiplataforma;

React Navigation – Gerenciamento de rotas e navegação entre telas;

Expo Vector Icons – Biblioteca de ícones vetoriais;

React Native Gesture Handler – Manipulação de gestos e toques;

React Native Reanimated – Suporte a animações fluidas e modernas.

🌐 Backend
Java (Spring Boot) – API REST para gerenciamento dos dados da coleção;

Hospedagem: Microsoft Azure
https://hotwheels-1-dkgkfbcsa7gjedh9.brazilsouth-01.azurewebsites.net

📂 Estrutura de Pastas
bash
Copy
Edit
/src
 ┣ /assets           → Logos e imagens estáticas
 ┣ /components       → Componentes reutilizáveis (cards, botões, etc.)
 ┣ /screens          → Telas da aplicação (Home, Detalhes, Cadastro, Wishlist)
 ┣ /routes           → Configuração da navegação
 ┣ /services         → Comunicação com a API
 ┗ App.js            → Arquivo principal da aplicação
🖼️ Telas da Aplicação
Tela Inicial (Home): listagem dos carros cadastrados com botões de ação;

Tela de Cadastro: formulário para adicionar novos modelos;

Tela de Detalhes: exibição completa das informações do carro com opção de edição;

Tela de Wishlist: modelos que ainda não fazem parte da coleção;

Menu Inferior: navegação rápida com ícones para Home, Adicionar e Wishlist.

🚀 Como Executar o Projeto Localmente
Clone o repositório:

bash
Copy
Edit
git clone https://github.com/seu-usuario/HotWheels-Minha-Colecao.git
cd HotWheels-Minha-Colecao
Instale as dependências:

bash
Copy
Edit
npm install
Inicie o projeto com Expo:

bash
Copy
Edit
npx expo start
Escaneie o QR Code com o aplicativo Expo Go no celular para visualizar.

👨‍💻 Equipe de Desenvolvimento
Projeto desenvolvido por:

Iago

Pedro

Amanda

⚠️ Observações
Este projeto tem finalidade acadêmica/demonstrativa. Todas as marcas e imagens associadas à Hot Wheels são propriedades da Mattel e foram utilizadas apenas para fins educacionais.
