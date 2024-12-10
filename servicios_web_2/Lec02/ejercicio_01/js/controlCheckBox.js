(function() {

	let globalArray = [];
	let arraySize = 0;
	let randomLimit = 0;
	let removerPares;
	let removerMenos10;
	let removerMas50;

	const createArray = function(arraySize, randomLimit) {
		let arrayTemp = [];

		// Verificar si el arreglo ya existe
		if(globalArray != undefined || globalArray.length > 0){
			globalArray = [];
			alert("Creando un nuevo arreglo.");
			console.log("Creando arreglo nuevo si no existe.");
		}

		for (var i = 0; i <= arraySize; i++) {
			globalArray.push(Math.floor((Math.random() * randomLimit) + 1));
		}
	}

	const printArray = function(array) {
		for (var i = globalArray.length; i <= globalArray; i++) {
			console.log("Array element: " + globalArray[i]);
		}
	}

	const publishArray = function(){
		if(globalArray.length == 0){
			document.getElementById('controlCheckBoxResultado').value = "El arreglo quedó vacío después de aplicarse las reglas"
		}else{
			document.getElementById('controlCheckBoxResultado').value = globalArray;
		}
	}

	const showArray = function(array) {
		for (var i = 0; i <= array.length; i++) {
			document.write("<tr><td>Number " + i + " is:</td>");
			document.write("<td>" + myArray[i] + "</td></tr>");
		};
	}
	
	// Limpiamos todo lo que se necesita limpiar
	const cleanData = function(){
		// El utilizar el .value es para cuando podria utilizar un arreglo
		// en este caso no parece que sea para esto

		// Limpiar formulario
		document.getElementById("formularioControlCheckBox").reset();

		// Limpiar checks
		document.getElementById('formRemoverNumerosPares').checked = false;
    	document.getElementById('formRemoverNumerosMenores10').checked = false;
    	document.getElementById('formRemoverNumerosMayores50').checked = false;

    	// Limpiar caja de texto donde aparece el array
        document.getElementById('controlCheckBoxResultado').innerHTML = '';
        globalArray = [];

        // Message
        console.log("Botones, checks y fields restaurados. Arreglo limpiado");
    }

    // Funcion para filtrar arreglo de numeros
    const cleanerRemoverPares = (number) => {
    	if(number%2 != 0){
    		return number;
    	}
    }

    const cleanerRemoverMenos10 = (number) => {
    	if(number > 10){
    		return number;
    	}
    }

    const cleanerRemoverMayores50 = (number) => {
    	if(number < 50){
    		return number;
    	}
    }

    const executeTaskApplyRules = function() {
    	// Inicializar valores
		removerPares = document.getElementById('formRemoverNumerosPares').checked;
    	removerMenos10 = document.getElementById('formRemoverNumerosMenores10').checked;
    	removerMayores50 = document.getElementById('formRemoverNumerosMayores50').checked;

		if(removerPares && (globalArray.length > 0)){
			globalArray = globalArray.filter(cleanerRemoverPares);
			publishArray();
		}

		if(removerMenos10 && (globalArray.length > 0)){
			globalArray = globalArray.filter(cleanerRemoverMenos10);
			publishArray();
		}

		if(removerMayores50 && (globalArray.length > 0)){
			globalArray = globalArray.filter(cleanerRemoverMayores50);
			publishArray();
		}

    }

    const executeTaskArrayCreator = function() {
    	arraySize = document.getElementById('controlCheckBoxTamanioDelArreglo').value;
		randomLimit = document.getElementById('controlCheckBoxLimiteDelArreglo').value;

		if(arraySize <= 0){
			alert("No agregó el tamanio del arreglo");
			console.log("No hay dato: tamanio de arreglo");
		}

		if(randomLimit <= 0){
			alert("No agregló el limite del arreglo");
			console.log("No hay dato: limite del random");
		}

		if(arraySize > 0 && randomLimit > 0){
			// Llenar arreglo
			createArray(arraySize, randomLimit);
			alert("Arreglo creado, seleccione los filtros a aplicar");
    		console.log("Arreglo lleno: " + globalArray);
		}else {
			alert("Agregar: tamanio de arreglo y limite de random.");
			console.log("Valores: tamanio arreglo y/o limite random no agregados.");
		}
    }

    // Limpiar formulario completo
	window.addEventListener('load', function(){
		cleanData();
	});

	const initializer = function(){
		btnLlenarArreglo = document.getElementById('btnLlenarArregloControlCheckBox');
		btnVerResultados = document.getElementById('btnVerResultadosControlCheckBox');
		btnLimpiar = document.getElementById('btnLimpiarControlCheckBox');

		// Acciones
		btnLlenarArreglo.onclick = executeTaskArrayCreator;
		btnVerResultados.onclick = executeTaskApplyRules;
		btnLimpiar.onclick = cleanData;
	}

	initializer();

})()