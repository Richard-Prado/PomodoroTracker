# Pomodoro Tracker ⏲️

![Java Version](https://img.shields.io/badge/Java-17+-orange?style=for-the-badge&logo=openjdk)
![Build Status](https://img.shields.io/badge/Build-Passing-brightgreen?style=for-the-badge&logo=gradle)
![License](https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge)
![Platform](https://img.shields.io/badge/Platform-Desktop-blue?style=for-the-badge)

**Pomodoro Tracker** é uma aplicação desktop leve e prática para gerenciar seu tempo usando a técnica Pomodoro.

Feita em **Java 17+** com interface **Swing** e empacotamento nativo via **jpackage**.

---

## 🚀 Funcionalidades

- ▶️ Iniciar o temporizador (25 minutos padrão)
- ⏸️ Pausar / Retomar o cronômetro
- 🔄 Resetar para o tempo inicial
- Interface simples e limpa

---

## 🛠️ Tecnologias

- **Linguagem:** Java 17+
- **Interface:** Swing
- **Build:** Gradle
- **Distribuição:** jpackage (gera .exe, .dmg, .deb etc.)

---

## 📦 Instalação e Uso

### Pré-requisitos

- Java JDK 17 ou superior
- Git (para clonar o projeto)

### Rodando localmente

```bash
# Clone o repositório
git clone https://github.com/Richard-Prado/PomodoroTrackerr.git
cd pomodoro-tracker

# Execute a aplicação
./gradlew run
```

# Estrutura do projeto
```
pomodoro-tracker/
├── src/
│   ├── main/
│   │   ├── java/         # Lógica + interface
│   │   └── resources/    # ícones, imagens, etc.
├── build.gradle          # Configuração Gradle 
├── settings.gradle
├── gradlew
├── gradlew.bat
└── README.md
```

## 🤝 Contribuindo

- **Faça um fork do repositório**
- **Crie sua branch:**
- **git checkout -b feature/sua-melhoria**
- **Commit suas mudanças:**
- **git commit -m 'feat: adiciona som de término'**
- **Push para o repositório:**
- **git push origin feature/sua-melhoria**
- **Abra um Pull Request**

## ⚖️ Licença
MIT License
Veja o arquivo LICENSE para mais detalhes.

Feito com ☕ e foco por Richard

Qualquer sugestão, bug ou ideia → abra uma issue!
