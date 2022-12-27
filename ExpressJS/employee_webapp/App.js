




const express = require('express')

const app = express()


app.listen(8181 , (request,response)=>{ 

        console.log("App started with port 8181");



  })

app.set("view engine","ejs");


const  fetch = require('node-fetch');

  app.get("/get",(request,response)=>{

    let settings = { method: "Get" };
    fetch("http://localhost:8080/api/v1/employees/get", settings)
    .then(response => response.json())
    .then((json) => {
        // do something with JSON
        console.log(json)
        response.render("display-employees",{json:json})
    });


  })