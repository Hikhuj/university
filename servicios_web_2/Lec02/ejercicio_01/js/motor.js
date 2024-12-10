// (function(){

// Source> https://www.linkedin.com/learning/javascript-esencial/eventos-del-mouse?u=89245946

	// funcion anonima de suma
	// Las funciones anonimas no llevan mensaje
	const sumar = function(numero1, numero2){
		var result = numero1 + numero2;
		return result;
	}

	// Receta de un CALLBACK
	// Se usan casi que en funciones Async
	// Ayudan a controlar procesos Async
	/*
		function(value, value, callbackFunctionNameCB){}
		Ejemplo
		function calcular(datoA, datoB, sumarCB, restarCB){
			var suma = datoA + datoB
			var resta = datoA + datoB;

			sumarCB(suma);
			restarCB(restar);
		}

		calcular(2,3,function (resultado)){
			console.log('Suma', resultado)
		},function (resultado) {
			console.log('Resta', resultado)
		})
	*/

	sumar(1,2)

	/*
	const initializer = function(){
		console.log(sumar(document.getElementById(num1),document.getElementById(num2)));
	}
	*/

//	initializer();

// })()