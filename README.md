# Laboratorio-7-Ejercicio-2
Una tienda de productos alimenticios requiere un programa para gestionar las ventas de sus 
productos. Todos los productos comparten las siguientes características: código, descripción y 
precio. Sin embargo, existen dos tipos principales de productos: productos perecederos y 
productos no perecederos, cada uno con características adicionales específicas. 
Productos Perecederos: Además de las características básicas, tienen un número de días a 
caducar. Su precio de venta se calcula de la siguiente manera: 
Si le queda 1 día: se reducirá 4 veces el precio. 
Si le quedan 2 días: se reducirá 3 veces el precio. 
Si le quedan 3 días: se reducirá 2 veces el precio 
Productos No Perecederos: Además de las características básicas, se clasifican según su 
tipo: A (Súper Alta Calidad), B (Alta Calidad) y C (Media Calidad). Al crear un nuevo producto 
no perecedero, el programa debe validar el tipo ingresado. Si el tipo no es A, B o C, se asignará 
automáticamente el tipo B. Esta validación se realiza internamente al crear el producto y no es 
directamente accesible. Su precio de venta se calcula de la siguiente manera: 
Tipo A: El precio aumenta en un 3% . 
Tipo B: El precio aumenta en 2%. 
Tipo C: El precio aumenta en 1.5% 
Artefactos a entregar  
 1  Modelo de diseño diagrama de clases UML debidamente documentado. 
 2  Proyecto donde se implemente el modelo de diseño diagrama de clases UML. 
 3  Dentro del proyecto implemente la clase Empresa con un método main() para probar el 
modelo de diseño. 
 4  En el método main() implemente 
                         PROGRAMA CIENCIAS DE LA COMPUTACIÓN E INTELIGENCIA 
ARTIFICIAL 
                                        ASIGNATURA FUNDAMENTOS DE DISEÑO DE SOFTWARE 
                        Laboratorio # 7 Relaciones entre clase herencia, clase abstractas, polimorfismo   
 
 5  Declare un arreglo dinámico de la clase Producto. Adicione tres instancias (objetos) de la 
clase Perecedero y 3 instancias (objetos) de la clase No Perecedero. 
 6  Muestre en la consola los datos de los productos en el siguiente formato: 
 “Perecedero, código, descripción, precio, días a caducar”  
 “No Perecedero, código, descripción, precio, tipo” 
 7  Muestre en la consola los datos de los productos incluyendo el valor a pagar en el 
siguiente formato: 
 “Perecedero, código, descripción, precio, días a caducar, precio de venta”  
 “No Perecedero, código, descripción, precio, tipo, precio de venta”
