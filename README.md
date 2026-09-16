<div align="center">

![Header](https://capsule-render.vercel.app/api?type=waving&color=0:2E9CCA,100:1B6FA8&height=180&section=header&text=Sistema%20de%20Registro%20de%20Pacientes&fontSize=32&fontColor=ffffff&animation=fadeIn&fontAlignY=38&desc=Centro%20de%20Salud%20%22Bre%C3%B1a%22&descAlignY=58&descSize=18)

[![Typing SVG](https://readme-typing-svg.demolab.com?font=Fira+Code&size=20&pause=1000&color=2E9CCA&center=true&vCenter=true&width=600&lines=Proyecto+del+curso+Lenguajes+de+Programaci%C3%B3n;Java+%2B+Swing+%7C+Registro+de+Pacientes;Validaciones+con+expresiones+regulares)](https://git.io/typing-svg)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Swing](https://img.shields.io/badge/Swing-GUI-blue?style=for-the-badge)
![Eclipse](https://img.shields.io/badge/Eclipse-IDE-2C2255?style=for-the-badge&logo=eclipseide&logoColor=white)
![Status](https://img.shields.io/badge/Estado-En%20desarrollo-yellow?style=for-the-badge)

</div>

---

## 📋 Descripción

La aplicación permite registrar, buscar, listar y eliminar pacientes, además de generar un reporte con estadísticas básicas (cantidad de pacientes, promedio de edades e ingresos totales).

## ✨ Funcionalidades

- **Añadir paciente**: registra nombre, caso (motivo de consulta), edad, DNI, día de atención, hora y pago.
- **Buscar paciente**: consulta los datos de un paciente por su número de DNI.
- **Eliminar paciente**: elimina el registro de un paciente por su DNI.
- **Reportar**: muestra un listado completo de pacientes junto con estadísticas generales (total de pacientes, promedio de edad, ingresos totales).
- **Validaciones de datos**:
  - DNI: exactamente 8 dígitos numéricos, sin duplicados.
  - Día: formato `dd/mm/aaaa` (ejemplo: `12/12/2026`).
  - Pago: número válido, admite el símbolo `S/` opcional (ejemplo: `S/15.5`).
  - Nombre y caso: se formatean automáticamente con la primera letra en mayúscula.

## 🛠️ Tecnologías utilizadas

- **Java** (Swing para la interfaz gráfica)
- **Eclipse IDE**
- Expresiones regulares para validación de campos

## 📂 Estructura del proyecto

```
├── gui/
│   └── V1.java              # Ventana principal e interacción con el usuario
├── Clases/
│   ├── Pacientes.java       # Clase que representa a un paciente
│   └── Arreglopacientes.java # Manejo de la lista de pacientes (ArrayList)
```

## 🚀 Cómo ejecutar el proyecto

1. Clonar el repositorio:
   ```
   git clone https://github.com/Bonifacio23/Desafio.Lenguajes_de_programacion.git
   ```
2. Abrir el proyecto en **Eclipse IDE** (File → Open Projects from File System).
3. Ejecutar la clase `V1.java` (contiene el método `main`).

## 👥 Integrantes

- **Félix Jesús Bonifacio Cotrina** — Estudiante de Ingeniería de Sistemas, Universidad Privada del Norte.
- **Jeremy Miguel Pacheco Aparco** — Estudiante de Ingeniería de Sistemas, Universidad Privada del Norte.
- **Sergio Joaquin Marcoz Otarola** — Estudiante de Ingeniería de Sistemas, Universidad Privada del Norte.
- **Gustavo Vladimir Nolazco Quisuruco** — Estudiante de Ingeniería de Sistemas, Universidad Privada del Norte.

## 🎓 Curso

Lenguajes de Programación

<div align="center">

![Footer](https://capsule-render.vercel.app/api?type=waving&color=0:2E9CCA,100:1B6FA8&height=100&section=footer)

</div>
