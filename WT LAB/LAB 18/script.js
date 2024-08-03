const http=require('http');
const fs=require('fs');

 const server=http.createServer((req,res)=>{
    res.write("<a href='home' > home</a>");
    res.write("<a href='about' > about</a>");
    res.write("<a href='contact'> contact</a>");

    if(req.url=="/home"){
        fs.readFile("home.html",(err,data)=>{
            res.end(data);
        })
    }
    else if(req.url=="/contact"){
        fs.readFile("contact.html",(err,data)=>{
            res.end(data);
        })
    }
    else if(req.url=="/about"){
        fs.readFile("about.html",(err,data)=>{
            res.end(data);
        })
    }
    else{
        res.write("<a href='about' > about</a>");
        res.write(" ");
        res.write("<a href='contact' > contact</a>");
        res.write(" ");
        fs.readFile('home.html', (err, data)=>{
            res.end(data); 
        })
    }
 })
 const port = 3080;

 server.listen(3080,()=>{
    console.log('Server running at http://127.0.0.1:3080/')
});