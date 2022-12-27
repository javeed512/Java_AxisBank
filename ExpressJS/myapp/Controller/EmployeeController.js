

//import module into controller
//const ProductModel = require("../Model/Products");
 
//for getting the all employees 
// const getAllEmployees = (request , response) => {
//     ProductModel.find()
//     .then((result) => {
//         response.render("home" , {title : "Home" , AllProducts : result});
//     })
//     .catch((err)=> {
//         console.log(err);
//     })
// };


const getAllEmployees = (request , response )=>{

    console.log('controller executed..')

    fetch('http://localhost:3000/employees')           //api for the get request
    .then(response => response.json())
    .then(data => console.log(data));


}

module.exports = getAllEmployees