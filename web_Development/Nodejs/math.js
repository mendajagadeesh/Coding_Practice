const add=(x,y)=>{
    return x+y;
}
const sub=(x,y)=>{
    return x-y;
}
//module.exports=add;//pattern1.

//pattern 2
//also write module.export=(x,y)=>{
  //  return x+y;
//}
//pattern 3.

module.exports={add,sub}
//pattern 4
//module.export add=(x,y)=>{return x+y} direct export...