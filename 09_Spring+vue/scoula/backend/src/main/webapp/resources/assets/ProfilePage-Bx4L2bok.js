import{a as g,b as c,r as w,c as y,i as k,o as m,d,e as a,g as e,t as u,w as p,v as f,f as x,j as V,k as S,h as N}from"./index-tpR0TSGK.js";import{a as P}from"./authApi-RPtBZ20F.js";import"./index-COj7gA67.js";const B={class:"mt-5 mx-auto",style:{width:"500px"}},C=a("h1",null,[a("i",{class:"fa-solid fa-user-gear my-3"}),e(" 회원 정보")],-1),j={class:"mb-3 mt-3"},A={class:"mb-3 mt-3"},D=a("label",{for:"avatar",class:"form-label"},[a("i",{class:"fa-solid fa-user-astronaut"}),e(" 아바타 이미지: ")],-1),E={class:"mb-3 mt-3"},M=a("label",{for:"email",class:"form-label"},[a("i",{class:"fa-solid fa-envelope"}),e(" email ")],-1),T={class:"mb-3"},U=a("label",{for:"password",class:"form-label"},[a("i",{class:"fa-solid fa-lock"}),e(" 비밀번호: ")],-1),$={key:0,class:"text-danger"},q={class:"text-center"},z=["disabled"],F=a("i",{class:"fa-solid fa-user-plus"},null,-1),G=a("i",{class:"fa-solid fa-lock"},null,-1),L={__name:"ProfilePage",setup(H){const t=g(),r=c(null),_=`/api/member/${t.username}/avatar`,s=w({username:t.username,email:t.email,password:"",avatar:null}),o=c(""),v=y(()=>!s.email||!s.password),h=async()=>{if(confirm("수정하시겠습니까?")&&r.value.files.length>0){s.avatar=r.value.files[0];try{await P.update(s),o.value="",t.changeProfile(s),alert("정보를 수정하였습니다.")}catch(n){o.value=n.response.data}}};return(n,l)=>{const b=k("router-link");return m(),d("div",B,[C,a("form",{onSubmit:N(h,["prevent"])},[a("div",j,[a("img",{src:_,class:"avatar avatar-lg me-4"}),e(" "+u(s.username),1)]),a("div",A,[D,a("input",{type:"file",class:"form-control",ref_key:"avatar",ref:r,id:"avatar",accept:"image/png, image/jpeg"},null,512)]),a("div",E,[M,p(a("input",{type:"email",class:"form-control",placeholder:"Email",id:"email","onUpdate:modelValue":l[0]||(l[0]=i=>s.email=i)},null,512),[[f,s.email]])]),a("div",T,[U,p(a("input",{type:"password",class:"form-control",placeholder:"비밀번호",id:"password","onUpdate:modelValue":l[1]||(l[1]=i=>s.password=i)},null,512),[[f,s.password]])]),o.value?(m(),d("div",$,u(o.value),1)):x("",!0),a("div",q,[a("button",{type:"submit",class:"btn btn-primary mt-4 me-3",disabled:v.value},[F,e(" 확인 ")],8,z),V(b,{class:"btn btn-primary mt-4",to:"/auth/changepassword"},{default:S(()=>[G,e(" 비밀번호 변경 ")]),_:1})])],32)])}}};export{L as default};
