var mysql = require('mysql');
var connection = mysql.createConnection({
	host: 'localhost',
	user: 'root',
	password: '4lph4!',
});

connection.connect(function(err){
	console.log('Success');
});
