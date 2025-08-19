# Proyecto Final – Programación Cliente/Servidor Concurrente

## Descripción
Aplicación Java que simula un **cajero automático**.  
Permite la gestión de usuarios, apertura de cuentas, depósitos, retiros y transferencias entre cuentas, incluyendo un **historial de operaciones**.  
Se utiliza **interfaz gráfica con JOptionPane**, **excepciones**, **herencia** y **polimorfismo**.

## Tecnologías
- Java 17  
- Interfaz gráfica Swing (JOptionPane)  
- Colecciones y manejo de excepciones  
- NetBeans IDE / Maven  

## Usuarios de prueba
Para la demostración del video, estos son los usuarios creados:

| Nombre           | PIN  | Saldo inicial |
|-----------------|------|---------------|
| Sancho Pereira  | 5447 | $1000         |
| María González  | 1234 | $500          |
| Juan Pérez      | 9876 | $1200         |

> Puedes usar estos datos para realizar depósitos, retiros o transferencias durante la demostración.

## Cómo ejecutar

1. **Compilar el proyecto**
   - Si usas Maven:  
     ```bash
     mvn -q -DskipTests package
     ```
   - Si usas NetBeans: seleccionar **Construir proyecto**.

2. **Ejecutar la aplicación**
   - Ejecuta la clase principal:
     ```bash
     java -cp target/ProyectoFinal-1.0-SNAPSHOT.jar proyectoavance2randall.InterfazCajero
     ```
   - Aparecerá un **JOptionPane** para ingresar el PIN del usuario.

3. **Menú principal**
   - Consultar Saldo  
   - Depositar dinero  
   - Retirar dinero  
   - Transferir dinero a otro usuario  
   - Mostrar historial de operaciones  
   - Salir

> Todas las operaciones se registran en el historial y se muestran en la opción "Mostrar historial de operaciones".

## Capturas de pantalla
*(Opcional: subir imágenes a `docs/capturas/` y referenciarlas aquí)*  

Ejemplo:  
![Menú principal](docs/capturas/menu-principal.png)  
![Transferencia exitosa](docs/capturas/transferencia-exitosa.png)  

## Video de presentación
[https://youtu.be/drZs_aAIR9I]

## Autor
Randall Quintero Orozco – Curso Programación Cliente/Servidor

