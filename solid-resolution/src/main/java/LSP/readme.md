LSP (Liskov substitution principle)

“An object should be substitutable by its base class (or interface).”

este principio nos dice que la clase de mayor nivel puede ser intercambiable por la clase de mas bajo nivel es decir la clase de mas alto nivel no puede heredar propiedades o implementar metodos que no necesite


2- si, cumple el principio Open Close ya que las clases que implementan las interfaces estan cerradas a cambios a menos que cambien la forma de guardar o cargar sus propias configuraciones pero las configuraciones estan abiertas a nuevas implementaciones 

5- el problema es que si tenemos una sola interfaz para ambos metodos en el caso que agreguemos una nueva configuracion que por algun motivo no persista o cargue su contenido rompe el principio de liskov ya que no puede ser sustituido por su clase padre en este caso interfaz y esto trae complicaciones a la hora querer manipular todas las configuraciones como un conjunto ya que hay una de ellas que no cumple el contrato. La solucion es sencilla, basicamente armar 2 contratos diferentes uno para guardar y otro para cargar que puede implementado por cada clase en base a sus necesidades. 