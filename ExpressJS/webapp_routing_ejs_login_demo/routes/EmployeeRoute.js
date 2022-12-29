

const EmployeeController = require("../controller/EmployeeController")

const  express = require("express")

const router =  express.Router();

router.get("/get",EmployeeController.getAllEmployees)



module.exports = router