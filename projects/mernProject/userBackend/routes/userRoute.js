const express = require("express");
const router = express.Router();
const model = require("../model/userModel");
// http://localhost:5000/test
router.post("/test", (req, res) => {
  res.send("API is  fine");
});
// http://localhost:5000/save -- register operation
router.post("/save", (req, res) => {
  const userData = new model(req.body);
  userData
    .save()
    .then((data) => {
      res.status(200).json({ data: data, msg: "data saved successfully" });
    })
    .catch((error) => {
      res.status(400).json({ MSG: error.message });
    });
});

//  http://localhost:5000/fetchAll -- get all users
router.get("/fetchAll", (req, res) => {
  model
    .find()
    .then((data) => {
      res.status(200).json({ data: data, msg: "data found successfully" });
    })
    .catch((error) => {
      res.status(400).json({ MSG: error.message });
    });
});

// http://localhost:5000/fetchById/:id -- get user by id
router.get("/fetchById/:id", (req, res) => {
  model
    .findById(req.params.id)
    .then((data) => {
      res.status(200).json({ data: data, msg: "data found successfully" });
    })
    .catch((error) => {
      res.status(400).json({ MSG: error.message });
    });
});

// http://localhost:5000/delete/:id -- delete user by id
router.delete("/delete/:id", (req, res) => {
  model
    .findByIdAndDelete(req.params.id)
    .then((data) => {
      if (data) {
        res.status(200).json({ data: data, msg: "data deleted successfully" });
      } else {
        res.status(400).json({ msg: "data not found" });
      }
    })
    .catch((error) => {
      res.status(400).json({ MSG: error.message });
    });
});

//  http://localhost:5000/update/:id - update user by id
router.put("/update/:id", (req, res) => {
  model
    .findByIdAndUpdate(req.params.id, req.body, { new: true })
    .then((data) => {
      if (data) {
        res.status(200).json({ data: data, msg: "data updated successfully" });
      } else {
        res.status(400).json({ msg: "data not found" });
      }
    })
    .catch((error) => {
      res.status(400).json({ MSG: error.message });
    });
});

module.exports = router;
