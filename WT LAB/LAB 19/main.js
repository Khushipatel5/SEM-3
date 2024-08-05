const express=require('express');
const app=express();

app.get('/',(req,res)=>{
    res.send('hellooo')
})

app.get('/home',(req,res)=>{
    res.send('home page')
})
app.get('/about',(req,res)=>{
    res.send('about page ')
})
app.get('/contact',(req,res)=>{
    res.send('Contact us on ')
})
app.get('/sevices',(req,res)=>{
    res.send('services uplabhdh nahi hai!!!')
})
app.listen(3005,()=>{
    console.log('app.js listening to http://localhost:3005/')
})