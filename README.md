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
* **Interfaz Interactiva:** Puntos de interés en el nivel de animales que muestran información adicional en un `AlertDialog`.

---

## 📸 Capturas de Pantalla

| Nivel 1: Ecosistemas                                       | Nivel 2: Hábit
