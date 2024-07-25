const http = require("http");
const fs = require("fs");
const cp = require("child_process");

const server = http.createServer((req,res)=>{
  if(req.url==="/")
  {
    res.write("<a href='/home'><button>home</button></a>");
    res.write("<a href='/about'><button>about</button></a>");
    res.write("<a href='/contact'><button>contact</button></a>");
    res.end();
  }
  else if(req.url==="/home")
  {
    res.end("Welcome Home");
  }
  else if(req.url==="/about")
  {
    res.end("L F G !!!!!");
  }
  else if(req.url==="/contact")
  {
    res.end("Contact less");
  }
});

server.listen(9999);