> [!NOTE]
> Este proyecto corresponde a mi trabajo de **final de grado**. Aunque el desarrollo comenzó recientemente, se espera que reciba actualizaciones significativas en las próximas semanas a medida que avance el proyecto.

# 🎶 Sound-Beat: Sistema de Streaming de Música

**Sound-Beat** es un proyecto de streaming de música que ofrece una experiencia fluida y sin interrupciones a los usuarios. Compuesto por un servidor que transmite música en tiempo real y una aplicación móvil en Android, esta plataforma está diseñada para ofrecer acceso rápido a canciones tanto en línea como locales. En caso de no tener conectividad a internet o , dispondrá de una base de datos en local donde podrás crear playlists con las canciones que dispongas en local.   

---

## 🌐 Características del Proyecto

### 1. **Servidor de Streaming**

El servidor es el núcleo que alimenta a los usuarios con música en tiempo real. Utilizando el protocolo **HLS (HTTP Live Streaming)**, el servidor está diseñado para gestionar múltiples usuarios simultáneamente y servir canciones de manera eficiente.

### 2. **Aplicación Android - Sound-Beat**

La aplicación móvil **Sound-Beat** está desarrollada en **Kotlin** y proporciona una interfaz intuitiva para conectar a los usuarios con el servidor, escuchar música sin interrupciones, y gestionar playlists tanto locales como del servidor.

---

## 🚀 Funcionalidades

### 🖥 **Servidor**
- **Manejo de múltiples usuarios**: Capacidad para servir música a varios usuarios de manera simultánea.
- **Transmisión en tiempo real**: Utiliza el protocolo **HLS** para asegurar una transmisión fluida de las canciones.
- **Gestión eficiente del contenido**: Sirve canciones de manera eficiente, asegurando que no haya pérdida de calidad ni interrupciones en la transmisión.
- **Uso de Ffmpeg**: Para segmentar las canciones y enviarlas de manera dinámica.

### 📱 **Aplicación Android - Sound-Beat**
- **Conexión estable con el servidor**: Permite a los usuarios conectarse y escuchar música sin interrupciones.
- **Reproducción de música**: Reproduce canciones del servidor en tiempo real.
- **Creación de playlists**: Los usuarios pueden crear listas de reproducción tanto con canciones del servidor como con archivos locales.
- **Reproductor de música**: Implementación de **ExpPlayer** para una experiencia de reproducción optimizada.

---

## 📦 Instalación

### Servidor
1. Clona este repositorio:
    ```bash
    git clone https://github.com/ax14n/sound-beat-server
    ```
2. Instala las dependencias necesarias.
3. Configura el servidor y asegúrate de que está ejecutando **HLS** con **Ffmpeg** para la transmisión de audio.

### Aplicación Android
1. Clona este repositorio:
    ```bash
    git clone https://github.com/ax14n/sound-beat.git
    ```
2. Abre el proyecto en Android Studio.
3. Conecta tu dispositivo Android y ejecuta la aplicación.

---

¡Que el código fluya y las canciones nunca dejen de sonar, pues en cada bit reside una melodía eterna! 🎵
