const express=require('express');
const fs=require('fs');
const app=express();

app.get('/',(req,res)=>{
    res.send('hellooo')
})
app.get('/home',(req,res)=>{
    res.sendFile('C:/Users/khush/OneDrive/Documents/WT LAB/LAB 19/home.txt',(err,data)=>{})
              
        })
app.get('/contact',(req,res)=>{
   res.sendFile('C:/Users/khush/OneDrive/Documents/WT LAB/LAB 19/contact.txt',(err,data)=>{})
             
        })

app.get('/about',(req,res)=>{
    res.sendFile('C:/Users/khush/OneDrive/Documents/WT LAB/LAB 19/about.txt',(err,data)=>{})
                      
        })
app.listen(3015,()=>{
    console.log('app.js listening to http://localhost:3015/')
})