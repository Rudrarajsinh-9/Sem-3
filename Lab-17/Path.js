const path = require("path");

filePath = "C:\\Users\\rudra\\OneDrive\\Desktop\\programming\\Web Technology\\LAB 18\\"

ans1 = path.normalize('C:\\Users\\rudra\\OneDrive\\Desktop\\programming\\Web Technology\\LAB 18\\..');
console.log("normalize",ans1);


ans2 = path.join(ans1);
console.log("join = ",ans2);

ans3 = path.resolve(ans1, ans2);
console.log("resolve = ",ans3);


ans4 = path.relative(ans1, ans3);
console.log("relative = ",ans4);


ans5 = path.dirname(filePath);
console.log("dirname = ",ans5);


ans6 = path.basename(filePath);
console.log("basename = ",ans6);


ans7 = path.extname(filePath);
console.log("extname = ",ans7);
