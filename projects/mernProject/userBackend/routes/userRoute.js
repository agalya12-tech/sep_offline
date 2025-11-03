const express=require('express');
const router=express.Router();

// http://localhost:5000/test
router.post('/test', (req, res) => {
    res.send("API is  fine");
})
module.exports=router;