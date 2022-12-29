


const axios =  require("axios")




 const  getAllEmployees =  (request,response)=>{



    axios.get("http://localhost:8080/api/v1/employees/get")
    .then((json) => {
        // do something with JSON
        console.log(json.request._header)
        response.render("display-employees",{json:json.data})
    });



  }

  module.exports = {getAllEmployees};