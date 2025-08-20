# Proyecto Final – Programación Cliente/Servidor Concurrente

## Descripción
Aplicación Java que simula un **cajero automático**.  
Permite la **gestión de usuarios y cuentas bancarias**, incluyendo operaciones de **depósitos, retiros, transferencias y consulta de historial de transacciones**.  

Se implementaron los siguientes conceptos del curso:  
- **Clases y objetos**  
- **Herencia y polimorfismo**  
- **Manejo de excepciones**  
- **Colecciones (List, ArrayList)**  
- **Interfaz gráfica con JOptionPane**  
- **Persistencia de datos en base de datos Derby (Java DB)**  

## Tecnologías
- Java 17  
- Swing (JOptionPane)  
- JDBC + Derby (Java DB)  
- Colecciones y excepciones personalizadas  
- NetBeans IDE / Maven  

## Usuarios de prueba
Para la demostración del video, estos son los usuarios creados en la base de datos:

| Nombre           | PIN  | Saldo inicial |
|------------------|------|---------------|
| Sancho Pereira   | 5447 | $1000         |
| María González   | 1234 | $500          |
| Juan Pérez       | 9876 | $1200         |

> Se pueden usar estos datos para realizar depósitos, retiros o transferencias durante la prueba.

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
   - El proyecto creará automáticamente las tablas necesarias si no existen.

3. **Ejemplo de SQL para crear las tablas en Derby**
```sql
CREATE TABLE Usuarios (
    id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    pin VARCHAR(10) NOT NULL
);

CREATE TABLE Cuentas (
    id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    numeroCuenta VARCHAR(20) NOT NULL,
    saldo DOUBLE NOT NULL,
    usuario_id INT NOT NULL,
    FOREIGN KEY (usuario_id) REFERENCES Usuarios(id)
);

CREATE TABLE Operaciones (
    id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    tipoOperacion VARCHAR(20) NOT NULL,
    monto DOUBLE NOT NULL,
    cuentaOrigen VARCHAR(20),
    cuentaDestino VARCHAR(20),
    fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP
> Todas las operaciones se registran tanto en memoria como en la base de datos Derby.

## Capturas de pantalla
Ejemplo:  
![Menú principal](docs/capturas/menu-principal.png)  
![Transferencia exitosa](docs/capturas/transferencia-exitosa.png)  

## Video de presentación
[Ver video de demostración](https://youtu.be/drZs_aAIR9I)
https://youtu.be/drZs_aAIR9I?si=e7ALV4xybngUJKRO

## Autor
Randall Quintero Orozco – Curso Programación Cliente/Servidor
);

