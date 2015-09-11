var mysql = require('mysql');
var connection = mysql.createConnection({
	host: 'localhost',
	user: 'root',
	password: '4lph4!',
});

var onQueryDone = function(err, result) {
	if( err ) {
		console.log(err);
	}
	else {
		console.log(result);
	}

	process.exit(0);
};

var onDBSelected = function(err) {
	if( err ) {
		console.log(err);
	}
	else {
		var insert = {nmbr: 3, name: 'test', bday: 19990505};
		var query = connection.query('insert into newtable set ?', insert, onQueryDone);
	}
};

connection.connect(function(err){
	console.log('Connected');
	var db = connection.query ('use newdb', function(err){
		console.log('Database connection');
		onDBSelected(err);
	});
});





