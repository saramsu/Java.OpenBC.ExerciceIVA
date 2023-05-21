package org.example;

import java.text.DecimalFormat;
import  java.text.ParseException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.print("Ingresa el precio sin IVA: ");
            double precio = leerPrecio(scanner);
            double precioConIva = calcularPrecioConIva(precio);
            System.out.println("El precio con IVA incluído es: " + precioConIva);
            System.out.println("¿Quieres calcular otro precio (s/n): ?");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
          }
        }

        public static  double leerPrecio(Scanner scanner) {
            DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
            double precio = 0;
            boolean precioValido = false;
            while (!precioValido) {
                try {
                    String precioString = scanner.next();
                    Number numero = decimalFormat.parse(precioString);
                    precio = numero.doubleValue();
                    precioValido = true;
                }   catch (ParseException e) {
                    System.out.println("Precio Inválido. Ingresa un número válido: ");
                }
            }
            return  precio;
        }

        public static double calcularPrecioConIva(double precio) {
        return precio * 1.21;
        }

    }

