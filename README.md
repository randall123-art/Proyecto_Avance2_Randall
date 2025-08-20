# Proyecto Final – Programación Cliente/Servidor Concurrente

## Descripción
Aplicación Java que simula un **cajero automático**.  
Permite la **gestión de usuarios y cuentas bancarias**, incluyendo operaciones de **depósitos, retiros, transferencias y consulta de historial de transacciones**.  

Se utiliza **interfaz gráfica con JOptionPane**, **excepciones**, **herencia** y **polimorfismo**, manteniendo la estructura de clases que se implementó para el Avance 1 y 2.  

Ahora, todas las operaciones se guardan en una **base de datos Derby (Java DB)** para cumplir con los requisitos de persistencia.

## Tecnologías
- Java 17  
- Swing (JOptionPane)  
- Colecciones y excepciones personalizadas  
- JDBC + Derby (Java DB)  
- NetBeans IDE / Maven  

## Usuarios de prueba
Para la demostración del video, estos son los usuarios creados en la base de datos:

| Nombre           | PIN  | Saldo inicial |
|------------------|------|---------------|
| Sancho Pereira   | 5447 | $1000         |
| María González   | 1234 | $500          |
| Juan Pérez       | 9876 | $1200         |

> Puedes usar estos datos para realizar depósitos, retiros o transferencias durante la prueba.

## Cómo ejecutar

1. **Compilar el proyecto**
   - Si usas Maven:  
     ```bash
     mvn -q -DskipTests package
     ```
   - Si usas NetBeans: seleccionar **Construir proyecto**.

2. **Configurar la base de datos Derby**
   - Asegúrate de tener iniciado el servicio **Java DB** en NetBeans.  
   - Crear la base de datos `BancoDB` con usuario `app` y contraseña `app`.  
   - El proyecto se conectará automáticamente y guardará las operaciones allí.

3. **Ejecutar la aplicación**
   - Ejecuta la clase principal:
     ```bash
     java -cp target/ProyectoFinal-1.0-SNAPSHOT.jar proyectoavance2randall.InterfazCajero
     ```
   - Aparecerá un **JOptionPane** para ingresar el PIN del usuario.

4. **Menú principal**
   - Consultar saldo  
   - Depositar dinero  
   - Retirar dinero  
   - Transferir dinero a otro usuario  
   - Mostrar historial de operaciones  
   - Salir  

> Todas las operaciones se registran tanto en memoria como en la base de datos Derby.

## Capturas de pantalla
Ejemplo:  
![Menú principal](docs/capturas/menu-principal.png)  
![Transferencia exitosa](docs/capturas/transferencia-exitosa.png)  

## Video de presentación
[Ver video de demostración](https://youtu.be/drZs_aAIR9I?si=e7ALV4xybngUJKRO)  

## Autor
Randall Quintero Orozco – Curso Programación Cliente/Servidor
