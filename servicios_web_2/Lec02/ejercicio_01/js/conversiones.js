(function() {

	let conversionesValorDecimal = 0.0;
	let hasDecimalCero;
	let btnCalcularConversiones = {};
	let btnLimpiarConversiones = {};

	const cleanForm = function(){
    	document.getElementById("formularioConversiones").reset();
    }
	
	const clean = function(){
		// El utilizar el .value es para cuando podria utilizar un arreglo
		// en este caso no parece que sea para esto
		cleanForm();
        document.getElementById("conversionesShortNumber").innerHTML = '';
        document.getElementById("conversionesIntNumber").innerHTML = '';
        document.getElementById("conversionesLongNumber").innerHTML = '';
    	document.getElementById("conversionesFloatNumber").innerHTML = '';
    	document.getElementById("conversionsDoubleNumber").innerHTML = '';
    }

    const calculateNumbers = function() {
    	// Obtener valor a procesar
    	conversionesValorDecimal = document.getElementById("conversionesValorDecimal").value;
    	conversionesValorDecimalStr = conversionesValorDecimal.length
    	evaluateNumber = conversionesValorDecimal;
    	console.log("Valor decimal: " + conversionesValorDecimal);
    	console.log("Evaluar numero: " + conversionesValorDecimal);

    	// Rule: no debe tener ceros en sus decimales.
    	hasDecimalCero = verifyDecimals(conversionesValorDecimal);

    	// Rule: ver si es decimal o no
    	if(evaluateNumber == Math.floor(evaluateNumber)){
    		alert(evaluateNumber + " valor es entero y debe ser decimal.")
    		clean();
    	}if(hasDecimalCero){
    		alert("Valor no debe contener valores decimales en cero.");
    		clean();
    	}if(conversionesValorDecimalStr < 4){
    		alert("Valor no tiene 4 caracteres");
    	}else{
    		processCalcularNumbers(conversionesValorDecimal);
    	}
    }

    const processCalcularNumbers = function(conversionesValorDecimal,evaluateNumber) {
    	document.getElementById("conversionesShortNumber").innerHTML = parseInt(conversionesValorDecimal);
    	document.getElementById("conversionesIntNumber").innerHTML = parseInt(conversionesValorDecimal);
    	document.getElementById("conversionesLongNumber").innerHTML = parseInt(conversionesValorDecimal);
    	document.getElementById("conversionesFloatNumber").innerHTML = conversionesValorDecimal;
    	document.getElementById("conversionsDoubleNumber").innerHTML = conversionesValorDecimal;
    }

    const verifyDecimals = function(conversionesValorDecimal) {
    	// Funcion para verificar si posee o no decimales
    	let result;
    	let stringValue = conversionesValorDecimal.toString();

    	result = stringValue.indexOf("0") > 0 ? true : false;

		return result;
    }

    // Limpiar formulario completo
	window.addEventListener('load', function(){
		clean();
	});

    const initializer = function(){
		// Obtener valores
		btnCalcularConversiones = document.getElementById('btnCalcularConversiones');
		btnLimpiarConversiones = document.getElementById('btnLimpiarConversiones');

		// Botones de acciones
		btnCalcularConversiones.onclick = calculateNumbers;
		btnLimpiarConversiones.onclick = clean;

	}

    initializer();

})()