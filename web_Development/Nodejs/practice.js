// const math=require('./math')
// console.log("hello jagadeesh")
// //const{add,sub}=math;//we can do like this also
// //direct call console.log(add(1,2))
// console.log(math.add(1,2))
// console.log(math.sub(1,2))

// const data=require('./data.json')
// console.log(data.address.village)
//const path=require("node:path");
// console.log(__filename);
// console.log(__dirname);

// console.log(path.basename(__filename));
// console.log(path.basename(__dirname));

// console.log(path.extname(__filename));
// console.log(path.extname(__dirname));

// console.log(path.parse(__filename));
//console.log(path.join("folder1","folder2",__filename));

// function greet(name){
//     console.log(`hello ${name}` );
// }

// function greetjag(greetfn){
//     const name="jagadeesh";
//     greetfn(name);
// }
// greetjag(greet);
// const EventEmitter=require("node:events");
// const emitter=new EventEmitter();
// emitter.on("order shirt",(size,topping)=>{
//     console.log(`order is on the way with${size}`);
// });
// emitter.emit("order shirt","large","small");

// const pizzashop=require('./pizza-class');
// const Drink=require('./drink');
// const shop=new pizzashop();
// const drink=new Drink();
// shop.on("order",(size,topping)=>{
//     console.log(`order received baking a ${size} pizza with ${topping}`);
//     drink.server(size);
// });
// shop.order("large","mushrooms");
// shop.displayorderNumber();

// const buffer=new Buffer.from("jagadeesh");
// console.log(buffer.toJSON());
const fs=require("node:fs");
// const filecontent=fs.readFileSync("./file.txt","utf-8");
// console.log(filecontent);
// fs.readFile('./file.txt','utf-8',(error,data)=>{
// if(error){
//     console.log(error);
// }else{
//     console.log(data);
// }
// })
// fs.writeFileSync("./greet.txt","hello jagadeesh");
// fs.writeFile("./greet.txt","hello venky",(err)=>{
//     if(err){
//         console.log(err);
//     }else{
//         console.log("file written done");
//     }
// });

// const readablestream=fs.createReadStream("./file.txt",{
//     encoding:"utf-8",
// });
// const writaablestream=fs.createWriteStream("./greet.txt");
// readablestream.on("data",(chunk)=>{
//     console.log(chunk);
//     writaablestream.write(chunk);
// });
//readablestream.pipe(writaablestream);
 const http=require("node:http");
// const superhero={
//     firstname:"iron",
//     lastname:"man",
// };
//const server=http.createServer((req,res)=>{
//res.writeHead(200,"text/html");
// const html=fs.readFileSync("./index.html","utf-8");
// res.end(html);
// fs.createReadStream(__dirname+"/index.html").pipe(res);
// });

// server.listen(3000,()=>{
//     console.log("server is running...");
// });

// const server=http.createServer((req,res)=>{
//     const name="jagadeesh";
// let html=fs.readFileSync('./index.html','utf-8')
// html=html.replace("{{name}}",name);
// res.end(html);
// //fs.createReadStream('./index.html').pipe(res);
// });

// server.listen(3000,()=>{
//     console.log("server is running...");
// });

// const server=http.createServer((req,res)=>{
//     const superhero={
//         firstname:"iron",
//         lastname:"man"
//     };
// if(req.url==='/'){
//     res.writeHead(200,{"content-type":"text/plain"});
//     res.end("Home page");
// }
// else if(req.url==="/about"){
//     res.writeHead(200,{"content-type":"text/plain"});
//     res.end("about  page");
// }
// else if(req.url==="/api"){
//     res.writeHead(200,{"content-type":"application/json"});
//     res.end(JSON.stringify(superhero));
// }
// else{
//     res.writeHead(404);
//     res.end('page not found');
// }
// });

// server.listen(3000,()=>{
//     console.log("server is running...");
// })
// console.log("first");
// fs.readFile('./file.txt','utf-8',(err,data)=>{
//     console.log("file content");
// });
// console.log("last"); 