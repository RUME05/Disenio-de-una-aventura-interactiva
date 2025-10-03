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

| Nivel 1: Ecosistemas                                       | Nivel 2: Hábitats                                        | Nivel 3: Animales                                       |
| :---------------------------------------------------------: | :----------------------------------------------------------: | :------------------------------------------------------: |
| ![Pantalla principal de Ecosistemas](https://github.com/RUME05/Disenio-de-una-aventura-interactiva/blob/master/1.jpg) | ![Pantalla Habitats](https://github.com/RUME05/Disenio-de-una-aventura-interactiva/blob/master/6.jpg)  | ![Pantalla lista de animales](https://github.com/RUME05/Disenio-de-una-aventura-interactiva/blob/master/9.jpg) |
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
## ⚙️ Implementación de Temas con SharedPreferences

La aplicación incorpora una funcionalidad de cambio de tema entre un **modo claro** y un **modo oscuro**, persistiendo la elección del usuario a través de `SharedPreferences`.

### Descripción de la Implementación
1.  **Definición de Temas:** Se crearon dos estilos (`Theme.App.Light` y `Theme.App.Dark`) en `res/values/themes.xml`, cada uno apuntando a un conjunto de colores específicos para su tema definidos en `res/values/colors.xml`.
2.  **`ThemeManager`:** Se desarrolló un `object` Kotlin (`ThemeManager.kt`) para guardar y cargar la preferencia del tema en `SharedPreferences`. Este objeto también se encarga de aplicar el tema adecuado a cada `Activity`.
3.  **Aplicación Global:** En el método `onCreate()` de cada `Activity` (`MainActivity`, `HabitatActivity`, `AnimalActivity`), se llama a `ThemeManager.applyTheme(this)` **antes** de `setContentView()` para asegurar que el tema correcto se aplique tan pronto como la `Activity` se inicie.
4.  **Selector de Tema:** Se añadió un `SwitchMaterial` en la `MainActivity` que permite al usuario alternar entre los temas. Al cambiar el estado del `Switch`, se actualiza la preferencia en `SharedPreferences` y se llama a `recreate()` en la `Activity` para que los cambios se visualicen instantáneamente.

### Cómo Usar el Selector de Tema
1.  Iniciar la aplicación.
2.  En la pantalla principal (`MainActivity`), se vera un **interruptor (Switch)** en la esquina superior derecha con el texto "Modo Oscuro" al lado.
3.  Hacer clic en el `Switch` para activarlo o desactivarlo.
4.  La `Activity` se reiniciará automáticamente y la aplicación cambiará a la apariencia del modo oscuro o claro, según la selección.
5.  La aplicación recordará la última elección de tema cada vez que se cierres y se vuelva a abrir.

### Capturas de Pantalla (Modos Claro y Oscuro)

#### Modo Claro

| Nivel 1: Ecosistemas | Nivel 2: Hábitats | Nivel 3: Animales |
| :------------------: | :---------------: | :---------------: |
| ![Modo Claro - Ecosistemas](https://github.com/RUME05/Disenio-de-una-aventura-interactiva/blob/master/10.jpg) | ![Modo Claro - Hábitats](https://github.com/RUME05/Disenio-de-una-aventura-interactiva/blob/master/11.jpg) | ![Modo Claro - Animales](https://github.com/RUME05/Disenio-de-una-aventura-interactiva/blob/master/12.jpg) |

#### Modo Oscuro

| Nivel 1: Ecosistemas | Nivel 2: Hábitats | Nivel 3: Animales |
| :------------------: | :---------------: | :---------------: |
| ![Modo Oscuro - Ecosistemas](https://github.com/RUME05/Disenio-de-una-aventura-interactiva/blob/master/13.jpg) | ![Modo Oscuro - Hábitats](https://github.com/RUME05/Disenio-de-una-aventura-interactiva/blob/master/14.jpg) | ![Modo Oscuro - Animales](https://github.com/RUME05/Disenio-de-una-aventura-interactiva/blob/master/15.jpg) |

---
*Ruiz Martinez Erick*
