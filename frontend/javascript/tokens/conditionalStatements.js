let age = 18;
let gender = "female";
// if statement
// if(age>=18){
//     console.log("eligible to vote");
// }

// else if or if else statement
// if(age>=18){
//     console.log("eligible to vote");

// }else{
//     console.log("not eligible to vote");
// }

//  nested if statements
// if(age>=18){
//    if(gender=='male'){
//     console.log('enter into Q 1');
//    }
//    else{
//     console.log('enter into Q 2');
//    }
// }
// else{
//     console.log("not eligible to vote");
// }

//  else if ladder
// let weekday=prompt("enter the weekday");

// if(weekday=="sunday"){ console.log("today is sunday...yummy yummy chicken biriyani");}
// else if(weekday=='monday'){console.log("today is monday...idly....!!!!!");}
// else if(weekday=='tuesday'){ console.log("today is tuesday...Dosa...!!!!");}
// else if(weekday=='wednesday'){console.log("today is wednesday....pulihora....!!!");}
// else if(weekday=='thursday'){console.log("today is thursday...Uttapam...!!!");}
// else if(weekday=='friday'){console.log("today is friday...pongal...!!!");}
// else if(weekday=='saturday'){console.log("today is saturday...poori");}
// else{console.log("invalid day");}

let choice = prompt(
  "enter the choice \n1.Kids Wear" +
    " \n2.Mens Wear \n3.Womens Wear \n4.Sports Wear "
);

let key = parseInt(choice); //converts string into integer
console.log(choice, typeof choice);
console.log(key, typeof key);
switch (key) {
  case 1:
    {
      console.log("kids wear ....!!!");
    }
    break;
  case 2:
    {
      console.log("mens wear ....!!!");
      console.log("mens wear ....!!!");
    }
    break;
  case 3:
    console.log("womens wear ....!!!");
    break;
  case 4:
    console.log("sports wear ....!!!");
    break;
  default:
    console.log("invalid choice");
    break;
}
