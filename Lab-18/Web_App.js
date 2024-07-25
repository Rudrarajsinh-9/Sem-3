const http = require('http');

server = http.createServer((req,res)=>{
	console.log(req.url);

  if(req.url==="/wolverine")
  {
    res.end("Get out bitch");
  }
  else if(req.url==="/Soldier_Boy")
  {
      res.end("Hello I'm Soldier Boy!!!!!");
  }
  else if(req.url==="/Loki")
  {
      res.end("I am Loki");
  }
  else if(req.url==="/Spider")
  {
      res.end("Piew Piew Your Friendly neighbourhood Spider-Man is here");
  }
  else if(req.url==="/Deadpool")
  {
      res.end("X-Force's Member");
  }
});

server.listen(1507);