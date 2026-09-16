# Sistema de Registro de Pacientes — Centro de Salud "Breña"

Proyecto desarrollado para el curso de **Lenguajes de Programación**. Consiste en una aplicación de escritorio en Java con interfaz gráfica (Swing) que permite gestionar el registro de pacientes de un centro de salud.

## Descripción

La aplicación permite registrar, buscar, listar y eliminar pacientes, además de generar un reporte con estadísticas básicas (cantidad de pacientes, promedio de edades e ingresos totales).

## Funcionalidades

- **Añadir paciente**: registra nombre, caso (motivo de consulta), edad, DNI, día de atención, hora y pago.
- **Buscar paciente**: consulta los datos de un paciente por su número de DNI.
- **Eliminar paciente**: elimina el registro de un paciente por su DNI.
- **Reportar**: muestra un listado completo de pacientes junto con estadísticas generales (total de pacientes, promedio de edad, ingresos totales).
- **Validaciones de datos**:
  - DNI: exactamente 8 dígitos numéricos, sin duplicados.
  - Día: formato `dd/mm/aaaa` (ejemplo: `12/12/2026`).
  - Pago: número válido, admite el símbolo `S/` opcional (ejemplo: `S/15.5`).
  - Nombre y caso: se formatean automáticamente con la primera letra en mayúscula.

## Tecnologías utilizadas

- **Java** (Swing para la interfaz gráfica)
- **Eclipse IDE**
- Expresiones regulares para validación de campos

## Estructura del proyecto

```
├── gui/
│   └── V1.java              # Ventana principal e interacción con el usuario
├── Clases/
│   ├── Pacientes.java       # Clase que representa a un paciente
│   └── Arreglopacientes.java # Manejo de la lista de pacientes (ArrayList)
```

## Cómo ejecutar el proyecto

1. Clonar el repositorio:
   ```
   git clone https://github.com/Bonifacio23/Desafio.Lenguajes_de_programacion.git
   ```
2. Abrir el proyecto en **Eclipse IDE** (File → Open Projects from File System).
3. Ejecutar la clase `V1.java` (contiene el método `main`).

## Integrantes

- **Félix Jesús Bonifacio Cotrina** — Estudiante de Ingeniería de Sistemas, Universidad Privada del Norte.
- **Jeremy Miguel Pacheco Aparco** — Estudiante de Ingeniería de Sistemas, Universidad Privada del Norte.
- **Sergio Joaquin Marcoz Otarola** — Estudiante de Ingeniería de Sistemas, Universidad Privada del Norte.
- **Gustavo Vladimir Nolazco Quisuruco** — Estudiante de Ingeniería de Sistemas, Universidad Privada del Norte.

## Curso

Lenguajes de Programación
