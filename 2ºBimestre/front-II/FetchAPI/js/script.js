//criar usuário
function fetchAPI() { 
    fetch('https://ctd-todo-api.herokuapp.com/v1/users', { 
        method: 'POST', 
        headers: { 'Accept': '*/* , application/json, text/plain',
         'Content-Type': 'application/json' 
        }, 
        body: JSON.stringify({
             "firstName": "jotinhodfdf9",
              "lastName": "jotdfdfinho",
               "email": "jchaves@dfdfddigitalhouse.com",
                "password": "jotsdsda-3"
             }) 
            }) 
            .then(res => res.json()) 
            .then(res => console.log(res)) 
        } 