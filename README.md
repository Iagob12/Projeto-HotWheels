🚗 HotWheels - Minha Coleção
Aplicativo em React Native para gerenciar sua coleção de carrinhos Hot Wheels de forma prática, divertida e visualmente atrativa.

📲 Funcionalidades
📋 Listagem de carros com imagem, modelo, ano, tipo e número.

🔍 Visualização detalhada de cada item da coleção.

✏️ Edição rápida das informações cadastradas.

🗑️ Remoção fácil de itens da lista.

💾 Wishlist (Lista de Desejos) para acompanhar os modelos que faltam.

➕ Botão central flutuante para adicionar novos carros.

🧭 Navegação com menu inferior fixo, facilitando o uso.

🧠 Tecnologias Utilizadas
React Native — Framework para apps móveis multiplataforma.

React Navigation — Navegação entre telas.

Expo Vector Icons — Ícones vetoriais customizados.

React Native Gesture Handler — Suporte a gestos e interações.

React Native Reanimated — Animações fluidas e responsivas.

🌐 Backend da API
O app se comunica com um backend em Java (Spring Boot), hospedado na Azure:

arduino
Copy
Edit
https://hotwheels-1-dkgkfbcsa7gjedh9.brazilsouth-01.azurewebsites.net
🔒 Toda persistência e gerenciamento de dados acontece via API REST.

📦 Estrutura de Pastas (Frontend)
bash
Copy
Edit
/src
 ┣ /assets            → Imagens, ícones e recursos visuais
 ┣ /components        → Componentes reutilizáveis
 ┣ /screens           → Telas principais (Home, Detalhes, Wishlist, etc.)
 ┣ /routes            → Configurações de navegação
 ┣ /services          → Comunicação com a API
 ┗ App.js             → Entrada principal da aplicação
💡 Instalação
bash
Copy
Edit
# Clone o projeto
git clone https://github.com/Iagob12/Projeto-HotWheels.git

# Acesse a pasta do projeto
cd Projeto-HotWheels

# Instale as dependências
npm install

# Inicie o projeto (via Expo)
npx expo start
👥 Equipe
Projeto desenvolvido por:

Iago

Pedro

Amanda

📌 Observações
Projeto não publicado nas lojas oficiais.

Para testar no celular, utilize o app Expo Go e escaneie o QR Code gerado pelo comando npx expo start.

🧾 Licença
Este projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.
