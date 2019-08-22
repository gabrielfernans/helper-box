const express = require('express');
const app = express();

app.use(express.json()); 
/*
 HTTP Verbs
 - GET: Receive datas through a Resource
 - POST: Send datas or informations to be processed by a Resource
 - PUT: Update Resource datas
 - DELETE: Delete a resource
*/

app.get("/clients", function(req, res) {
    
});

app.post("/clients", function(req, res) {
    
});

app.put("/clients", function(req, res) {
    
});

app.delete("/clients", function(req, res) {
    
});

app.listen(3000, function() {
    console.log("Server is running.");
}); 