# Projeto de Jogo de Xadrez ♟️

Bem-vindo ao **Projeto de Jogo de Xadrez**! Este repositório contém a implementação de um jogo de xadrez totalmente funcional escrito em Java, seguindo os princípios de clean code. O projeto apresenta lógica de backend e uma interface frontend interativa e estilizada.

---

## Estrutura do Projeto 📂

```
src/
├── chess/
│   ├── ChessGame.java         // Contém o método `main` para iniciar o jogo.
│   ├── Game.java              // Lida com a lógica do jogo, como turnos e movimentos.
│   ├── board/
│   │   ├── ChessBoard.java    // Gerencia o estado do tabuleiro, inicialização e movimentos.
│   ├── pieces/
│   │   ├── Piece.java         // Classe base abstrata para todas as peças de xadrez.
│   │   ├── Pawn.java          // Lógica para o Peão.
│   │   ├── Rook.java          // Lógica para a Torre.
│   │   ├── Knight.java        // Lógica para o Cavalo.
│   │   ├── Bishop.java        // Lógica para o Bispo.
│   │   ├── Queen.java         // Lógica para a Rainha.
│   │   ├── King.java          // Lógica para o Rei.
```

---

## Funcionalidades ✨

### Backend 🛠️
- Implementa todas as regras padrão do xadrez (por exemplo, movimentos das peças, capturas, xeques).
- Design modular para fácil escalabilidade e legibilidade.
- Extensível para suportar regras avançadas de xadrez (por exemplo, roque, promoção de peões).

### Frontend 🌐
- Interface totalmente estilizada e interativa para jogabilidade.
- Validação de movimentos em tempo real com feedback visual.
- Suporte para jogar como Branco ou Preto.

---

## Tecnologias Utilizadas 🖥️

### Backend:
- **Java**: Linguagem principal para a lógica do jogo.

### Frontend:
- **HTML/CSS/JavaScript**: Para criar uma interface web interativa.
- **AJAX**: Comunicação entre frontend e backend.

---

## Como Executar 🚀

### Backend:
1. Clone o repositório:
   ```bash
   git clone https://github.com/yourusername/chess-game.git
   cd chess-game
   ```
2. Abra o projeto no seu IDE Java favorito (por exemplo, IntelliJ, Eclipse).
3. Compile e execute o arquivo `ChessGame.java` para iniciar o servidor backend.

### Frontend:
1. Navegue até o diretório `frontend/`.
2. Abra o arquivo `index.html` em um navegador web.
3. Comece a jogar!

---

## Interface do Usuário 🎨

### Principais Funcionalidades:
- Funcionalidade intuitiva de arrastar e soltar para mover peças.
- Destaque dos movimentos válidos para cada peça selecionada.
- Indicadores visuais para xeques, capturas e troca de turno.

---

## Melhorias Futuras 🚧
- Adicionar suporte para multijogador online.
- Implementar temporizadores de xadrez e sistema de classificação.
- Extender para incluir regras avançadas como en passant e roque.

---

## Contribuindo 🤝

Contribuições são bem-vindas! Faça um fork do repositório, crie um branch para a sua funcionalidade e envie um pull request.

1. Faça o fork do projeto.
2. Crie seu branch para a funcionalidade:
   ```bash
   git checkout -b feature/FuncionalidadeIncrivel
   ```
3. Faça commit das suas alterações:
   ```bash
   git commit -m 'Adiciona uma FuncionalidadeIncrivel'
   ```
4. Envie para o branch:
   ```bash
   git push origin feature/FuncionalidadeIncrivel
   ```
5. Abra um pull request.

---

## Licença 📜

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

## Agradecimentos 🙌
- Inspirado pelo amor ao xadrez e ao clean code.
- Agradecimentos especiais à comunidade Open Source por ferramentas e bibliotecas.

---

Aproveite para jogar xadrez! ♟️

---------------------------------------------------------------------------------------------
# English Version
# Chess Game Project ♟️

Welcome to the **Chess Game Project**! This repository contains the implementation of a fully functional chess game written in Java, adhering to clean code principles. The project features both backend logic and a sleek, interactive frontend.

---

## Project Structure 📂

```
src/
├── chess/
│   ├── ChessGame.java         // Contains the `main` method to start the game.
│   ├── Game.java              // Handles game logic like turns and moves.
│   ├── board/
│   │   ├── ChessBoard.java    // Manages board state, initialization, and moves.
│   ├── pieces/
│   │   ├── Piece.java         // Abstract base class for all chess pieces.
│   │   ├── Pawn.java          // Logic for the Pawn.
│   │   ├── Rook.java          // Logic for the Rook.
│   │   ├── Knight.java        // Logic for the Knight.
│   │   ├── Bishop.java        // Logic for the Bishop.
│   │   ├── Queen.java         // Logic for the Queen.
│   │   ├── King.java          // Logic for the King.
```

---

## Features ✨

### Backend 🛠️
- Implements all standard chess rules (e.g., piece movements, captures, checks).
- Modular design for easy scalability and readability.
- Extensible to support advanced chess rules (e.g., castling, promotion).

### Frontend 🌐
- Fully styled and interactive interface for gameplay.
- Real-time move validation with visual feedback.
- Supports playing as White or Black.

---

## Technologies Used 🖥️

### Backend:
- **Java**: Core programming language for the game logic.

### Frontend:
- **HTML/CSS/JavaScript**: For creating an interactive web interface.
- **AJAX**: Communication between frontend and backend.

---

## How to Run 🚀

### Backend:
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/chess-game.git
   cd chess-game
   ```
2. Open the project in your favorite Java IDE (e.g., IntelliJ, Eclipse).
3. Compile and run the `ChessGame.java` file to start the backend server.

### Frontend:
1. Navigate to the `frontend/` directory.
2. Open the `index.html` file in a web browser.
3. Start playing the game!

---

## User Interface 🎨

### Key Features:
- Intuitive drag-and-drop functionality for moving pieces.
- Highlighting valid moves for each selected piece.
- Visual indicators for checks, captures, and turn switching.

---

## Future Enhancements 🚧
- Add support for online multiplayer.
- Implement chess timers and ranking system.
- Extend to include advanced rules like en passant and castling.

---

## Contributing 🤝

We welcome contributions! Please fork the repository, create a feature branch, and submit a pull request.

1. Fork the project.
2. Create your feature branch:
   ```bash
   git checkout -b feature/AmazingFeature
   ```
3. Commit your changes:
   ```bash
   git commit -m 'Add some AmazingFeature'
   ```
4. Push to the branch:
   ```bash
   git push origin feature/AmazingFeature
   ```
5. Open a pull request.

---

## License 📜

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## Acknowledgments 🙌
- Inspired by the love for chess and clean code.
- Special thanks to the Open Source community for tools and libraries.

---

Enjoy playing chess! ♟️
