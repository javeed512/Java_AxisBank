



const express = require("express");
 
//connecting the controller with route
const EmployeeController = require("../Controller/EmployeeController");
 
//creatung the router
const router = express.Router();
 
//for getting all the product
//router.get("/" , EmployeeController.getAllEmployees);


// router.get("/",(request,response)=>{

//             EmployeeController.getAllEmployees(request,response);

// });





module.exports = router;