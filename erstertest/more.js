var i =	2* Math.random();

if (i>1){
	console.log('Kopf');
}
else {
	console.log('Zahl');
}
var j = function(){
	var rdm=3*Math.random();
	if (rdm<=1){
		console.log('Stein');
	}
	else if (rdm>1 && rdm<=2){
		console.log('Schere');
	}
	else {
		console.log('Papier');
	}
}
j();

	
