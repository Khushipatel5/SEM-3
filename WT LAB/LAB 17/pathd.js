const path =require('path');

console.log(path.normalize('/abc../xyz.test../khush'))
console.log(path.join('/acb','/bce'));
console.log(path.resolve('/abc','../bcd'))
console.log(path.relative('/abc','../bcd'))
console.log(path.basename('/abc.txt'))
console.log(path.extname('/abc.txt'))
console.log(path.dirname('.../foo/abc.txt'))