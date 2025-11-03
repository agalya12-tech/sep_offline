const mongoose=require('mongoose');
const userSchema= new mongoose.Schema({
    name: {
        type: String,
        required: true
    },
    email: {
        type: String,
        required: true,
        unique: true
    },
    password: {
        type: String,
        required: true
    },
    image: {
        type: String
    },
    age:{
        type: Number
    },
    gender: {
        type: String
    },
    address: {
        type: String
    }
});

module.exports= mongoose.model('Users', userSchema);

