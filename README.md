# 🦒 Explorador del Reino Animal

![Kotlin](https://img.shields.io/badge/Language-Kotlin-blue?style=for-the-badge&logo=kotlin)
![Platform](https://img.shields.io/badge/Platform-Android-green?style=for-the-badge&logo=android)

Una aplicación Android nativa, permite a los usuarios explorar los 3 ecosistemas y descubrir la fauna que los habita.

---

## 📜 Descripción Detallada

**Explorador del Reino Animal** es una aplicación móvil que guía al usuario a través de una navegación jerárquica de tres niveles de 3 diferentes Activities, simulando un viaje desde un ecosistema hasta el descubrimiento de una especie en particular.

La estructura de la aplicación es la siguiente:
1.  **Nivel 1 (Ecosistemas):** La pantalla principal, donde el usuario elige entre los 3 ecosistemas del mundo natural: **Terrestre**, **Acuático** o **Mixto**.
2.  **Nivel 2 (Hábitats):** Al seleccionar un ecosistema, la aplicación presenta una lista de hábitats específicos, como `Bosques`, `Selvas`, `Desiertos`, `Océanos`, `Ríos`, etc.
3.  **Nivel 3 (Animales):** Tras elegir un hábitat, se muestra una galería de animales comunes de esa región. Cada animal es un punto interactivo que, al ser presionado, revela información descriptiva sobre la especie.


* **Navegación Jerárquica:** Tres niveles de profundidad implementados con `Activities` y `Fragments`.
* **Diseño Visual Temático:** Cada nivel cuenta con fondos y diseños que reflejan el entorno que se está explorando.
* **Transiciones Creativas:** Animaciones de `fade` y `slide` que mejoran la sensación de navegación.
* **Interfaz Interactiva:** Puntos de interés en el nivel de animales que muestran información adicional.

---

## 📸 Capturas de Pantalla

| Nivel 1: Ecosistemas                                       | Nivel 2: Hábit

## 🛠️ Instalación y Ejecución

Para clonar y ejecutar este proyecto localmente, seguir estos pasos:

1.  **Clonar el Repositorio**
    ```bash
    git clone [https://github.com/RUME05/Disenio-de-una-aventura-interactiva.git](https://github.com/RUME05/Disenio-de-una-aventura-interactiva.git)
    ```

2.  **Abrir en Android Studio**
    * Abrir Android Studio.
    * Seleccionar `Open` y navegar hasta la carpeta del proyecto clonado.
    * Esperar a que Gradle sincronice todas las dependencias.

3.  **Ejecutar la Aplicación**
    * Seleccionar un emulador o conecta un dispositivo físico.
    * Hacer clic en el botón **Run app**.

---

## 🎨 Decisiones de Diseño y Transiciones

### Arquitectura y Diseño Visual
La aplicación se estructuró en tres `Activities` distintas para un nivel jerárquico. Esto permite una personalización visual completa. Cada `Activity` puede gestionar su propio fondo de pantalla y estilo. La pantalla principal, utiliza `Fragments` para organizar la selección de ecosistemas.

### Mecanismos de Transición
Para la navegación, se implementaron transiciones personalizadas:
* **Fade:** Al cambiar entre los `Fragments` de ecosistemas en la `MainActivity`, se usa una animación de fundido. Un cambio suave en la misma pantalla.
* **Slide:** Al pasar de una `Activity` a otra (de un nivel al siguiente), se utiliza una animación de deslizamiento horizontal. Esto para una sensación de avance en la jerarquía, como si se pasara a una sección nueva.

---

## 💡 Retos y Soluciones

Durante el desarrollo, se presentaron varios desafíos técnicos que requirieron depuración y soluciones específicas:

| Reto                      | Descripción del Problema                                                                                                                              | Solución Implementada                                                                                                                                                                                                                           |
| :------------------------ | :---------------------------------------------------------------------------------------------------------------------------------------------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Errores de Compilación** | Aparecían constantemente errores de `Unresolved Reference` para clases del sistema (`Intent`, `View`), recursos (`R`) y clases del proyecto (Fragments). | La causa era la falta de las sentencias `import` adecuadas. Se solucionó revisando cada archivo y utilizando la herramienta de Android Studio (`Alt + Enter`) para importar automáticamente las dependencias necesarias.                               |
| **Crash al Iniciar la App** | La aplicación se instalaba pero se cerraba de inmediato, mostrando un error `Fatal_exception` para `MainActivity`.                     | El problema era una desincronización entre el `package name` de los archivos Kotlin. La solución final fue sincronizar correctamente los nombres de los `packages`. |
| **Errores de Formato XML** | El build fallaba con errores de `XML Parsing`, indicando que una etiqueta no estaba cerrada o se encontraba fuera del elemento raíz.                    | Se realizó una revisión manual de los archivos `.xml`. La solución fue corregir la sintaxis, asegurando que todas las vistas estuvieran correctamente y que cada etiqueta se cerrara adecuadamente.                |

---
*Ruiz Martinez Erick*
