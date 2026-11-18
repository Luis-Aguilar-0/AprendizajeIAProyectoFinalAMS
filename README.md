# AprendizajeIA

![Java](https://img.shields.io/badge/Java-21%2B-orange?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.1.1-brightgreen?style=for-the-badge&logo=springboot)
![Spring AI](https://img.shields.io/badge/Spring%20AI-Enabled-6DB33F?style=for-the-badge&logo=spring)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-16-blue?style=for-the-badge&logo=postgresql)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-HTML5%2FCSS3-005F0F?style=for-the-badge&logo=thymeleaf)

**AprendizajeIA** es una plataforma web educativa diseñada para capacitar a estudiantes y profesionales sobre el uso responsable, ético y legal de la Inteligencia Artificial Generativa.


## Problemática y Propósito

La rápida adopción de modelos de lenguaje (LLMs) y agentes automatizados en el entorno profesional ocurre frecuentemente sin comprender los riesgos de privacidad de datos, sesgos algorítmicos y derechos de autor. **AprendizajeIA** resuelve esta brecha ofreciendo un entorno centralizado con tres ejes temáticos:
1. **Arquitecturas de IA Generativa y Agentes.**
2. **Buenas Prácticas y *Prompt Engineering* seguro.**
3. **Marco Normativo, Ética y Protección de Datos.**

---


##  Arquitectura

El proyecto sigue una arquitectura: 

* **Backend:** Java, Spring Boot `4.1.1`
* **Inteligencia Artificial:** Spring AI (compatible con proveedores como OpenAI, Google Gemini y DeepSeek).
* **Frontend:** Thymeleaf, HTML5, CSS3 (Grid / Flexbox).
* **Base de Datos:** PostgreSQL.
* **Modelado y Gestión:** PlantUML (UML, ER, Gantt), Jira Software y Git/GitHub (Conventional Commits).

---

## Modelo de Base de Datos

El esquema relacional consta de **5 entidades principales** normalizadas:
* `usuario`: Credenciales y perfil del estudiante.
* `modulo`: Bloques temáticos ordenados secuencialmente.
* `leccion`: Contenido teórico y multimedia asociado a cada módulo.
* `progreso`: Tabla intermedia que registra calificaciones y estado de aprobación por usuario y módulo.
* `chat_interaccion`: Historial de *prompts* y respuestas generadas por el agente de IA.

## Los diagramas UML del proyecto se encuentra en la carpeta /demo/docs/

* En la carpeta docs encontrara: 
* **Diagramas UML: Diagrama de casos de uso, diagrama de clases**
* **Diagramas scrum: Diagrama scrum, diagrama entidad relacion**