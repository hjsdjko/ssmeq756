(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-anjianxinxi-add-or-update"],{"1ec5":function(r,i,e){var o=e("24fb");i=o(!1),i.push([r.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.container[data-v-0d1bd14e]{padding:%?20?%}.content[data-v-0d1bd14e]:after{position:fixed;top:0;right:0;left:0;bottom:0;content:"";background-image:url(http://codegen.caihongy.cn/20220301/d67240b0559f478e8e8f98b806fde837.png);background-attachment:fixed;background-size:cover;background-position:50%}uni-textarea[data-v-0d1bd14e]{border:%?1?% solid #eee;border-radius:%?20?%;padding:%?20?%}.title[data-v-0d1bd14e]{width:%?180?%}.avator[data-v-0d1bd14e]{width:%?150?%;height:%?60?%}.right-input[data-v-0d1bd14e]{-webkit-box-flex:1;-webkit-flex:1;flex:1;text-align:left;padding:0 %?24?%}.cu-form-group.active[data-v-0d1bd14e]{-webkit-box-pack:justify;-webkit-justify-content:space-between;justify-content:space-between}.btn[data-v-0d1bd14e]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center;-webkit-flex-wrap:wrap;flex-wrap:wrap;padding:%?20?% 0}.cu-form-group[data-v-0d1bd14e]{padding:0 %?24?%;background-color:initial;min-height:inherit}.cu-form-group + .cu-form-group[data-v-0d1bd14e]{border:0}.cu-form-group uni-input[data-v-0d1bd14e]{padding:0 %?30?%}.uni-input[data-v-0d1bd14e]{padding:0 %?30?%}.cu-form-group uni-textarea[data-v-0d1bd14e]{padding:%?30?%;margin:0}.cu-form-group uni-picker[data-v-0d1bd14e]::after{line-height:%?60?%}.select .uni-input[data-v-0d1bd14e]{line-height:%?60?%}.input .right-input[data-v-0d1bd14e]{line-height:%?60?%}',""]),r.exports=i},"4bc5":function(r,i,e){"use strict";var o=e("ca8e"),t=e.n(o);t.a},ca8e:function(r,i,e){var o=e("1ec5");"string"===typeof o&&(o=[[r.i,o,""]]),o.locals&&(r.exports=o.locals);var t=e("4f06").default;t("42b59374",o,!0,{sourceMap:!1,shadowMode:!1})},dfc4:function(r,i,e){"use strict";e.r(i);var o=e("ee47"),t=e.n(o);for(var a in o)"default"!==a&&function(r){e.d(i,r,(function(){return o[r]}))}(a);i["default"]=t.a},eb32:function(r,i,e){"use strict";e.r(i);var o=e("fc83"),t=e("dfc4");for(var a in t)"default"!==a&&function(r){e.d(i,r,(function(){return t[r]}))}(a);e("4bc5");var n,d=e("f0c5"),s=Object(d["a"])(t["default"],o["b"],o["c"],!1,null,"0d1bd14e",null,!1,o["a"],n);i["default"]=s.exports},ee47:function(r,i,e){"use strict";var o=e("4ea4");Object.defineProperty(i,"__esModule",{value:!0}),i.default=void 0,e("a481"),e("c5f6"),e("f559"),e("ac6a"),e("28a5"),e("96cf");var t=o(e("3b8d")),a=o(e("e2b1")),n={data:function(){return{cross:"",ruleForm:{xingming:"",jinqizhaopian:"",chuanzhexiguan:"",changqudidian:"",xingbie:"",nianling:"",kouyin:"",anjianjindu:"未结案",zoushimiaoshu:"",baobeishijian:"",baobeididian:"",yonghuming:"",shouji:"",crossuserid:"",crossrefid:"",userid:""},xingbieOptions:[],xingbieIndex:0,anjianjinduOptions:[],anjianjinduIndex:0,user:{},ro:{xingming:!1,jinqizhaopian:!1,chuanzhexiguan:!1,changqudidian:!1,xingbie:!1,nianling:!1,kouyin:!1,anjianjindu:!1,zoushimiaoshu:!1,baobeishijian:!1,baobeididian:!1,yonghuming:!1,shouji:!1,crossuserid:!1,crossrefid:!1,userid:!1}}},components:{wPicker:a.default},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(){var r=(0,t.default)(regeneratorRuntime.mark((function r(i){var e,o,t,a;return regeneratorRuntime.wrap((function(r){while(1)switch(r.prev=r.next){case 0:return this.ruleForm.baobeishijian=this.$utils.getCurDateTime(),e=uni.getStorageSync("nowTable"),r.next=4,this.$api.session(e);case 4:if(o=r.sent,this.user=o.data,this.ruleForm.yonghuming=this.user.yonghuming,this.ro.yonghuming=!0,this.ruleForm.shouji=this.user.shouji,this.ro.shouji=!0,this.xingbieOptions="男,女".split(","),this.anjianjinduOptions="未结案,已结案".split(","),this.ruleForm.userid=uni.getStorageSync("userid"),i.refid&&(this.ruleForm.refid=i.refid,this.ruleForm.nickname=uni.getStorageSync("nickname")),!i.id){r.next=20;break}return this.ruleForm.id=i.id,r.next=18,this.$api.info("anjianxinxi",this.ruleForm.id);case 18:o=r.sent,this.ruleForm=o.data;case 20:if(this.cross=i.cross,!i.cross){r.next=92;break}t=uni.getStorageSync("crossObj"),r.t0=regeneratorRuntime.keys(t);case 24:if((r.t1=r.t0()).done){r.next=92;break}if(a=r.t1.value,"xingming"!=a){r.next=30;break}return this.ruleForm.xingming=t[a],this.ro.xingming=!0,r.abrupt("continue",24);case 30:if("jinqizhaopian"!=a){r.next=34;break}return this.ruleForm.jinqizhaopian=t[a],this.ro.jinqizhaopian=!0,r.abrupt("continue",24);case 34:if("chuanzhexiguan"!=a){r.next=38;break}return this.ruleForm.chuanzhexiguan=t[a],this.ro.chuanzhexiguan=!0,r.abrupt("continue",24);case 38:if("changqudidian"!=a){r.next=42;break}return this.ruleForm.changqudidian=t[a],this.ro.changqudidian=!0,r.abrupt("continue",24);case 42:if("xingbie"!=a){r.next=46;break}return this.ruleForm.xingbie=t[a],this.ro.xingbie=!0,r.abrupt("continue",24);case 46:if("nianling"!=a){r.next=50;break}return this.ruleForm.nianling=t[a],this.ro.nianling=!0,r.abrupt("continue",24);case 50:if("kouyin"!=a){r.next=54;break}return this.ruleForm.kouyin=t[a],this.ro.kouyin=!0,r.abrupt("continue",24);case 54:if("anjianjindu"!=a){r.next=58;break}return this.ruleForm.anjianjindu=t[a],this.ro.anjianjindu=!0,r.abrupt("continue",24);case 58:if("zoushimiaoshu"!=a){r.next=62;break}return this.ruleForm.zoushimiaoshu=t[a],this.ro.zoushimiaoshu=!0,r.abrupt("continue",24);case 62:if("baobeishijian"!=a){r.next=66;break}return this.ruleForm.baobeishijian=t[a],this.ro.baobeishijian=!0,r.abrupt("continue",24);case 66:if("baobeididian"!=a){r.next=70;break}return this.ruleForm.baobeididian=t[a],this.ro.baobeididian=!0,r.abrupt("continue",24);case 70:if("yonghuming"!=a){r.next=74;break}return this.ruleForm.yonghuming=t[a],this.ro.yonghuming=!0,r.abrupt("continue",24);case 74:if("shouji"!=a){r.next=78;break}return this.ruleForm.shouji=t[a],this.ro.shouji=!0,r.abrupt("continue",24);case 78:if("crossuserid"!=a){r.next=82;break}return this.ruleForm.crossuserid=t[a],this.ro.crossuserid=!0,r.abrupt("continue",24);case 82:if("crossrefid"!=a){r.next=86;break}return this.ruleForm.crossrefid=t[a],this.ro.crossrefid=!0,r.abrupt("continue",24);case 86:if("userid"!=a){r.next=90;break}return this.ruleForm.userid=t[a],this.ro.userid=!0,r.abrupt("continue",24);case 90:r.next=24;break;case 92:this.styleChange();case 93:case"end":return r.stop()}}),r,this)})));function i(i){return r.apply(this,arguments)}return i}(),methods:{styleChange:function(){this.$nextTick((function(){}))},baobeishijianConfirm:function(r){console.log(r),this.ruleForm.baobeishijian=r.result,this.$forceUpdate()},xingbieChange:function(r){this.xingbieIndex=r.target.value,this.ruleForm.xingbie=this.xingbieOptions[this.xingbieIndex]},anjianjinduChange:function(r){this.anjianjinduIndex=r.target.value,this.ruleForm.anjianjindu=this.anjianjinduOptions[this.anjianjinduIndex]},jinqizhaopianTap:function(){var r=this;this.$api.upload((function(i){r.ruleForm.jinqizhaopian="upload/"+i.file,r.$forceUpdate(),r.$nextTick((function(){r.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var r=(0,t.default)(regeneratorRuntime.mark((function r(){var i,e,o,t,a,n,d,s,u,l;return regeneratorRuntime.wrap((function(r){while(1)switch(r.prev=r.next){case 0:if(!this.ruleForm.nianling||this.$validate.isIntNumer(this.ruleForm.nianling)){r.next=3;break}return this.$utils.msg("年龄应输入整数"),r.abrupt("return");case 3:if(!this.cross){r.next=19;break}if(t=uni.getStorageSync("statusColumnName"),a=uni.getStorageSync("statusColumnValue"),""==t){r.next=19;break}if(n=uni.getStorageSync("crossObj"),t.startsWith("[")){r.next=15;break}for(d in n)d==t&&(n[d]=a);return s=uni.getStorageSync("crossTable"),r.next=13,this.$api.update("".concat(s),n);case 13:r.next=19;break;case 15:i=Number(uni.getStorageSync("userid")),e=n["id"],o=uni.getStorageSync("statusColumnName"),o=o.replace(/\[/,"").replace(/\]/,"");case 19:if(!e||!i){r.next=41;break}return this.ruleForm.crossuserid=i,this.ruleForm.crossrefid=e,u={page:1,limit:10,crossuserid:i,crossrefid:e},r.next=25,this.$api.list("anjianxinxi",u);case 25:if(l=r.sent,!(l.data.total>=o)){r.next=31;break}return this.$utils.msg(uni.getStorageSync("tips")),r.abrupt("return",!1);case 31:if(!this.ruleForm.id){r.next=36;break}return r.next=34,this.$api.update("anjianxinxi",this.ruleForm);case 34:r.next=38;break;case 36:return r.next=38,this.$api.add("anjianxinxi",this.ruleForm);case 38:this.$utils.msgBack("提交成功");case 39:r.next=49;break;case 41:if(!this.ruleForm.id){r.next=46;break}return r.next=44,this.$api.update("anjianxinxi",this.ruleForm);case 44:r.next=48;break;case 46:return r.next=48,this.$api.add("anjianxinxi",this.ruleForm);case 48:this.$utils.msgBack("提交成功");case 49:case"end":return r.stop()}}),r,this)})));function i(){return r.apply(this,arguments)}return i}(),optionsChange:function(r){this.index=r.target.value},bindDateChange:function(r){this.date=r.target.value},getDate:function(r){var i=new Date,e=i.getFullYear(),o=i.getMonth()+1,t=i.getDate();return"start"===r?e-=60:"end"===r&&(e+=2),o=o>9?o:"0"+o,t=t>9?t:"0"+t,"".concat(e,"-").concat(o,"-").concat(t)},toggleTab:function(r){this.$refs[r].show()}}};i.default=n},fc83:function(r,i,e){"use strict";var o={"w-picker":e("e2b1").default},t=function(){var r=this,i=r.$createElement,e=r._self._c||i;return e("v-uni-view",{staticClass:"content"},[e("v-uni-form",{staticClass:"app-update-pv"},[e("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0 16rpx",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0 0 20rpx 0",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 1)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[e("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("姓名")]),e("v-uni-input",{style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",borderColor:"rgba(31, 165, 216, 1)",backgroundColor:"rgba(120, 218, 255, 1)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"20rpx 0",borderWidth:"0 10rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:r.ro.xingming,placeholder:"姓名"},model:{value:r.ruleForm.xingming,callback:function(i){r.$set(r.ruleForm,"xingming",i)},expression:"ruleForm.xingming"}})],1),e("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0 16rpx",boxShadow:"0 0 0px rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 1)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"},on:{click:function(i){arguments[0]=i=r.$handleEvent(i),r.jinqizhaopianTap.apply(void 0,arguments)}}},[e("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("近期照片")]),e("v-uni-view",{staticClass:"right-input",staticStyle:{padding:"0"}},[r.ruleForm.jinqizhaopian?e("v-uni-image",{staticClass:"avator",style:{padding:"0",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",borderRadius:"100%",borderWidth:"0",width:"88rpx",borderStyle:"solid",height:"88rpx"},attrs:{src:r.baseUrl+r.ruleForm.jinqizhaopian,mode:"aspectFill"}}):e("v-uni-image",{staticClass:"avator",style:{padding:"0",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",borderRadius:"100%",borderWidth:"0",width:"88rpx",borderStyle:"solid",height:"88rpx"},attrs:{src:"../../static/gen/upload.png",mode:"aspectFill"}})],1)],1),e("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0 16rpx",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0 0 20rpx 0",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 1)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[e("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("穿着习惯")]),e("v-uni-input",{style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",borderColor:"rgba(31, 165, 216, 1)",backgroundColor:"rgba(120, 218, 255, 1)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"20rpx 0",borderWidth:"0 10rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:r.ro.chuanzhexiguan,placeholder:"穿着习惯"},model:{value:r.ruleForm.chuanzhexiguan,callback:function(i){r.$set(r.ruleForm,"chuanzhexiguan",i)},expression:"ruleForm.chuanzhexiguan"}})],1),e("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0 16rpx",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0 0 20rpx 0",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 1)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[e("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("常去地点")]),e("v-uni-input",{style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",borderColor:"rgba(31, 165, 216, 1)",backgroundColor:"rgba(120, 218, 255, 1)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"20rpx 0",borderWidth:"0 10rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:r.ro.changqudidian,placeholder:"常去地点"},model:{value:r.ruleForm.changqudidian,callback:function(i){r.$set(r.ruleForm,"changqudidian",i)},expression:"ruleForm.changqudidian"}})],1),e("v-uni-view",{staticClass:"cu-form-group select",style:{padding:"0 16rpx",boxShadow:"0 0 0px rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 1)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[e("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("性别")]),e("v-uni-picker",{attrs:{value:r.xingbieIndex,range:r.xingbieOptions},on:{change:function(i){arguments[0]=i=r.$handleEvent(i),r.xingbieChange.apply(void 0,arguments)}}},[e("v-uni-view",{staticClass:"uni-input",style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",backgroundColor:"rgba(120, 218, 255, 1)",borderColor:"rgba(31, 165, 216, 1)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"20rpx 0",borderWidth:"0 10rpx",width:"calc(100% - 160rpx)",lineHeight:"60rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v(r._s(r.ruleForm.xingbie?r.ruleForm.xingbie:"请选择性别"))])],1)],1),e("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0 16rpx",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0 0 20rpx 0",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 1)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[e("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("年龄")]),e("v-uni-input",{style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",borderColor:"rgba(31, 165, 216, 1)",backgroundColor:"rgba(120, 218, 255, 1)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"20rpx 0",borderWidth:"0 10rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:r.ro.nianling,placeholder:"年龄"},model:{value:r.ruleForm.nianling,callback:function(i){r.$set(r.ruleForm,"nianling",i)},expression:"ruleForm.nianling"}})],1),e("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0 16rpx",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0 0 20rpx 0",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 1)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[e("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("口音")]),e("v-uni-input",{style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",borderColor:"rgba(31, 165, 216, 1)",backgroundColor:"rgba(120, 218, 255, 1)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"20rpx 0",borderWidth:"0 10rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:r.ro.kouyin,placeholder:"口音"},model:{value:r.ruleForm.kouyin,callback:function(i){r.$set(r.ruleForm,"kouyin",i)},expression:"ruleForm.kouyin"}})],1),e("v-uni-view",{staticClass:"cu-form-group select",style:{padding:"0 16rpx",boxShadow:"0 0 0px rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 1)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[e("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("案件进度")]),e("v-uni-picker",{attrs:{value:r.anjianjinduIndex,range:r.anjianjinduOptions},on:{change:function(i){arguments[0]=i=r.$handleEvent(i),r.anjianjinduChange.apply(void 0,arguments)}}},[e("v-uni-view",{staticClass:"uni-input",style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",backgroundColor:"rgba(120, 218, 255, 1)",borderColor:"rgba(31, 165, 216, 1)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"20rpx 0",borderWidth:"0 10rpx",width:"calc(100% - 160rpx)",lineHeight:"60rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v(r._s(r.ruleForm.anjianjindu?r.ruleForm.anjianjindu:"请选择案件进度"))])],1)],1),e("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0 16rpx",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0 0 20rpx 0",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 1)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[e("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("走失描述")]),e("v-uni-input",{style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",borderColor:"rgba(31, 165, 216, 1)",backgroundColor:"rgba(120, 218, 255, 1)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"20rpx 0",borderWidth:"0 10rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:r.ro.zoushimiaoshu,placeholder:"走失描述"},model:{value:r.ruleForm.zoushimiaoshu,callback:function(i){r.$set(r.ruleForm,"zoushimiaoshu",i)},expression:"ruleForm.zoushimiaoshu"}})],1),e("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0 16rpx",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0 0 20rpx 0",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 1)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[e("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("报备时间")]),e("v-uni-input",{style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",borderColor:"rgba(31, 165, 216, 1)",backgroundColor:"rgba(120, 218, 255, 1)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"20rpx 0",borderWidth:"0 10rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"solid",height:"60rpx"},attrs:{placeholder:"报备时间"},on:{click:function(i){arguments[0]=i=r.$handleEvent(i),r.toggleTab("baobeishijian")}},model:{value:r.ruleForm.baobeishijian,callback:function(i){r.$set(r.ruleForm,"baobeishijian",i)},expression:"ruleForm.baobeishijian"}})],1),e("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0 16rpx",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0 0 20rpx 0",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 1)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[e("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("报备地点")]),e("v-uni-input",{style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",borderColor:"rgba(31, 165, 216, 1)",backgroundColor:"rgba(120, 218, 255, 1)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"20rpx 0",borderWidth:"0 10rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:r.ro.baobeididian,placeholder:"报备地点"},model:{value:r.ruleForm.baobeididian,callback:function(i){r.$set(r.ruleForm,"baobeididian",i)},expression:"ruleForm.baobeididian"}})],1),e("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0 16rpx",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0 0 20rpx 0",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 1)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[e("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("用户名")]),e("v-uni-input",{style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",borderColor:"rgba(31, 165, 216, 1)",backgroundColor:"rgba(120, 218, 255, 1)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"20rpx 0",borderWidth:"0 10rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:r.ro.yonghuming,placeholder:"用户名"},model:{value:r.ruleForm.yonghuming,callback:function(i){r.$set(r.ruleForm,"yonghuming",i)},expression:"ruleForm.yonghuming"}})],1),e("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0 16rpx",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0 0 20rpx 0",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 1)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[e("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("手机")]),e("v-uni-input",{style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",borderColor:"rgba(31, 165, 216, 1)",backgroundColor:"rgba(120, 218, 255, 1)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"20rpx 0",borderWidth:"0 10rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:r.ro.shouji,placeholder:"手机"},model:{value:r.ruleForm.shouji,callback:function(i){r.$set(r.ruleForm,"shouji",i)},expression:"ruleForm.shouji"}})],1),e("v-uni-view",{staticClass:"btn"},[e("v-uni-button",{staticClass:"bg-red",style:{padding:"0",boxShadow:"0px 6rpx 12rpx rgba(0, 0, 0, 0.16)",margin:"20rpx auto",backgroundColor:"rgba(120, 218, 255, 1)",borderColor:"#409EFF",borderRadius:"20rpx 0",color:"#fff",borderWidth:"0",width:"60%",fontSize:"28rpx",borderStyle:"solid",height:"80rpx"},on:{click:function(i){arguments[0]=i=r.$handleEvent(i),r.onSubmitTap.apply(void 0,arguments)}}},[r._v("提交")])],1)],1),e("w-picker",{ref:"baobeishijian",attrs:{mode:"dateTime",step:"1",current:!1,hasSecond:!1,themeColor:"#333333"},on:{confirm:function(i){arguments[0]=i=r.$handleEvent(i),r.baobeishijianConfirm.apply(void 0,arguments)}}})],1)},a=[];e.d(i,"b",(function(){return t})),e.d(i,"c",(function(){return a})),e.d(i,"a",(function(){return o}))}}]);