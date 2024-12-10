(function() {

	// Var list
	let tipoCliente;
	let subtotal;
	let porcentajeDescuento;
	let montoDescuento;
	let total;
	let montoAAplicarDescuento = 0;

	function toPercentage(value) {
		return value / 100;
	}

    // Limpiar datos
    const cleanForm = () => {
    	document.getElementById('formularioDoWhile').reset();
    }

    const checkIfNumber = (tipoCliente, subtotal, porcentajeDescuento, montoDescuento, total) => {
    	let canProcess = true;

    	if(tipoCliente === 'none'){
    		alert("El tipo de cliente no ha sido seleccionado.");
    		canProcess = false;
    	}

    	if(typeof Number(subtotal) != 'number'){
    		alert("El subtotal: " + subtotal + " no es un numero.");
    		canProcess = false;
    	}

    	return canProcess;
    }

    const publishData = function(idTagToPublish, publishValue){
		document.getElementById(idTagToPublish).value = publishValue;
	}

    const calculate = () => {
    	tipoCliente = document.getElementById('doWhileTipoDeCliente').value;
    	subtotal = document.getElementById('doWhileSubTotal').value;
    	porcentajeDescuento = document.getElementById('doWhilePorcentajeDescuento').value;
    	montoDescuento = document.getElementById('doWhileMontoDescuento').value;
    	total = document.getElementById('doWhileTotal').value;
    	montoAAplicarDescuento = 0;

    	let canProcessCalculation = checkIfNumber(tipoCliente, subtotal, porcentajeDescuento, montoDescuento, total);

    	if(canProcessCalculation){
    		document.getElementById('doWhilePorcentajeDescuento').value = tipoCliente;
    		montoAAplicarDescuento = document.getElementById('doWhileMontoDescuento').value = (subtotal/100)*tipoCliente;
    		document.getElementById('doWhileTotal').value = subtotal - montoAAplicarDescuento;
    	}else{
    		alert("No se puede ejecutar calculo debido a datos erroneos, por favor arreglelos");
    	}

    }

    // Limpiar formulario completo
	window.addEventListener('load', function(){
		cleanForm();
	});

	const initializer = function(){
		// Obtener valores
		btnCalcular = document.getElementById('btnCalcularDoWhile');
		btnLimpiar = document.getElementById('btnLimpiarDoWhile');

		// Botones de acciones
		btnCalcular.onclick = calculate;
		btnLimpiar.onclick = cleanForm;

	}

    initializer();

})()