# Conversor de Monedas con Consumo de API

## Índice

1. [Descripción del Proyecto](##Descripción del Proyecto)
2. [Instrucciones de Uso](#instrucciones-de-uso)
3. [Dependencias](#dependencias)
4. [Estructura del Proyecto](#estructura-del-proyecto)
5. [Configuración y Ejecución](#configuración-y-ejecución)
6. [Acerca de las Bibliotecas Utilizadas](#acerca-de-las-bibliotecas-utilizadas)
7. [Contacto y Soporte](#contacto-y-soporte)


---

## 1. Descripción del Proyecto

El proyecto es un conversor de monedas que utiliza una API externa para obtener tasas de cambio en tiempo real. Permite convertir entre varias monedas principales como el Nuevo Sol (PEN), Euro (EUR), Dólar estadounidense (USD) y Yen japonés (JPY). El usuario puede seleccionar la conversión deseada desde un menú interactivo en la consola.

---

## 2. Instrucciones de Uso

Para usar el conversor de monedas:

- Ejecuta la aplicación.
- Selecciona la opción correspondiente al tipo de conversión que deseas realizar.
- Ingresa la cantidad de la moneda base que deseas convertir.
- Observa el resultado de la conversión en la consola.
- Repite el proceso o selecciona la opción de salida para terminar.

---

## 3. Dependencias

El proyecto utiliza la siguiente dependencia externa:

- **Gson:** Utilizada para deserializar las respuestas JSON de la API de tasas de cambio.

---

## 4. Estructura del Proyecto

El proyecto está estructurado en los siguientes componentes principales:

- **Main.java:** Contiene la lógica principal del menú interactivo y la integración con el objeto `Cambiar`.
- **Cambiar.java:** Clase responsable de interactuar con la API de tasas de cambio para realizar las conversiones.
- **Data.java:** Clase modelo que representa la estructura de los datos recibidos de la API.

---

## 5. Configuración y Ejecución

Para ejecutar el proyecto:

1. **Clona el Repositorio:**
   ```bash
   git clone <https://github.com/stevenAnto/ConversorMonedas.git>
   cd conversor-de-monedas
   ```
# Compilación y Ejecución

Para compilar y ejecutar el proyecto:

\```bash
javac Main.java
java Main
\```

## Interacción con el Menú

Para utilizar el conversor de monedas:

- Selecciona la opción según la conversión que deseas realizar.
- Ingresa la cantidad de la moneda base que deseas convertir.
- Observa el resultado de la conversión en la consola.

## Acerca de las Bibliotecas Utilizadas

- **Gson:** Biblioteca de Google para la serialización y deserialización de objetos Java a JSON y viceversa. Puedes descargarla desde [aquí](https://github.com/google/gson/releases).

## Contacto y Soporte

Para cualquier pregunta o soporte adicional, por favor contacta a nuestro equipo de desarrollo:

- **Nombre:** Esteven Antonio Calcina Puma
- **Email:** [steven.undefined@gmail.com](mailto:steven.undefined@gmail.com)
