🦒 Explorador del Reino Animal
Una aplicación Android nativa diseñada para ofrecer una experiencia educativa e inmersiva, permitiendo a los usuarios explorar diversos ecosistemas y descubrir la fauna que los habita.

📜 Descripción Detallada
Explorador del Reino Animal es una aplicación móvil que guía al usuario a través de una navegación jerárquica de tres niveles, simulando un viaje desde una vista global de los ecosistemas hasta el descubrimiento de una especie en particular.

La estructura de la aplicación es la siguiente:

Nivel 1 (Ecosistemas): La pantalla principal, donde el usuario elige entre las grandes divisiones del mundo natural: Terrestre, Acuático o Mixto.

Nivel 2 (Hábitats): Al seleccionar un ecosistema, la aplicación presenta una lista de hábitats específicos, como Bosques, Selvas, Desiertos, Océanos, Ríos, etc.

Nivel 3 (Animales): Tras elegir un hábitat, se muestra una galería de animales comunes de esa región. Cada animal es un punto de interés interactivo que, al ser presionado, revela información descriptiva sobre la especie.

El proyecto no solo se enfoca en la funcionalidad, sino también en crear una experiencia de usuario atractiva a través de un diseño temático y transiciones fluidas.

✨ Características Principales
Navegación Jerárquica: Tres niveles de profundidad implementados con Activities y Fragments.

Diseño Visual Temático: Cada nivel cuenta con fondos y diseños únicos que reflejan el entorno que se está explorando.

Transiciones Creativas: Animaciones de fade y slide que mejoran la sensación de navegación y exploración.

Persistencia de Datos: La elección del tema (Claro u Oscuro) se guarda localmente usando SharedPreferences, por lo que la aplicación recuerda las preferencias del usuario entre sesiones.

Interfaz Interactiva: Puntos de interés en el nivel de animales que muestran información adicional en un AlertDialog.

📸 Capturas de Pantalla
Nivel 1: Ecosistemas	Nivel 2: Hábitats	Nivel 3: Animales
[Pega aquí tu captura de la pantalla principal]	[Pega aquí tu captura de la selección de hábitats]	[Pega aquí tu captura de la galería de animales]
MainActivity con selección de ecosistemas.	HabitatActivity mostrando los hábitats terrestres.	AnimalActivity mostrando la fauna del bosque.

Exportar a Hojas de cálculo
🛠️ Instalación y Ejecución
Para clonar y ejecutar este proyecto localmente, sigue estos pasos:

Clonar el Repositorio

Bash

git clone https://github.com/TU_USUARIO/TU_REPOSITORIO.git
Abrir en Android Studio

Abre Android Studio.

Selecciona Open y navega hasta la carpeta del proyecto clonado.

Espera a que Gradle sincronice todas las dependencias.

Ejecutar la Aplicación

Selecciona un emulador o conecta un dispositivo físico.

Haz clic en el botón Run 'app' (▶️).

🎨 Decisiones de Diseño y Transiciones
Arquitectura y Diseño Visual
La aplicación se estructuró en tres Activities distintas para cada nivel jerárquico. Esta decisión se tomó para desacoplar cada pantalla y permitir una personalización visual completa. Cada Activity puede gestionar su propio fondo de pantalla y estilo, reforzando la inmersión del usuario a medida que "profundiza" en la exploración. La pantalla principal, a su vez, utiliza Fragments para organizar la selección de ecosistemas de manera eficiente.

Mecanismos de Transición
Para que la navegación se sintiera como un viaje, se implementaron transiciones personalizadas:

Fade (Fundido): Al cambiar entre los Fragments de ecosistemas en la MainActivity, se usa una animación de fundido. Esto crea un cambio suave y elegante en la misma pantalla.

Slide (Deslizamiento): Al pasar de una Activity a otra (de un nivel al siguiente), se utiliza una animación de deslizamiento horizontal. Esto genera una clara sensación de avance en la jerarquía, como si se pasara a una "página" o sección nueva.

💡 Retos y Soluciones
Durante el desarrollo, se presentaron varios desafíos técnicos que requirieron depuración y soluciones específicas:

Reto	Descripción del Problema	Solución Implementada
Errores de Compilación	Aparecían constantemente errores de Unresolved Reference para clases del sistema (Intent, View), recursos (R) y clases del proyecto (Fragments).	La causa era la falta de las sentencias import adecuadas. Se solucionó revisando cada archivo y utilizando la herramienta de Android Studio (Alt + Enter) para importar automáticamente las dependencias necesarias.
Crash al Iniciar la App	La aplicación se instalaba pero se cerraba de inmediato, mostrando un error java.lang.ClassNotFoundException para MainActivity.	El problema era una desincronización entre el package name de los archivos Kotlin y la configuración del namespace en build.gradle. La solución final que funcionó fue usar la opción "File > Invalidate Caches / Restart..." para forzar a Android Studio a limpiar su caché y reindexar el proyecto desde cero.
Errores de Formato XML	El build fallaba con errores de XML Parsing, indicando que una etiqueta no estaba cerrada o se encontraba fuera del elemento raíz.	Se realizó una revisión manual de los archivos .xml señalados en el log. La solución fue corregir la sintaxis, asegurando que todas las vistas estuvieran correctamente anidadas dentro del layout principal y que cada etiqueta se cerrara con /> o con su correspondiente etiqueta de cierre.

Exportar a Hojas de cálculo
Este proyecto fue desarrollado como parte de un ejercicio práctico de desarrollo de aplicaciones Android.
