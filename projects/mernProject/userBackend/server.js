const express=require('express'); // to deal with express server
const mongoose=require('mongoose');// to deal with db
const cors=require('cors');// to deal with frontend cors
const env=require('dotenv'); // to deal with environment variables
const userRoutes=require('./routes/userRoute');//to deal with end points


//creating application
const app=express();
app.use(cors()); //application middleware to connect frontend
app.use(express.json()); //application middleware
app.use('/', userRoutes); //application middleware to use user routes


//connecting to db
mongoose.connect(env.config().parsed.MONGODB_URL, {
  useNewUrlParser: true,
  useUnifiedTopology: true,
  dbName: "userDB"
})
.then(() => {
  console.log("Connected to MongoDB");
  app.listen(env.config().parsed.PORT, () => {
    console.log(`Server running on port ${env.config().parsed.PORT}`);
  });
})
.catch((error) => {
  console.error("MongoDB connection error:", error);
});



