const http=require('http');

server=http.createServer((req,res)=>{
    res.statusCode=200;
    res.setHeader('Content-Type','text/html');
    res.end("Hello world")
})

server.listen(4000,()=>{
    console.log('Server running at http://127.0.0.1:4000/')
}
);
