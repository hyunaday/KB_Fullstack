import{l as B,u as C,r as V,b as d,o as u,d as m,e as t,w as v,v as y,F as k,m as q,g as n,h as A,t as F}from"./index-tpR0TSGK.js";import{b as f}from"./boardApi-Bakbw6Jy.js";import"./index-COj7gA67.js";const U=t("h1",null,[t("i",{class:"fa-regular fa-pen-to-square"}),n(" 글 수정")],-1),D={class:"mb-3 mt-3"},M=t("label",{for:"title",class:"form-label"}," 제목 ",-1),N=t("div",{class:"invalid-feedback"},"제목은 필수 요소입니다.",-1),R={class:"mb-3 mt-3"},S=t("label",{class:"form-label"}," 기존 첨부파일 ",-1),T=t("i",{class:"fa-solid fa-paperclip"},null,-1),E=["onClick"],I={class:"mb-3 mt-3"},L=t("label",{for:"files",class:"form-label"}," 첨부파일 ",-1),P={class:"mb-3 mt-3"},$=t("label",{for:"content",class:"form-label"}," 내용 ",-1),j=t("button",{type:"submit",class:"btn btn-primary me-3"},[t("i",{class:"fa-solid fa-check"}),n(" 확인 ")],-1),z=t("i",{class:"fa-solid fa-undo"},null,-1),G=t("i",{class:"fa-solid fa-arrow-left"},null,-1),W={__name:"BoardUpdatePage",setup(H){const p=B(),_=C(),c=p.params.no,e=V({}),i=d([]),o=d({}),r=d(null),g=()=>{_.push({name:"board/detail",params:{no:c}})},w=async(a,l)=>{if(!confirm(l+"을 삭제할까요?"))return;await f.deleteAttachment(a);const s=i.value.findIndex(h=>h.no===a);i.value.splice(s,1)},x=async()=>{confirm("수정할까요?")&&(r.value.files.length>0&&(e.files=r.value.files),await f.update(e),_.push({name:"board/detail",params:{no:c},query:p.query}))},b=()=>{e.no=o.value.no,e.title=o.value.title,e.writer=o.value.writer,e.content=o.value.content,console.log(e)};return(async()=>{const a=await f.get(c);o.value={...a},i.value=a.attaches,b()})(),(a,l)=>(u(),m(k,null,[U,t("form",{onSubmit:A(x,["prevent"])},[t("div",D,[M,v(t("input",{type:"text",class:"form-control",placeholder:"제목",id:"title","onUpdate:modelValue":l[0]||(l[0]=s=>e.title=s)},null,512),[[y,e.title]]),N]),t("div",R,[S,(u(!0),m(k,null,q(i.value,s=>(u(),m("div",{key:s.no,class:"attach"},[T,n(" "+F(s.filename)+" ",1),t("i",{class:"fa-solid fa-trash-can text-danger ms-2",onClick:h=>w(s.no,s.filename)},null,8,E)]))),128))]),t("div",I,[L,t("input",{type:"file",class:"form-control",placeholder:"첨부파일",id:"files",ref_key:"files",ref:r,multiple:""},null,512)]),t("div",P,[$,v(t("textarea",{class:"form-control",placeholder:"내용",id:"content","onUpdate:modelValue":l[1]||(l[1]=s=>e.content=s),rows:"10"},null,512),[[y,e.content]])]),t("div",{class:"my-5 text-center"},[j,t("button",{type:"button",class:"btn btn-primary me-3",onClick:b},[z,n(" 취소 ")]),t("button",{class:"btn btn-primary",onClick:g},[G,n(" 돌아가기 ")])])],32)],64))}};export{W as default};
