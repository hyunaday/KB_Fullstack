import{i as s}from"./index-COj7gA67.js";const e="/api/member",o={"Content-Type":"multipart/form-data"},r={async checkUsername(a){const{data:n}=await s.get(`${e}/checkusername/${a}`);return console.log("AUTH GET CHECKUSERNAME",n),n},async create(a){const n=new FormData;n.append("username",a.username),n.append("email",a.email),n.append("password",a.password),a.avatar&&n.append("avatar",a.avatar);const{data:t}=await s.post(e,n,o);return console.log("AUTH POST: ",t),t},async update(a){const n=new FormData;n.append("username",a.username),n.append("password",a.password),n.append("email",a.email),a.avatar&&n.append("avatar",a.avatar);const{data:t}=await s.put(`${e}/${a.username}`,n,o);return console.log("AUTH PUT: ",t),t},async changePassword(a){const{data:n}=await s.put(`${e}/${a.username}/changepassword`,a);return console.log(" PUT: ",n),n}};export{r as a};
