const express=require('express');
const app=express();
app.get('/',(req,res)=>{
    res.send('Hello World!');
});
app.listen(3005,()=>{
    console.log('app.js listening to http://localhost:3005/')
})