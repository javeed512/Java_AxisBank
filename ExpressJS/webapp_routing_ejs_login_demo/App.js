
const express = require('express')

const app = express()

const EmployeeRoute = require("./routes/EmployeeRoute")


app.listen(8181 , (request,response)=>{ 

        console.log("App started with port 8181");



  })

  app.use(express.urlencoded({extended:true}))

app.set("view engine","ejs");


app.get("/",(request,response)=>{


        response.redirect("/employee");


})

app.use("/employee" , EmployeeRoute)