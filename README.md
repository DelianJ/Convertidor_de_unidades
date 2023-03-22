# Convertidor_de_unidades
<h2>Descripción</h2>
Proyecto desarroyado para el Challenge ONE Back End - Java Sprint 01: Crea tu propio conversor de moneda del programa ONE-Oracle Next Education el cual consiste en un convertidor de las principales monedas usadas a nivel internacional colo lo son el Dolar Estadounudence, la Libra Esterlina, el Yen Japonés, entre otros. A parte del conversor de moneda este proyecto tambien cuenta con un conversor de unidades de distancia por ejemplo: Centimetros, Metros, Kilometros, Pulgadas, etc. De igual manera un convertidor de temperatura (Centigrados, Fahrenheit, Kelvin).
<h2>Funcionamiento</h2>
![Convertidor de Moneda](https://user-images.githubusercontent.com/114271050/227046628-22487c48-518a-497a-a629-814fa665386a.png)
![Convertidor de Longuitud](https://user-images.githubusercontent.com/114271050/227046629-94ee41bb-50d6-4ece-ada8-ce97d760e1f4.png)
![Convertidor de temperatura](https://user-images.githubusercontent.com/114271050/227046630-45c97c15-e263-47a3-8bf6-8073b358b753.png)</br>
Cada convertidor cuenta con el mismo diseño en el cual se encuestran dos listas donde el usario puede seleccionar la unidad de origen y la unidad de destino, cada lista cuenta con los mismos elementos para que el usuario pueda desidir el tipo de conversion que desee ya sea de dolares a pesos, dolares a libras, centimetros a metros, pulgadas a centimetros, etc. También cunta con un cuadro de texto en donde el usuario puede ingresar el valor que quiera convertir, en este cuadro de texto solo se perite los números, si el usuario intenta ingresar un texto al momento de intentar realizar la conversion el programa lanzara una advertencia al usuario indicandole que solo se permiten números.</br>
Para poder realizar la conversion de las monedas use valores estaticos los cuales se encuentran en el archivo "Conversion.java", para el valor de las monedas defini una moneda cullo valor siempre sera 1 en este caso el dolar estadounidence despues despues determine el valor de 1 dolar en cada una de las monedas (1USD -> 18.38MXN), tambien obtube el valor de cada moneda en dolares (1MXN -> 0.0544USD) y aplique la siguiente formula:</br>
<p>C = V * Mo * Md</p>
C -> Resultado de la conversion.</br>
V -> Valor que se desea convertir.</br>
Mo -> El valor de la moneda de origen en Dolares.</br>
Md -> El valor del dolar en la moneda de destino.</br>
Ejemplo: 50 pesos mexicanos a pesos colombianos (1MXN -> 0.0544USD y 1USD -> 4754.5COP)</br>
C = 50 * 0.0544 * 4754.5</br>
C = 12932.24 pesos colombianos.
