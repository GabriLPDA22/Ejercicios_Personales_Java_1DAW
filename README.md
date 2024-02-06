🚌 Gestión de Transporte ACME para DSW 🚏
Este proyecto es el corazón del sistema de gestión para la empresa de transporte DSW, diseñado específicamente para administrar las operaciones y rutas de la compañía ACME, así como para gestionar su valioso equipo de empleados.

📑 Tabla de Contenidos
Introducción
Clases y Funcionalidades
Persona
Empleado
Ruta
Implementación
Ejemplo de Uso
Conclusión
🌟 Introducción
El propósito de este proyecto es desarrollar un sistema integral que permita a DSW manejar eficientemente las rutas de autobuses para ACME, así como administrar su equipo de empleados de manera eficaz, asegurando una operación fluida y optimizada.

🚀 Clases y Funcionalidades
🧍 Clase Persona
Fundamento de nuestro sistema, representa los datos básicos de individuos dentro de nuestra organización.

Atributos:

nombre 📛: Identificación personal.
edad 🎂: Años cumplidos.
Métodos:

cargarDatosPersonales() ➕: Introduce o actualiza datos.
imprimirDatosPersonales() 🖨️: Exhibe información personal.
💼 Clase Empleado
Extiende a Persona para especializarse en las particularidades de nuestros colaboradores.

Atributos:

sueldo 💲: Compensación económica.
Métodos:

cargarSueldo() 💰: Actualiza la compensación.
imprimirSueldo() 📄: Muestra la compensación económica.
🗺️ Clase Ruta
Orquesta las rutas de nuestros autobuses, incluyendo paradas y personal asignado.

Atributos:

paradas 🛑: Secuencia de paradas.
empleados 👥: Equipo asignado a la ruta.
horaInicio ⏰: Momento de partida.
horaLlegada 🕒: Momento de arribo.
Métodos:

subirEmpleado(empleado) 📈: Incorpora un empleado a la ruta.
bajarEmpleado(empleado) 📉: Retira un empleado de la ruta.
nombreParadaActual() 📍: Informa la parada en curso.
💻 Implementación
El desarrollo se basa en principios de programación orientada a objetos, creando instancias de las clases con sus respectivas funcionalidades y demostrando su uso práctico.

📖 Ejemplo de Uso
Configuración de Personas y Empleados:
Instancia y gestión de datos personales y profesionales.
Administración de Rutas:
Creación y manejo dinámico de rutas, incluyendo la gestión de personal.
✅ Conclusión
A través de este sistema, DSW podrá asegurar una gestión eficiente de su equipo y operaciones de transporte para ACME, estableciendo un flujo de trabajo coherente y optimizado.
