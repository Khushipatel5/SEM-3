const express=require('express');
const bodyParser=require('body-parser');
const app=express();
app.use(bodyParser.urlencoded());

const students = [
    {
      "name": "Martha Ratke",
      "age": 81370,
      "email": "Curtis80@hotmail.com",
      "id": "1"
    },
    {
      "name": "Alan Cronin",
      "age": 21791,
      "email": "Rose_Kunde82@yahoo.com",
      "id": "2"
    },
    {
      "name": "Jesse Davis",
      "age": 50627,
      "email": "Francisco.Von@gmail.com",
      "id": "3"
    },
    {
      "name": "Javier Kunde II",
      "age": 93609,
      "email": "Charley_Kub@gmail.com",
      "id": "4"
    },
    {
      "name": "Noel Jones",
      "age": 3487,
      "email": "Keven_Wehner@gmail.com",
      "id": "5"
    },
    {
      "name": "Winifred Von",
      "age": 27471,
      "email": "Elizabeth_McGlynn19@hotmail.com",
      "id": "6"
    },
    {
      "name": "Bessie Crona",
      "age": 85620,
      "email": "Anissa.Huel@yahoo.com",
      "id": "7"
    },
    {
      "name": "Arlene Corwin",
      "age": 41241,
      "email": "Raphael_Krajcik68@gmail.com",
      "id": "8"
    },
    {
      "name": "Ronnie Gerlach",
      "age": 70975,
      "email": "Brody_Volkman68@yahoo.com",
      "id": "9"
    },
    {
      "name": "Rosemarie Ondricka II",
      "age": 70175,
      "email": "Catherine_Cummings@gmail.com",
      "id": "10"
    }
  ]

//get all
app.get('/students',(req,res)=>{
    res.send(students);
})
//get by id
app.get('students/:id',(req,res)=>{
    const ans=students.find(stu=>stu.id=req.params.id);
    res.send(ans);
})
//add
app.post('/students',(req,res)=>{
    students.push(req.body);
    res.send("student add");
})
// //edit
app.patch('/students/:id',(req,res)=>{
    const ans=students.findIndex((stu)=>{
      if(stu.id==req.params.id){
        return true;
      }
      student[ans]=req.body;
      res.send("updated")
    })}  
)
//delete
app.delete('/students/:id',(req,res)=>{
    const ans=students.findIndex((stu)=>{
        stu.id=req.params.id
        students.splice(ans,1);
        res.send('deleted');
    })
})
//search
app.search('/students/search/:text',(req,res)=>{
    const ans=students.filter((stu=>{
        if(stu.className.indexOf(req.params.text)-1)
            return true;
    }))
})

app.listen(3005,(req,res)=>{
    console.log('app.js listening to http://localhost:3005/')

})