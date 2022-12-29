
const axios =  require("axios");
const { response } = require("express");



const  loginPage = (request,response)=>{

            console.log("login page")

            response.render("login");  // login.ejs

}



const loginUser = async (request,response)=>{

    let url = "http://localhost:3000/users";

        let uname = request.body.username;
        let pwd = request.body.password;

      

        console.log(uname +"  "+pwd)


           let flag = 0;


   await  axios.get(url)
      .then( (user)=>{

          
            for(let i=0; i < user.data.length; i++){

                    
                    if(  user.data[i].username ==  uname && user.data[i].password == pwd)
                    {


                            console.log("login success  welcome "+uname)
                            
                            response.render("success")

                         break;
                    }

                        else{

                            console.log("login failed")
                            
                            response.render("error")



                        }
              }



      });

       

     



    //   axios.get(url)
    //   .then( (userData)=>{

    //         userData.data.forEach((user)=>{ 

    //                     console.log(user)

    //         })

    //     });
    
        
            


}

module.exports = {loginUser, loginPage}