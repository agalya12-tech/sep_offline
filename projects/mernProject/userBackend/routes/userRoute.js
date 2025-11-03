const express=require('express');
const router=express.Router();
const model=require('../model/userModel');
// http://localhost:5000/test
router.post('/test', (req, res) => {
    res.send("API is  fine");
})
// http://localhost:5000/save -- register operation
router.post('/save',(req,res)=>{
 const userData=new model(req.body);
 userData.save()
 .then((data)=>{
     res.status(200).json({"data":data,"msg":"data saved successfully"});
 })
 .catch((error)=>{
     res.status(400).json({"MSG":error.message});
 })
})

//  http://localhost:5000/fetchAll -- get all users
router.get('/fetchAll',(req,res)=>{
    model.find()
    .then((data)=>{
        res.status(200).json({"data":data,"msg":"data found successfully"});
    })
    .catch((error)=>{
        res.status(400).json({"MSG":error.message});
    })
})

module.exports=router;