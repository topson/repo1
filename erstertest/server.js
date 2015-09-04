var sql = require('sql');

sql.setDialect('postgres');

var name = sql.define({
	name: 'name',
	columns: ['idx', 'name', 'bday']
});

var adr = sql.define({
	name: 'adr',
	columns: ['idx', 'email', 'street']
});

var query = name.select(name.star()).from(name).toQuery();
console.log(query.txt);


