$(function(){

	var yearSeleccionado = {};
	var owner = {};
	var cardNumber = {};
	var cardNumberField = {};
	var cvv = {};
	var mastercard = {};
	var visa = {};
	var amex = {};
	var confirmarButton = {};

	const ini = () => {
		yearSeleccionado = $('#yearSeleccionado');
		cardNumberField = $('#card-number-field');
		owner = $('#owner');
		cardNumber = $('#cardNumber');
		CVV = $('#cvv');
		mastercard = $('#mastercard');
		visa = $('#visa');
		amex = $('#amex');
		confirmarButton = $('#confirm-purchase');
		cargarAnios();
		bind();
		cardNumber.payform('formatCardNumber');
		CVV.payform('formatCardCVC');
	}

	const bind = () => {
		cardNumber.keyup = validarNumero;
		confirmarButton.on('click',accionValidar);
	}

	const validarNumero = () => {
		amex.removeClass('transparent');
		visa.removeClass('transparent');
		mastercard.removeClass('transparent');

		if(!$.payform.validateCardNumber(cardNumber.val())){
			cardNumberField.addClass('has-error');
		}else{
			cardNumberField.removeClass('has-error');
			cardNumberField.addClass('has-success');
		}

		if($.payform.parseCardType(cardNumber.val()) === 'visa'){
			mastercard.addclass('transparent');
			amex.addclass('transparent');
		}else if($.payform.parseCardType(cardNumber.val()) === 'amex'){
			mastercard.addclass('transparent');
			visa.addclass('transparent');
		}else if($.payform.parseCardType(cardNumber.val()) === 'mastercard'){
			amex.addclass('transparent');
			visa.addclass('transparent');
		}
	}

	const accionValidar = (e) => {
		e.preventDefault();
		console.log('Click');
		let isCardValid = $.payform.validateCardNumber(cardNumber.val());
		let isCvvCard = $.payform.validateCardCVC(CVV.val());

		if(owner.val().length < 5){
			alert("Nombre del dueño incorrecto");
		}else if(!isCardValid){
			alert("Numero de tarjeta malo");
		}else if(!isCvvCard){
			alert("CVV incorrecto");
		}else{
			alert("Todo bien!");
		}
	}

	const cargarAnios = () => {
		let anio = new Date().getFullYear();
		for (var index = 0; index < 10; index++) {
			let value = anio + index;
			yearSeleccionado.append(new Option(value, value.toString().substr(-2)));
		}
	}

	ini();
});