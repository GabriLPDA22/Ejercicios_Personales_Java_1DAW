# Sistema de Gestión de Inmuebles para Inmobiliaria

Este sistema está diseñado para gestionar la venta de dos tipos de inmuebles: **Pisos** y **Locales**. Proporciona una forma estandarizada de calcular el precio de cada inmueble basándose en sus características y antigüedad.

## Características Generales de los Inmuebles

Todos los inmuebles registrados en este sistema comparten las siguientes características básicas:

- **Dirección**: Ubicación exacta del inmueble.
- **Metros Cuadrados**: Tamaño del inmueble en metros cuadrados.
- **Antigüedad**: Determina si el inmueble es nuevo (menos de 15 años) o de segunda mano (15 años o más), afectando su precio final.

## Especificaciones por Tipo de Inmueble

### Pisos

Los pisos tienen una característica adicional importante:

- **Piso**: Indica en qué planta se encuentra el piso. Si es un tercero o más alto, el precio se incrementa un 3%.

### Locales

Los locales se diferencian por las siguientes especificaciones:

- **Número de Ventanas**: Afecta el precio de manera que:
  - Si tiene 1 o ninguna ventana, el precio se reduce un 2%.
  - Si tiene más de 4 ventanas, el precio se incrementa un 2%.
  - Si el local tiene más de 50 metros cuadrados, su precio también se incrementa en un 1%.

## Cálculo del Precio

El precio de los inmuebles se calcula a partir de un precio base, con ajustes según las siguientes reglas:

- Para todos los inmuebles:
  - Si tienen menos de 15 años, el precio se rebaja un 1%.
  - Si tienen 15 años o más, el precio se reduce un 2%.
- Ajustes específicos para pisos y locales según las reglas descritas en las secciones anteriores.

## Uso del Sistema

Este sistema permite a los usuarios registrar, actualizar y consultar inmuebles, así como calcular automáticamente el precio de venta basado en las características específicas de cada inmueble.
