# Aplicación Hospital
Pequeña aplicación de consola para gestionar **médicos, pacientes y citas** siguiendo una estructura **MVC** (Modelo–Vista–Controlador).  

## Requisitos
- **JDK**: 17
- **Maven**: 3.8+
- **IDE opcional**: NetBeans/IntelliJ/Eclipse

## Estructura del proyecto
AplicacionHospital/

└─ AplicacionHospital/

├─ pom.xml

└─ src/

└─ main/

└─ java/

├─ com/mycompany/aplicacionhospital/

│ └─ AplicacionHospital.java # Clase main

├─ Modelo/ # Entidades y lógica de dominio

│ ├─ Cita.java

│ ├─ Medico.java

│ ├─ Paciente.java

│ ├─ HistorialMedico.java

│ ├─ GestorCitas.java

│ └─ Hospital.java # (vacía / placeholder)

├─ Vista/ # Menús de consola

│ ├─ MenuPrincipal.java

│ ├─ MenuMedico1.java

│ ├─ MenuPaciente1.java

│ └─ MenuCita.java

└─ Controlador/ # Orquestación de acciones

## Licencia

MIT License
├─ MenuPrincipalControlador.java
├─ CitasControlador.java
└─ MenuCitas.java
