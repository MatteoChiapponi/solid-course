DIP(dependency inversion principle)

este principio habla de que las clases no puede depender de instancias concrcetas sino que deben depender de abstracciones


este ejercicio fue realizado en la clase Factura en el ejercicio del princio de responsabilidad unica creando las abstracciones responsables de calcular el descuento (ICalculateDiscount) y la responsable de calcular el iva (ICalculateIva) de esta manera la clase Factura no depende de una implementacion concreta sino que depende del contrato de cada una de las interfaces que necesita para calcular el total de la factura