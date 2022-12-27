


const fetch = require('node-fetch')

const express = require('express')

const app = express()


app.set("view engine", "ejs");

app.listen(8181 , (request,response)=>{ 

        console.log("App started with port 8181");



  })

  const  EmployeesRoute = require('./routes/EmployeesRoute');

  app.get("/get",(request,response)=>{  response.render("welcome")  })

  //app.get("/get/employees", (request,response)=>{ response.render("display-employees")})
  
  //app.get("/get/employees", (request,response)=>{ response.redirect("/Employees")})



  app.get("/get/employees",(req,res)=>{
    let settings = { method: "Get" };
    fetch("http://localhost:3000/employees", settings)
    .then(res => res.json())
    .then((json) => {
        // do something with JSON
        console.log(json)
        res.render("display-employees",{json:json})
    });
  })



  // for route

  //app.use("/Employees",EmployeesRoute);