function Multi (num1, num2){
	this.num1 = num1;
	this.num2 = num2;
	this.calc = function (){
		console.log(Math.round(this.num1*this.num2));
	}
}
var x = Math.random();
var rndm = new Multi(x, 100);
var precent = rndm.calc();
var die = [1, 2, 3, 4, 5, 6];
var dice = [[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 5, 6]];

var roll = function(idx){
	return (dice[idx][Math.floor(Math.random()*6)]);
}

var result = function(){
	console.log(roll(0)+roll(1));
}
result();
