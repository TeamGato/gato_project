# 🐱 TicTacToe - Team Gato

## 📋 Briefing

Proyecto desarrollado como práctica de backend con Java, donde se implementa el clásico juego de **Tres en Raya (TicTacToe)** en modo **Persona vs Ordenador**, jugado por terminal.

El juego sigue un tablero de 3x3 donde el jugador (X) y el ordenador (O) se turnan para colocar sus fichas. Gana quien consiga tres fichas en línea (horizontal, vertical o diagonal). Si el tablero se llena sin que haya ganador, se declara empate.

---

## 💻 Tecnologías y herramientas

- **Lenguaje:** Java 25
- **Gestor de dependencias:** Maven
- **Testing:** JUnit 5 (5.11.0)
- **IDE:** IntelliJ IDEA
- **Control de versiones:** Git / GitHub
- **Gestión de tareas:** Jira (metodología ágil)

---

## 📁 Estructura del proyecto

```
gato_project/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── tictactoe/
│   │           ├── App.java
│   │           ├── Board.java
│   │           ├── Player.java
│   │           ├── Turn.java
│   │           ├── Game.java
│   │           ├── Display.java
│   │           └── Menu.java
│   └── test/
│       └── java/
│           └── tictactoe/
│               ├── BoardTest.java
│               └── GameTest.java
├── pom.xml
└── README.md
```

---

## 🧩 Clases y responsabilidades

Siguiendo el principio de responsabilidad única (S de SOLID):

| Clase | Responsabilidad |
|---|---|
| `App` | Punto de entrada del programa. Coordina la creación de objetos y el flujo general. |
| `Menu` | Gestiona la entrada del usuario: pide el nombre del jugador. |
| `Board` | Mantiene el estado del tablero (array `char[][]`), su inicialización y actualización. |
| `Player` | Representa a un jugador (persona o máquina). Gestiona el movimiento, la traducción de coordenadas y la selección aleatoria de la máquina. |
| `Turn` | Controla de quién es el turno actual y alterna entre jugadores. |
| `Game` | Orquesta la partida: bucle de juego, detección de ganador y empate. |
| `Display` | Gestiona todo lo que se muestra por pantalla: bienvenida, reglas y tablero. |

---

## 🎮 Reglas del juego

- El tablero es una cuadrícula de 3x3.
- El jugador juega con **X**, la máquina juega con **O**.
- Siempre empieza el jugador (X).
- En cada turno, se introduce la posición como **fila (A-C)** y **columna (1-3)**.
- Si la celda está ocupada o la posición es inválida, se solicita un nuevo movimiento sin perder el turno.
- Gana quien consiga tres fichas en línea (horizontal, vertical o diagonal).
- Si el tablero se llena sin ganador, se declara empate.

---

## ▶️ Cómo ejecutar el proyecto

1. Clonar el repositorio
2. Abrir el proyecto en IntelliJ IDEA
3. Ejecutar la clase `App.java`
4. Seguir las instrucciones por terminal

---

## ✅ Testing

Se han implementado tests unitarios con JUnit 5, cubriendo:

**BoardTest**
- El tablero inicia vacío
- Una celda está disponible al inicio
- Una celda queda ocupada tras un movimiento
- `updateBoard()` coloca el símbolo correctamente

**GameTest**
- Detección de victoria horizontal
- Detección de victoria vertical
- Detección de victoria diagonal
- Detección de empate con tablero lleno
- No hay empate si quedan celdas vacías

Para ejecutar los tests: clic derecho sobre la carpeta `test` → *Run All Tests*, o ejecutar cada clase de test individualmente desde IntelliJ.

---

## 🛠️ Metodología de trabajo

El desarrollo se ha realizado mediante **mob programming**, con roles rotativos:

- **Driver:** escribe el código
- **Navigators:** guían y proponen soluciones
- **Timekeeper:** controla el tiempo y la rotación de roles

La planificación y seguimiento de tareas se ha gestionado mediante **Jira**, con historias de usuario y subtareas técnicas divididas por funcionalidad.

---

## 🚀 Posibles mejoras futuras

- Implementar herencia (`HumanPlayer` / `MachinePlayer`) en lugar del atributo `isHuman`
- Modo persona vs persona
- Mejorar la inteligencia de la máquina (actualmente juega de forma aleatoria)
- Interfaz gráfica en lugar de terminal
- Separación de Responsabilidades: Extraer la lectura por consola (Scanner) de la clase Player y delegarla a la capa visual (Display/Menu) para tener un código más limpio y desacoplado.
---

## 👥 Equipo

Team Gato 🐱
- Damaris Castro
- Johanna Monroy
- Andrea Tapia
- Siuzanna Vachaganian