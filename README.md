# 🏦 Sistema Bancario

## 📌 Descripción del proyecto

Este proyecto consiste en el desarrollo y modelado de un **Sistema Bancario**, realizado con el objetivo de aplicar y poner en práctica los principales conceptos de la **Programación Orientada a Objetos (POO)**.

El sistema permite representar la relación entre **clientes y cuentas bancarias**, contemplando diferentes tipos de clientes y cuentas, cada uno con sus propias características y operaciones.

El proyecto fue desarrollado como parte del aprendizaje y aplicación práctica de los conceptos de **herencia, clases abstractas, encapsulamiento, constructores, atributos, métodos y relaciones entre clases**.

---

## 👥 Clientes

El sistema contempla dos tipos de clientes:

### 👤 Cliente Individual

Representa a una persona física y cuenta con:

- Número de cliente.
- Nombre.
- Apellido.
- DNI.

### 🏢 Cliente Empresa

Representa a una empresa y cuenta con:

- Número de cliente.
- Nombre de fantasía.
- CUIT.

---

## 💳 Tipos de cuentas

El sistema contempla tres tipos de cuentas bancarias, cada una con características y operaciones específicas.

### 💰 Caja de Ahorro

La caja de ahorro posee una **tasa de interés** y permite realizar las siguientes operaciones:

- Depositar efectivo.
- Extraer efectivo sin superar el saldo disponible.
- Cobrar los intereses correspondientes.

### 🏦 Cuenta Corriente

La cuenta corriente posee un **monto autorizado para girar en descubierto** y permite:

- Depositar efectivo.
- Depositar cheques.
- Extraer efectivo utilizando el saldo disponible y, cuando corresponde, el giro en descubierto.

Los cheques contienen:

- Monto.
- Banco emisor.
- Fecha de pago.

### 💵 Cuenta Convertibilidad

La cuenta convertibilidad es un nuevo tipo de cuenta destinado a los **clientes empresa**.

Esta cuenta permite realizar las operaciones propias de una cuenta corriente y, además, trabajar con dos monedas:

- Pesos.
- Dólares.

Entre sus operaciones se encuentran:

- Depositar dólares.
- Extraer dólares.
- Convertir pesos a dólares.
- Convertir dólares a pesos.

Las operaciones con dólares **no permiten utilizar el giro en descubierto**.

Para las conversiones entre monedas, la **tasa de conversión se recibe como parámetro**.

---

## 🧩 Conceptos de Programación Orientada a Objetos

Durante el desarrollo del proyecto se aplicaron diferentes conceptos fundamentales de POO, entre ellos:

- **Herencia:** permite reutilizar características y comportamientos entre las diferentes clases de cuentas y clientes.
- **Clases abstractas:** utilizadas para representar conceptos generales que sirven como base para otras clases.
- **Encapsulamiento:** mediante atributos y métodos de acceso para proteger y controlar los datos de los objetos.
- **Constructores:** utilizados para inicializar los objetos con los datos necesarios.
- **Métodos:** utilizados para representar las diferentes operaciones que pueden realizar los clientes y las cuentas.
- **Relaciones entre clases:** utilizadas para representar la asociación entre clientes y cuentas.

---

## 📁 Organización del proyecto

Para mantener una estructura ordenada y facilitar la comprensión del código, el proyecto se encuentra organizado mediante **paquetes**.

La estructura contempla principalmente:

bancario
│
├── clientes
│   ├── Cliente
│   ├── ClienteIndividual
│   └── ClienteEmpresa
│
├── cuentas
│   ├── Cuenta
│   ├── CajaAhorro
│   ├── CuentaCorriente
│   ├── CuentaConvertibilidad
│   └── Cheque
│
├── testClientes
│   └── Clases de prueba de clientes
│
└── testCuentas
    └── Clases de prueba de cuentas

Esta organización permite separar las responsabilidades de cada grupo de clases y mantener el proyecto más claro y fácil de mantener.

---

## 🛠️ Tecnologías y herramientas

El proyecto fue desarrollado utilizando:

- ☕ **Java 25 LTS**
- 💻 **Visual Studio Code**
- 📦 **Lombok**
- 📐 **UML / draw.io** para el modelado del sistema.
- 🔧 **Git y GitHub** para el control y almacenamiento del proyecto.

---

## 🎯 Objetivo

El objetivo principal de este proyecto es aplicar de manera práctica los fundamentos de la **Programación Orientada a Objetos**, desarrollando un modelo que represente diferentes situaciones de un sistema bancario y permitiendo observar cómo se relacionan las distintas clases entre sí.

---

## 👩‍💻 Autor

**Eleonora Diaz**

Proyecto académico — Sistema Bancario
