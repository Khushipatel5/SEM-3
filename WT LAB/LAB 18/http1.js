const http=require('http');
const fs=require('fs');
http.createServer((req,res)=>{
    const filePath=path.join(process.cwd(),'');
    fs.readFile('new.txt',(err,data)=>{
        if(err){
            res.statusCode=500;
            res.setHeader('Content-Type','text/plain');
            res.end('Error loading');
            console.log(err);
            return;
        }
        res.statusCode=200;
        res.setHeader('Content-Type','text/plain');
        res.end(data);

        
    });
    server.listen(3080,()=>{
        console.log('Server running at http://127.0.0.1:3080/')
    });
})