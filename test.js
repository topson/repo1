
var i = function (){

	console.log('134');
	
	console.log('test');
}
i();

var j = [23, 33, 0];

console.log(j[0]);

function Back(text) {
	this.text = text;
	console.log(this.text)
}

var t = new Back("Give this back to me");

Back.prototype.js = function(){
	console.log("Learn more JavaScript");
}
t.js(); 
